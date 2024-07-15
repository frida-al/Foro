package com.alura_cursos.forohub.clases;

import com.alura_cursos.forohub.DTOs.DatosActualizarTopico;
import com.alura_cursos.forohub.DTOs.DatosRegistroTopico;
import com.alura_cursos.forohub.enums.Categoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
    private Boolean activo;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    private String titulo;
    private String mensaje;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.activo = true;
        this.nombre = datosRegistroTopico.nombre();
        this.email = datosRegistroTopico.email();
        this.categoria = datosRegistroTopico.categoria();
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if(datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if(datosActualizarTopico.mensaje() != null) {
            this.mensaje = datosActualizarTopico.mensaje();
        }
    }

    public void desactivarTopico() {
        this.activo = false;
    }
}
