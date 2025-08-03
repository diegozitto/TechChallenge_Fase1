package com.restaurant.controller;

import com.restaurant.dto.CadastroUsuarioDTO;
import com.restaurant.dto.UsuarioResponseDTO;
import com.restaurant.entity.Cliente;
import com.restaurant.repository.ClienteRepository;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
@Tag(name = "Clientes", description = "Operações para Clientes")
public class ClienteController extends AbstractUsuarioController<Cliente> {

    @Autowired
    private ClienteRepository repository;

    protected ClienteRepository getRepository() {
        return repository;
    }

@Override
protected Cliente toEntity(CadastroUsuarioDTO dto) {
    Cliente cliente = new Cliente();
    cliente.setNome(dto.getNome());
    cliente.setEmail(dto.getEmail());
    cliente.setLogin(dto.getLogin());
    cliente.setSenha(dto.getSenha());
    
    
    if (dto.getEndereco() != null) {
        cliente.setEndereco(dto.getEndereco().toEntity()); // Você deve garantir que DadosEndereco tenha o método toEntity() e ele converta o DTO de endereço para Entity.
    }

    return cliente;
}

   
}