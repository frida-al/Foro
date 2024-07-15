package com.alura_cursos.forohub.DTOs;

import com.alura_cursos.forohub.clases.Topico;
import com.alura_cursos.forohub.enums.Categoria;

public record DatosListadoTopico(Long id, String nombre, String categoria, String titulo, String mensaje) {
    public DatosListadoTopico(Topico topico){
        this(topico.getId(), topico.getNombre(), topico.getCategoria().toString(), topico.getTitulo(), topico.getMensaje());
    }
}
