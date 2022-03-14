package com.example.basicauth.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuariConsultaDTO {
    private String username;
    private String avatar;
    private String rol;
}