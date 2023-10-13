package cl.ufro.dci.cms.domain.model;

import cl.ufro.dci.cms.infrastructure.entities.GrupoEntity;

import java.time.Instant;

public class GrupoPermiso {
    private Integer id;
    private GrupoEntity idGrupoEntity;
    private Instant fecha;

    public GrupoPermiso(Integer id, GrupoEntity idGrupoEntity, Instant fecha) {
        this.id = id;
        this.idGrupoEntity = idGrupoEntity;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GrupoEntity getIdGrupoEntity() {
        return idGrupoEntity;
    }

    public void setIdGrupoEntity(GrupoEntity idGrupoEntity) {
        this.idGrupoEntity = idGrupoEntity;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }
}
