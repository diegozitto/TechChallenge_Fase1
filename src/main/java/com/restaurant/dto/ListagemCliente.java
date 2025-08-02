package com.restaurant.dto;

import com.restaurant.entity.Cliente;

public record ListagemCliente(
        Long id,
        String nome,
        String email
        ) {

    public ListagemCliente(Cliente cliente){
        this(cliente.getId(),cliente.getNome(),cliente.getEmail());
    }
}
