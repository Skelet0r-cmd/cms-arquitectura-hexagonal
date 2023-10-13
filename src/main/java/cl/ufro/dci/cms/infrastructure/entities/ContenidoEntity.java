package cl.ufro.dci.cms.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "contenido")
public class ContenidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdContenido", nullable = false)
    private Integer id;

    @Column(name = "Tipo", nullable = false)
    private String tipo;

    @Column(name = "Contenido", nullable = false)
    private String contenido;

    @Column(name = "Fecha")
    private Instant fecha;

}