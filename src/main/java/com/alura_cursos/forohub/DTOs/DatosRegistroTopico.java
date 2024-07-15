package com.alura_cursos.forohub.DTOs;

import com.alura_cursos.forohub.enums.Categoria;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotBlank
        String nombre,

        @NotBlank
        @Email
        String email,

        @NotNull
        Categoria categoria,

        @NotBlank
        String titulo,

        @NotBlank
        String mensaje) {
}
