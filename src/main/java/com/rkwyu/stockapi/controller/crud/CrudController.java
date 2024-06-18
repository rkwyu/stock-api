package com.rkwyu.stockapi.controller.crud;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rkwyu.stockapi.dto.AnalystRespDto;
import com.rkwyu.stockapi.dto.CountryRespDto;
import com.rkwyu.stockapi.dto.CurrencyRespDto;
import com.rkwyu.stockapi.dto.EarningRespDto;
import com.rkwyu.stockapi.dto.SourceRespDto;
import com.rkwyu.stockapi.dto.StockRespDto;
import com.rkwyu.stockapi.dto.UserRespDto;
import com.rkwyu.stockapi.mapper.AnalystMapper;
import com.rkwyu.stockapi.mapper.CountryMapper;
import com.rkwyu.stockapi.mapper.CurrencyMapper;
import com.rkwyu.stockapi.mapper.EarningMapper;
import com.rkwyu.stockapi.mapper.SourceMapper;
import com.rkwyu.stockapi.mapper.StockMapper;
import com.rkwyu.stockapi.mapper.UserMapper;
import com.rkwyu.stockapi.service.crud.AnalystService;
import com.rkwyu.stockapi.service.crud.CountryService;
import com.rkwyu.stockapi.service.crud.CurrencyService;
import com.rkwyu.stockapi.service.crud.EarningService;
import com.rkwyu.stockapi.service.crud.SourceService;
import com.rkwyu.stockapi.service.crud.StockService;
import com.rkwyu.stockapi.service.crud.UserService;

@RestController
@RequestMapping("/api")
public class CrudController implements CrudControllerDoc {
    @Autowired
    AnalystMapper analystMapper;
    @Autowired
    CountryMapper countryMapper;
    @Autowired
    CurrencyMapper currencyMapper;
    @Autowired
    EarningMapper earningMapper;
    @Autowired
    SourceMapper sourceMapper;
    @Autowired
    StockMapper stockMapper;
    @Autowired
    UserMapper userMapper;

    @Autowired
    AnalystService analystService;
    @Autowired
    CountryService countryService;
    @Autowired
    CurrencyService currencyService;
    @Autowired
    EarningService earningService;
    @Autowired
    SourceService sourceService;
    @Autowired
    StockService stockService;
    @Autowired
    UserService userService;

    @GetMapping("/analyst")
    public List<AnalystRespDto> getAllAnalysts() {
        return analystService.getAllAnalysts().stream().map(e -> analystMapper.toRespDto(e)).collect(Collectors.toList());
    }

    @GetMapping("/analyst/{id}")
    public AnalystRespDto getAnalystById(@PathVariable Long id) {
        return analystMapper.toRespDto(analystService.getAnalystById(id));
    }

    @GetMapping("/country")
    public List<CountryRespDto> getAllCountries() {
        return countryService.getAllCountries().stream().map(e -> countryMapper.toRespDto(e)).collect(Collectors.toList());
    }

    @GetMapping("/country/{id}")
    public CountryRespDto getCountryById(@PathVariable Long id) {
        return countryMapper.toRespDto(countryService.getCountryById(id));
    }

    @GetMapping("/currency")
    public List<CurrencyRespDto> getAllCurrencies() {
        return currencyService.getAllCurrencies().stream().map(e -> currencyMapper.toRespDto(e)).collect(Collectors.toList());
    }

    @GetMapping("/currency/{id}")
    public CurrencyRespDto getCurrencyById(@PathVariable Long id) {
        return currencyMapper.toRespDto(currencyService.getCurrencyById(id));
    }

    @GetMapping("/earning")
    public List<EarningRespDto> getAllEarnings() {
        return earningService.getAllEarnings().stream().map(e -> earningMapper.toRespDto(e)).collect(Collectors.toList());
    }

    @GetMapping("/earning/{id}")
    public EarningRespDto getEarningById(@PathVariable Long id) {
        return earningMapper.toRespDto(earningService.getEarningById(id));
    }

    @GetMapping("/source")
    public List<SourceRespDto> getAllSources() {
        return sourceService.getAllSources().stream().map(e -> sourceMapper.toRespDto(e)).collect(Collectors.toList());
    }

    @GetMapping("/source/{id}")
    public SourceRespDto getSourceById(@PathVariable Long id) {
        return sourceMapper.toRespDto(sourceService.getSourceById(id));
    }

    @GetMapping("/stock")
    public List<StockRespDto> getAllStocks() {
        return stockService.getAllStocks().stream().map(e -> stockMapper.toRespDto(e)).collect(Collectors.toList());
    }

    @GetMapping("/stock/{id}")
    public StockRespDto getStockById(@PathVariable Long id) {
        return stockMapper.toRespDto(stockService.getStockById(id));
    }

    @GetMapping("/user")
    public List<UserRespDto> getAllUsers() {
        return userService.getAllUsers().stream().map(e -> userMapper.toRespDto(e)).collect(Collectors.toList());
    }

    @GetMapping("/user/{id}")
    public UserRespDto getUserById(@PathVariable Long id) {
        return userMapper.toRespDto(userService.getUserById(id));
    }
}
