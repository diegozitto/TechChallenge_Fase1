package com.restaurant.dto;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.restaurant.entity.Usuario;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UsuarioResponseDTO {
    @NotBlank
    private String nome;
    @Email
    private String email;
    @NotBlank
    private String login;
    @Valid
    private DadosEndereco endereco;
    private LocalDateTime dataUltimaAlteracao;

    // getters e setters

    public UsuarioResponseDTO(Usuario usuario) {
    this.nome = usuario.getNome();
    this.email = usuario.getEmail();
    this.login = usuario.getLogin();
    this.endereco = DadosEndereco.fromEntity(usuario.getEndereco());
    this.dataUltimaAlteracao = usuario.getDataUltimaAlteracao();
    }
}

