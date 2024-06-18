package com.rkwyu.stockapi.mapper;

import org.mapstruct.Mapper;

import com.rkwyu.stockapi.dto.CurrencyRespDto;
import com.rkwyu.stockapi.model.Currency;

@Mapper(componentModel = "spring")
public interface CurrencyMapper {

    Currency toModel(CurrencyRespDto dto);

    CurrencyRespDto toRespDto(Currency model);

}
