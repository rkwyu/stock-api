package com.rkwyu.stockapi.controller.crud;

import java.util.List;

import com.rkwyu.stockapi.dto.AnalystRespDto;
import com.rkwyu.stockapi.dto.CountryRespDto;
import com.rkwyu.stockapi.dto.CurrencyRespDto;
import com.rkwyu.stockapi.dto.EarningRespDto;
import com.rkwyu.stockapi.dto.SourceRespDto;
import com.rkwyu.stockapi.dto.StockRespDto;
import com.rkwyu.stockapi.dto.UserRespDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "CRUD API", description = "for CRUD operations")
public interface CrudControllerDoc {
    @Operation(summary = "Get all analysts", description = "Get all analysts")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
    })
    List<AnalystRespDto> getAllAnalysts();

    @Operation(summary = "Get a analyst by id", description = "Get a analyst by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
    })
    AnalystRespDto getAnalystById(Long id);

    @Operation(summary = "Get all countries", description = "Get all countries")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
    })
    List<CountryRespDto> getAllCountries();

    @Operation(summary = "Get a country by id", description = "Get a country by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
    })
    CountryRespDto getCountryById(Long id);

    @Operation(summary = "Get all currencies", description = "Get all currencies")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
    })
    List<CurrencyRespDto> getAllCurrencies();

    @Operation(summary = "Get a currency by id", description = "Get a currency by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
    })
    CurrencyRespDto getCurrencyById(Long id);

    @Operation(summary = "Get all earnings", description = "Get all earnings")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
    })
    List<EarningRespDto> getAllEarnings();

    @Operation(summary = "Get an earning by id", description = "Get an earning by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
    })
    EarningRespDto getEarningById(Long id);

    @Operation(summary = "Get all sources", description = "Get all sources")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
    })
    List<SourceRespDto> getAllSources();

    @Operation(summary = "Get a source by id", description = "Get a source by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
    })
    SourceRespDto getSourceById(Long id);

    @Operation(summary = "Get all stocks", description = "Get all stocks")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
    })
    List<StockRespDto> getAllStocks();

    @Operation(summary = "Get a stock by id", description = "Get a stock by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
    })
    StockRespDto getStockById(Long id);

    @Operation(summary = "Get all users", description = "Get all users")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
    })
    List<UserRespDto> getAllUsers();

    @Operation(summary = "Get a user by id", description = "Get a user by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation"),
    })
    UserRespDto getUserById(Long id);
}
