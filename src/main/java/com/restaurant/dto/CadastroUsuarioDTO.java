package com.restaurant.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CadastroUsuarioDTO {

    @NotBlank
    private String nome;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String login;

    @NotBlank
    private String senha;

    @Valid
    private DadosEndereco endereco;

    public CadastroUsuarioDTO() {}

    public CadastroUsuarioDTO(String nome, String email, String login, String senha, DadosEndereco endereco) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.endereco = endereco;
    }
}