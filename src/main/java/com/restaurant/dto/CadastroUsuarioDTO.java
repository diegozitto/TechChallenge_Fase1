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
    private String email;
    @NotBlank
    private String login;
    @NotBlank
    private String senha;
    @Valid
    private DadosEndereco endereco;

}
