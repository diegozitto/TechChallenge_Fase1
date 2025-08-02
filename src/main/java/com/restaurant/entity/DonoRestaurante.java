package com.restaurant.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity(name = "Dono")
@Table(name = "Dono")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class DonoRestaurante implements Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String login;
    private String senha;
    private Date dataUltimaAlteracao;

    @Embedded
    private Endereco endereco;

    // Métodos da interface Usuario
    @Override
    public Long getId() { return id; }
    @Override
    public String getNome() { return nome; }
    @Override
    public String getEmail() { return email; }
    @Override
    public String getLogin() { return login; }
    @Override
    public String getSenha() { return senha; }
    @Override
    public Date getDataUltimaAlteracao() { return dataUltimaAlteracao; }
    @Override
    public Endereco getEndereco() { return endereco; }

    public void setId(Long id) {
        this.id = id;
    }
}
