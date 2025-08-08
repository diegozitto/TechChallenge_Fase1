package com.restaurant.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class AtualizacaoUsuarioDTO {
    @NotBlank
    private String nome;
    @Email
    private String email;
    @NotBlank
    private String login;
    private @Valid DadosEndereco endereco;
    // getters e setters
}