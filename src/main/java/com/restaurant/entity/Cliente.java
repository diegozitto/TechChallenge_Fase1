package com.restaurant.entity;


import com.restaurant.dto.CadastroUsuarioDTO;
import com.restaurant.dto.TrocaSenhaDTO;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Cliente")
@Table(name = "Cliente")
@Getter
@NoArgsConstructor


public class Cliente extends Usuario {


    public Cliente( CadastroUsuarioDTO dados) {
        dados.getNome();
        dados.getEmail();
        dados.getLogin();
        dados.getSenha();
        dados.getEndereco();
    } 

}
