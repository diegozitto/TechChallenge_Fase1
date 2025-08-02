package com.restaurant.entity;

import com.restaurant.dto.DadosEndereco;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cidade;
    private String numero;
    private String cep;
    private String complemento;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
        this.cep = dados.cep();
        this.complemento = dados.complemento();
        this.uf = dados.uf();

    }
}
