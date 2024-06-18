package com.rkwyu.stockapi.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.rkwyu.stockapi.handler.AuthenticationSuccessHandlerImpl;
import com.rkwyu.stockapi.handler.LogoutHandlerImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    AuthenticationSuccessHandlerImpl authenticationSuccessHandlerImpl;
    @Autowired
    LogoutHandlerImpl logoutHandlerImpl;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .cors(Customizer.withDefaults())            // enable CORS for JS client
            .csrf(AbstractHttpConfigurer::disable)      // disable CSRF
            .headers((headers) -> {
                headers
                    .frameOptions((option) -> option.disable());
            })
            .authorizeHttpRequests(authorizeHttpRequests -> {
                authorizeHttpRequests
                    .requestMatchers("/h2-console").permitAll()     // h2 console
                    .requestMatchers("/api/**").permitAll()
                    .requestMatchers("/admin/**").hasAnyRole("ADMIN")
                    .anyRequest().permitAll();
            })
            .formLogin((formLogin) -> {
                formLogin
                    .loginProcessingUrl("/login")
                    .usernameParameter("username")
                    .passwordParameter("password")
                    .successHandler(authenticationSuccessHandlerImpl);
            })
            .httpBasic(Customizer.withDefaults())       // enable HTTP Basic authentication
            .logout((logout) -> {
                logout
                    .logoutUrl("/logout")
                    .addLogoutHandler(logoutHandlerImpl);
            });
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
}
