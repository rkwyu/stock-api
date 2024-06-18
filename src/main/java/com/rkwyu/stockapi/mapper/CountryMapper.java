package com.rkwyu.stockapi.mapper;

import org.mapstruct.Mapper;

import com.rkwyu.stockapi.dto.CountryRespDto;
import com.rkwyu.stockapi.model.Country;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    Country toModel(CountryRespDto dto);

    CountryRespDto toRespDto(Country model);

}
