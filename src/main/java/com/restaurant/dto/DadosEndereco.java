package com.restaurant.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank String rua,
        @NotBlank String bairro,
        @NotBlank String cidade,
        String numero,
        String complemento,
        @NotBlank String estado,
        @NotBlank @Pattern(regexp = "\\d{8}") String cep
) {

     public com.restaurant.entity.Endereco toEntity() {
        return new com.restaurant.entity.Endereco(
            rua,
            numero,
            complemento,
            bairro,
            cidade,
            estado,
            cep
        );
    }
    public static DadosEndereco fromEntity(com.restaurant.entity.Endereco e) {
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

//     public com.restaurant.entity.Endereco toEntity() {
    
//         com.restaurant.entity.Endereco endereco = new com.restaurant.entity.Endereco();
//         endereco.setRua(this.rua());
//         endereco.setBairro(this.bairro());
//         endereco.setCidade(this.cidade());
//         endereco.setNumero(this.numero());    
//         endereco.setComplemento(this.complemento());
//         endereco.setEstado(this.estado());
//         endereco.setCep(this.cep());
//         return endereco;
// }
}