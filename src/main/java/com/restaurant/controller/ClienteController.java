package com.restaurant.controller;

import com.restaurant.entity.Cliente;
import com.restaurant.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController extends AbstractUsuarioController<Cliente> {

    @Autowired
    private ClienteRepository repository;

    protected ClienteRepository getRepository() {
        return repository;
    }
}