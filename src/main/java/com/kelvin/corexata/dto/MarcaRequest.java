package com.kelvin.corexata.dto;

import jakarta.validation.constraints.NotBlank;

public record MarcaRequest(
        @NotBlank(message = "O nome é obrigatório")
        String nome
) {
}
