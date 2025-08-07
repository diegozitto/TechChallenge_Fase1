package com.restaurant.controller;

import com.restaurant.entity.DonoRestaurante;
import com.restaurant.repository.DonoRestauranteRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/donos")
@Tag(name = "Donos de Restaurante", description = "Operações para Donos de Restaurante")
public class DonoRestauranteController extends AbstractUsuarioController<DonoRestaurante> {

    @Autowired
    private DonoRestauranteRepository donoRestauranteRepository;


    protected DonoRestauranteRepository getRepository() {
        return donoRestauranteRepository;
    }
}