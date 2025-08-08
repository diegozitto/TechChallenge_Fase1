package com.restaurant.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import com.restaurant.entity.Endereco;

public record DadosEndereco(
        @NotBlank String rua,
        @NotBlank String bairro,
        @NotBlank String cidade,
        String numero,
        String complemento,
        @NotBlank String estado,
        @NotBlank @Pattern(regexp = "\\d{8}") String cep
) {
    public static DadosEndereco fromEntity(Endereco e) {
        if (e == null) return null;
        return new DadosEndereco(
            e.getRua(),
            e.getBairro(),
            e.getCidade(),
            e.getNumero(),
            e.getComplemento(),
            e.getEstado(),
            e.getCep()
        );
    }
}