package com.restaurant.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import com.restaurant.dto.CadastroUsuarioDTO;

@Entity(name = "Cliente")
@Table(name = "Cliente")
@Getter
@NoArgsConstructor


public class Cliente extends Usuario {


    public Cliente(CadastroUsuarioDTO dados) {
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
        this.dataUltimaAlteracao = LocalDateTime.now();
    }    

}
