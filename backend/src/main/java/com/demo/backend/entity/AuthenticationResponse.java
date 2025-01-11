package com.demo.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class AuthenticationResponse {
    private String token;

    public AuthenticationResponse(){}

    public AuthenticationResponse(String token) {
        this.token = token;
    }
}
