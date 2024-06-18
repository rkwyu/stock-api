package com.rkwyu.stockapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockRespDto {
    private Long id;
    private String symbol;
    private String name;
    private Boolean active;
    private CountryRespDto country;
}
