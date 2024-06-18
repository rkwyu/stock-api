package com.rkwyu.stockapi.service.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.rkwyu.stockapi.model.User;
import com.rkwyu.stockapi.repository.UserRepo;

public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByName(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with name: " + username));
        if (!user.getActive()) {
            throw new UsernameNotFoundException("User not active with name: " + username);
        }
        return org.springframework.security.core.userdetails.User
            .withUsername(user.getName())
            .password(user.getPassword())
            .roles(user.getRole())
            .build();
    }
    
}
