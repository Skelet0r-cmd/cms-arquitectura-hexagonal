package cl.ufro.dci.cms.infrastructure.entities;

import cl.ufro.dci.cms.domain.model.Grupo;
import cl.ufro.dci.cms.domain.model.GrupoPermiso;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "grupo_permiso")
public class GrupoPermisoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdGrupoPermiso", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdGrupo", nullable = false)
    private GrupoEntity idGrupoEntity;

    @Column(name = "Fecha")
    private Instant fecha;

    public GrupoPermisoEntity() {
    }

    public GrupoPermisoEntity(Integer id, GrupoEntity idGrupoEntity, Instant fecha) {
        this.id = id;
        this.idGrupoEntity = idGrupoEntity;
        this.fecha = fecha;
    }
    public static GrupoPermisoEntity fromDomainModel(GrupoPermiso grupoPermiso) {
        return new GrupoPermisoEntity(grupoPermiso.getId(),
                grupoPermiso.getIdGrupoEntity(),
                grupoPermiso.getFecha());
    }

    public GrupoPermiso toDomainModel() {
        return new GrupoPermiso(id,idGrupoEntity,fecha);
    }
}