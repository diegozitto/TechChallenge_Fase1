package com.restaurant.controller;

import com.restaurant.entity.DonoRestaurante;
import com.restaurant.repository.DonoRestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("/donos")
@Tag(name = "Donos de Restaurante", description = "Operações para Donos de Restaurante")
public class DonoRestauranteController {

    @Autowired
    private DonoRestauranteRepository donoRestauranteRepository;

    @GetMapping
    public ResponseEntity<List<DonoRestaurante>> listarTodos() {
        return ResponseEntity.ok(donoRestauranteRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DonoRestaurante> buscarPorId(@PathVariable Long id) {
        return donoRestauranteRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<DonoRestaurante> cadastrar(@RequestBody DonoRestaurante dono) {
        DonoRestaurante salvo = donoRestauranteRepository.save(dono);
        return ResponseEntity.status(201).body(salvo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DonoRestaurante> atualizar(@PathVariable Long id, @RequestBody DonoRestaurante dono) {
        if (!donoRestauranteRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        dono.setId(id);
        DonoRestaurante atualizado = donoRestauranteRepository.save(dono);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (!donoRestauranteRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        donoRestauranteRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}