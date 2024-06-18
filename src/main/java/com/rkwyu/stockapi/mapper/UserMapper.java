package com.rkwyu.stockapi.mapper;

import org.mapstruct.Mapper;

import com.rkwyu.stockapi.dto.UserRespDto;
import com.rkwyu.stockapi.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toModel(UserRespDto dto);

    UserRespDto toRespDto(User model);

}
