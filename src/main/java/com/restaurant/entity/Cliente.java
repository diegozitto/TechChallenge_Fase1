package com.restaurant.entity;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.restaurant.dto.CadastroCliente;

@Entity(name = "Cliente")
@Table(name = "Cliente")
@Getter
@NoArgsConstructor


public class Cliente extends Usuario {


    public Cliente(CadastroCliente dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.login = dados.login();
        this.senha = dados.senha();
        this.endereco = new Endereco(dados.endereco());
    }
    

}
