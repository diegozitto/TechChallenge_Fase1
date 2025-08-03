package com.restaurant.entity;

import java.util.Date;

import jakarta.persistence.Embedded;

public abstract class Usuario {
  protected Long id;
    protected String nome;
    protected String email;
    protected String login;
    protected String senha;
    protected Date dataUltimaAlteracao;
    @Embedded
    protected Endereco endereco;

    
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getLogin() { return login; }
    public String getSenha() { return senha; }
    public Date getDataUltimaAlteracao() { return dataUltimaAlteracao; }
    public Endereco getEndereco() { return endereco; }

    public void setId(Long id) { this.id = id; }
    public void setSenha(String senha) { this.senha = senha; }
}
