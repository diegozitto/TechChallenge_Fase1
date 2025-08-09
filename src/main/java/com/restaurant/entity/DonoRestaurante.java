package com.restaurant.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import com.restaurant.dto.CadastroUsuarioDTO;

@Entity(name = "Dono")
@Table(name = "Dono")
@Getter
@NoArgsConstructor

public class DonoRestaurante extends Usuario {

    public DonoRestaurante(CadastroUsuarioDTO dados) {
        dados.getNome();
        dados.getEmail();
        dados.getLogin();
        dados.getSenha();
        dados.getEndereco();
    }
 
}
