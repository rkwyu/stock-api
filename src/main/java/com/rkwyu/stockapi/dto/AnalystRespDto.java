package com.rkwyu.stockapi.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnalystRespDto {
    private Long id;
    private LocalDate date;
    private String rating;
    private BigDecimal buyPct;
    private BigDecimal holdPct;
    private BigDecimal sellPct;
    private SourceRespDto source;
    private StockRespDto stock;
}
