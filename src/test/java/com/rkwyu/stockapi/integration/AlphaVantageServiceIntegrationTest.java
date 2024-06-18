package com.rkwyu.stockapi.integration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.rkwyu.stockapi.service.business.AlphaVantageService;

@ExtendWith(SpringExtension.class)      // enable Spring support in JUnit5
@SpringBootTest                         // load Spring application context
public class AlphaVantageServiceIntegrationTest {
    // replace bean(s) with Mockito mock(s) in Spring application context
    @MockBean
    AlphaVantageService FutunnService;

    @Test
    void testXXX() {
        
    }
    
}
