package com.restaurant.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

import com.restaurant.dto.CadastroUsuarioDTO;

@Entity(name = "Dono")
@Table(name = "Dono")
@Getter

@EqualsAndHashCode(of = "id")
public class DonoRestaurante extends Usuario {


    public DonoRestaurante() {
        // Default constructor
    }

    public DonoRestaurante(CadastroUsuarioDTO cadastroUsuarioDTO) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.endereco = endereco;
        this.dataUltimaAlteracao = new Date();
    }
 
}
