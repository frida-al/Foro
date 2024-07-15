package com.alura_cursos.forohub.DTOs;

import com.alura_cursos.forohub.enums.Categoria;

public record DatosRespuestaTopico(Long id, String nombre, Categoria categoria, String titulo, String mensaje) {

}
