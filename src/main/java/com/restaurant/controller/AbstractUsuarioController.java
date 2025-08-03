package com.restaurant.controller;

import com.restaurant.entity.Cliente;
import com.restaurant.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.restaurant.controller.AbstractUsuarioController;
import com.restaurant.dto.CadastroUsuarioDTO;
import com.restaurant.dto.UsuarioResponseDTO;

import java.util.List;
import java.util.Optional;

// T representa qualquer entidade que herda de Usuario
public abstract class AbstractUsuarioController<T extends Usuario> {

      // Forneça o JPA Repository correspondente
    protected abstract JpaRepository<T, Long> getRepository();

    // Converte a entidade para DTO de resposta
    protected abstract T toEntity(CadastroUsuarioDTO dto);

    protected UsuarioResponseDTO toResponseDTO(T usuario) {
        return new UsuarioResponseDTO(usuario);
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>> listarTodos() {
        List<T> usuarios = getRepository().findAll();
        List<UsuarioResponseDTO> dtos = usuarios.stream()
            .map(this::toResponseDTO)
            .toList();
        return ResponseEntity.ok(dtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> buscarPorId(@PathVariable Long id) {
        Optional<T> usuario = getRepository().findById(id);
        return usuario
            .map(u -> ResponseEntity.ok(toResponseDTO(u)))
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> cadastrar(@RequestBody CadastroUsuarioDTO dto) {
        T usuario = toEntity(dto);
        T salvo = getRepository().save(usuario);
        return ResponseEntity.status(201).body(toResponseDTO(salvo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> atualizar(@PathVariable Long id, @RequestBody CadastroUsuarioDTO dto) {
        if (!getRepository().existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        T usuario = toEntity(dto);
        usuario.setId(id);
        T atualizado = getRepository().save(usuario);
        return ResponseEntity.ok(toResponseDTO(atualizado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (!getRepository().existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        getRepository().deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}/senha")
    public ResponseEntity<Void> trocarSenha(@PathVariable Long id, @RequestBody String novaSenha) {
        Optional<T> usuarioOpt = getRepository().findById(id);
        if (usuarioOpt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        T usuario = usuarioOpt.get();
        usuario.setSenha(novaSenha);
        getRepository().save(usuario);
        return ResponseEntity.noContent().build();
    }
}