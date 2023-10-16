package cl.ufro.dci.cms.infrastructure.entities;

import cl.ufro.dci.cms.domain.model.Post;
import cl.ufro.dci.cms.domain.model.PostMetadatum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "post_metadata")
public class PostMetadatumEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPostMetadata", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdPost", nullable = false)
    private PostEntity idPostEntity;

    @Column(name = "Clave", nullable = false)
    private String clave;

    @Column(name = "Valor", nullable = false)
    private String valor;

    @Column(name = "Tipo", nullable = false)
    private String tipo;

    @Column(name = "Fecha")
    private Instant fecha;

    public PostMetadatumEntity() {
    }

    public PostMetadatumEntity(Integer id, PostEntity idPostEntity, String clave, String valor, String tipo, Instant fecha) {
        this.id = id;
        this.idPostEntity = idPostEntity;
        this.clave = clave;
        this.valor = valor;
        this.tipo = tipo;
        this.fecha = fecha;
    }
    public static PostMetadatumEntity fromDomainModel(PostMetadatum postMetadatum) {
        return new PostMetadatumEntity(postMetadatum.getId(),
                postMetadatum.getIdPostEntity(),
                postMetadatum.getClave(),
                postMetadatum.getValor(),
                postMetadatum.getTipo(),
                postMetadatum.getFecha());
    }

    public PostMetadatum toDomainModel() {
        return new PostMetadatum(id,idPostEntity,clave,valor,tipo,fecha);
    }
}