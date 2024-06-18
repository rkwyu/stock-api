package com.rkwyu.stockapi.controller.business;

import org.springframework.http.ResponseEntity;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Alpha Vantage API", description = "for alphavantage.co")
public interface AlphaVantageControllerDoc {

    @Operation(
        summary = "Update company overview",
        description = "Update company overview by symbol"
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "successful operation"),
        @ApiResponse(responseCode = "400", description = "failed operation")
    })
    ResponseEntity<String> updateCompanyOverview(String symbol);
}
