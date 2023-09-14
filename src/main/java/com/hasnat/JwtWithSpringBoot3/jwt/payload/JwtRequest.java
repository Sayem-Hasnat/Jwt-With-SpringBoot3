package com.hasnat.JwtWithSpringBoot3.jwt.payload;

import lombok.Data;

@Data
public class JwtRequest {
    private String email;
    private String password;
}
