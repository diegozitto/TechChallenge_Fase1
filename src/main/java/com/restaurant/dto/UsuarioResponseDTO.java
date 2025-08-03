package com.restaurant.dto;

import com.restaurant.entity.Usuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioResponseDTO {

    @NotBlank
    private String nome;

    @Email
    private String email;

    @NotBlank
    private String login;

    @Valid
    private DadosEndereco endereco;

    // Construtor de conversão
    public UsuarioResponseDTO(Usuario usuario) {
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.login = usuario.getLogin();
        this.endereco = DadosEndereco.fromEntity(usuario.getEndereco());
    }
}