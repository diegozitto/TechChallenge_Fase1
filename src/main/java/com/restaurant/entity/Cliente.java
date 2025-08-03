package com.restaurant.entity;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

import com.restaurant.dto.CadastroUsuarioDTO;

@Entity(name = "Cliente")
@Table(name = "Cliente")
@Getter
@NoArgsConstructor
@Setter
public class Cliente extends Usuario {


public Cliente(CadastroUsuarioDTO dados) {
    this.nome = dados.getNome();
    this.email = dados.getEmail();
    this.login = dados.getLogin();
    this.senha = dados.getSenha();
    if (dados.getEndereco() != null) {
        this.endereco = dados.getEndereco().toEntity(); 
    }
    this.dataUltimaAlteracao = new Date();
}

}
