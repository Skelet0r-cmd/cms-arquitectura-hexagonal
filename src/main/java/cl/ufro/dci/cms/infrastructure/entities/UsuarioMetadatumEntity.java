package cl.ufro.dci.cms.infrastructure.entities;

import cl.ufro.dci.cms.domain.model.Usuario;
import cl.ufro.dci.cms.domain.model.UsuarioMetadatum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "usuario_metadata")
public class UsuarioMetadatumEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUsuarioMetadata", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdUsuario", nullable = false)
    private UsuarioEntity idUsuarioEntity;

    @Column(name = "Clave", nullable = false)
    private String clave;

    @Column(name = "Valor", nullable = false)
    private String valor;

    @Column(name = "Tipo", nullable = false)
    private String tipo;

    @Column(name = "Fecha")
    private Instant fecha;

    public UsuarioMetadatumEntity() {
    }

    public UsuarioMetadatumEntity(Integer id, UsuarioEntity idUsuarioEntity, String clave, String valor, String tipo, Instant fecha) {
        this.id = id;
        this.idUsuarioEntity = idUsuarioEntity;
        this.clave = clave;
        this.valor = valor;
        this.tipo = tipo;
        this.fecha = fecha;
    }
    public static UsuarioMetadatumEntity fromDomainModel(UsuarioMetadatum usuarioMetadatum) {
        return new UsuarioMetadatumEntity(usuarioMetadatum.getId(),
                usuarioMetadatum.getIdUsuarioEntity(),
                usuarioMetadatum.getClave(),
                usuarioMetadatum.getValor(),
                usuarioMetadatum.getTipo(),
                usuarioMetadatum.getFecha());
    }

    public UsuarioMetadatum toDomainModel() {
        return new UsuarioMetadatum(id,idUsuarioEntity,clave,valor,tipo,fecha);
    }
}