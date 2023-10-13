package cl.ufro.dci.cms.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "comentario")
public class ComentarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdComentario", nullable = false)
    private Integer id;

    @Column(name = "Comentario", nullable = false)
    private String comentario;

    @Column(name = "Respuesta")
    private String respuesta;

    @Column(name = "Fecha")
    private Instant fecha;

}