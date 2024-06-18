package com.rkwyu.stockapi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.rkwyu.stockapi.repository.StockRepo;
import com.rkwyu.stockapi.service.business.AlphaVantageServiceImpl;

@ExtendWith(MockitoExtension.class)
public class AlphaVantageControllerTest {
    // create mock bean(s)
    @Mock
    private StockRepo stockRepo;

    // inject @Mock to an instance
    @InjectMocks
    private AlphaVantageServiceImpl FutunnService;

    @BeforeEach
    public void setUp() {
        // TODO:
    }

    @Test
    void testUpdateEarningsCalendarsX() {
        // TODO:
    }
}
