package com.restaurant.entity;

import java.time.LocalDateTime;


import jakarta.persistence.Embedded;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Id;


@MappedSuperclass
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected String nome;
    protected String email;
    protected String login;
    protected String senha;
    protected LocalDateTime dataUltimaAlteracao;
    @Embedded
    protected Endereco endereco;

    
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getLogin() { return login; }
    public String getSenha() { return senha; }
    public Endereco getEndereco() { return endereco; }
    public LocalDateTime getDataUltimaAlteracao() { return LocalDateTime.now(); }

    public void setId(Long id) { this.id = id; }
    public void setSenha(String senha) { this.senha = senha; }
}
