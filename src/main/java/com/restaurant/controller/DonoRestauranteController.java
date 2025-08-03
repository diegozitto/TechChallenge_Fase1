package com.restaurant.controller;

import com.restaurant.dto.CadastroUsuarioDTO;
import com.restaurant.entity.Cliente;
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


    @Override
    protected DonoRestaurante toEntity(CadastroUsuarioDTO dto) {
        DonoRestaurante dono = new DonoRestaurante();    
        dono.setNome(dto.getNome());
        dono.setEmail(dto.getEmail());    
        dono.setLogin(dto.getLogin());
        dono.setSenha(dto.getSenha());
        if (dto.getEndereco() != null) {
            dono.setEndereco(dto.getEndereco().toEntity()); // Você deve garantir que DadosEndereco tenha o método toEntity() e ele converta o DTO de endereço para Entity.
            }
            return dono;
        }
    }