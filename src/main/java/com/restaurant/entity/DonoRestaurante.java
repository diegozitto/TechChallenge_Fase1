package com.restaurant.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDateTime;


import com.restaurant.dto.CadastroUsuarioDTO;

@Entity(name = "Dono")
@Table(name = "Dono")
@Getter

@EqualsAndHashCode(of = "id")
public class DonoRestaurante extends Usuario {


    public DonoRestaurante() {
        // Default constructor
    }

    public DonoRestaurante(CadastroUsuarioDTO dados) {
        this.nome = dados.getNome();
        this.email = dados.getEmail();
        this.login = dados.getLogin();
        this.senha = dados.getSenha();
        this.endereco = new Endereco(dados.getEndereco().rua(),
                                    dados.getEndereco().numero(),
                                    dados.getEndereco().complemento(),
                                    dados.getEndereco().bairro(),
                                    dados.getEndereco().cidade(),
                                    dados.getEndereco().estado(),
                                    dados.getEndereco().cep());
    }
 
}
