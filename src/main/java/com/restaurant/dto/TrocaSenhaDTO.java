package com.restaurant.dto;

import jakarta.validation.constraints.NotBlank;

public class TrocaSenhaDTO {
    @NotBlank
    private String senhaAtual;
    @NotBlank
    private String novaSenha;
    // getters e setters
}
