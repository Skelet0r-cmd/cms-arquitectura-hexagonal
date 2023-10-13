package cl.ufro.dci.cms.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "post")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPost", nullable = false)
    private Integer id;

    @Column(name = "Titulo", nullable = false)
    private String titulo;

    @Column(name = "Slug")
    private String slug;

    @Column(name = "Extracto")
    private String extracto;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdCategoria", nullable = false)
    private CategoriaEntity idCategoriaEntity;

    @Column(name = "ImagenDestacada")
    private String imagenDestacada;

    @Column(name = "Tipo")
    private String tipo;

    @Column(name = "Fecha")
    private Instant fecha;

}