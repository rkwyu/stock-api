package com.rkwyu.stockapi.mapper;

import org.mapstruct.Mapper;

import com.rkwyu.stockapi.dto.EarningRespDto;
import com.rkwyu.stockapi.model.Earning;

@Mapper(componentModel = "spring")
public interface EarningMapper {

    Earning toModel(EarningRespDto dto);

    EarningRespDto toRespDto(Earning model);

}
