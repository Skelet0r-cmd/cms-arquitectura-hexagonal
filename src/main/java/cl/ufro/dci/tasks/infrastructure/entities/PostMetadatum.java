package cl.ufro.dci.tasks.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "post_metadata")
public class PostMetadatum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPostMetadata", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdPost", nullable = false)
    private Post idPost;

    @Column(name = "Clave", nullable = false)
    private String clave;

    @Column(name = "Valor", nullable = false)
    private String valor;

    @Column(name = "Tipo", nullable = false)
    private String tipo;

    @Column(name = "Fecha")
    private Instant fecha;

}