package com.rkwyu.stockapi.controller.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rkwyu.stockapi.service.business.AlphaVantageService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/alpha-vantage")
@Slf4j
public class AlphaVantageController implements AlphaVantageControllerDoc {
    @Autowired
    AlphaVantageService alphaVantageService;

    @RequestMapping(value = "company-overview", method = { RequestMethod.POST, RequestMethod.PUT })
    public ResponseEntity<String> updateCompanyOverview(@RequestParam(value="symbol", required=true) String symbol) {
        try {
            log.info("symbol: " + symbol);
            String ret = alphaVantageService.getCompanyOverview(symbol);
            return ResponseEntity.ok(ret);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        } 
    }

}
