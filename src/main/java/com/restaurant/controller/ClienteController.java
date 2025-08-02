package com.restaurant.controller;


import com.restaurant.dto.CadastroCliente;
import com.restaurant.dto.ListagemCliente;
import com.restaurant.entity.Cliente;
import com.restaurant.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public Page<ListagemCliente> listarCliente(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){
        return repository.findAll(paginacao).map(ListagemCliente::new);
    }

//    @GetMapping
//    public List<ListagemCliente> listarCliente(){
//        return repository.findAll().stream().map(ListagemCliente::new).toList();
//    }

    @PostMapping
    @Transactional
    public void cadastrarCliente(@RequestBody @Valid CadastroCliente dados){
        repository.save(new Cliente(dados));
    }
}
