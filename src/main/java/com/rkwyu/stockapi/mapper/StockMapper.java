package com.rkwyu.stockapi.mapper;

import org.mapstruct.Mapper;

import com.rkwyu.stockapi.dto.StockRespDto;
import com.rkwyu.stockapi.model.Stock;

@Mapper(componentModel = "spring")
public interface StockMapper {

    Stock toModel(StockRespDto dto);

    StockRespDto toRespDto(Stock model);

}
