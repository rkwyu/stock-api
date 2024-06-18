package com.rkwyu.stockapi.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EarningRespDto {
    private Long id;
    private LocalDate date;
    private String period;
    private String revenueYoy;
    private BigDecimal revenueYoyPct;
    private String epsYoy;
    private BigDecimal epsYoyPct;
    private SourceRespDto source;
    private StockRespDto stock;
    private CurrencyRespDto currency;
}
