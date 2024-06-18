package com.rkwyu.stockapi.mapper;

import org.mapstruct.Mapper;

import com.rkwyu.stockapi.dto.AnalystRespDto;
import com.rkwyu.stockapi.model.Analyst;

@Mapper(componentModel = "spring")
public interface AnalystMapper {
    
    Analyst toModel(AnalystRespDto dto);

    AnalystRespDto toRespDto(Analyst model);
    
}
