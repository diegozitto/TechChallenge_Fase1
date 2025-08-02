package com.restaurant.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        String logradouro,

        @NotBlank
        String bairro,

        @NotBlank
        String cidade,

        String numero,

        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep,

        String complemento,

        @NotBlank
        String uf) {
}
