package com.restaurant.entity;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

import com.restaurant.dto.CadastroUsuarioDTO;

@Entity(name = "Cliente")
@Table(name = "Cliente")
@Getter
@NoArgsConstructor


public class Cliente extends Usuario {


    public Cliente(CadastroUsuarioDTO dados) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.endereco = endereco;
        this.dataUltimaAlteracao = new Date();
    }
    

}
