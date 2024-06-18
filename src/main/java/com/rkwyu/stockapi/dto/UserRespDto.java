package com.rkwyu.stockapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRespDto {
    private Long id;
    private String name;
    private String role;
    private Boolean active;
}
