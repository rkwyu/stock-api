package com.rkwyu.stockapi.mapper;

import org.mapstruct.Mapper;

import com.rkwyu.stockapi.dto.SourceRespDto;
import com.rkwyu.stockapi.model.Source;

@Mapper(componentModel = "spring")
public interface SourceMapper {

    Source toModel(SourceRespDto dto);

    SourceRespDto toRespDto(Source model);

}
