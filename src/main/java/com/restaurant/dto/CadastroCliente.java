package com.restaurant.dto;

public record CadastroCliente(
    String nome,
    String email,
    String login,
    String senha,
    DadosEndereco endereco
) {}
