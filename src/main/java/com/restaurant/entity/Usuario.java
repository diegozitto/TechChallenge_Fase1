package com.restaurant.entity;

public interface Usuario {
    Long getId();
    String getNome();
    String getEmail();
    String getLogin();
    String getSenha();
    java.util.Date getDataUltimaAlteracao();
    Endereco getEndereco();
    // outros métodos se necessário
}
