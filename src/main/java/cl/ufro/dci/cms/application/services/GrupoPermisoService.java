package cl.ufro.dci.cms.application.services;

import cl.ufro.dci.cms.domain.model.GrupoPermiso;
import cl.ufro.dci.cms.domain.ports.in.grupoPermiso.CreateGrupoPermisoUseCase;
import cl.ufro.dci.cms.domain.ports.in.grupoPermiso.DeleteGrupoPermisoUseCase;
import cl.ufro.dci.cms.domain.ports.in.grupoPermiso.RetrieveGrupoPermisoUseCase;
import cl.ufro.dci.cms.domain.ports.in.grupoPermiso.UpdateGrupoPermisoUseCase;

import java.util.List;
import java.util.Optional;

public class GrupoPermisoService implements CreateGrupoPermisoUseCase, DeleteGrupoPermisoUseCase,
        RetrieveGrupoPermisoUseCase, UpdateGrupoPermisoUseCase {
    private final CreateGrupoPermisoUseCase createGrupoPermisoUseCase;
    private final DeleteGrupoPermisoUseCase deleteGrupoPermisoUseCase;
    private final RetrieveGrupoPermisoUseCase retrieveGrupoPermisoUseCase;
    private final UpdateGrupoPermisoUseCase updateGrupoPermisoUseCase;

    public GrupoPermisoService(CreateGrupoPermisoUseCase createGrupoPermisoUseCase,
                               DeleteGrupoPermisoUseCase deleteGrupoPermisoUseCase,
                               RetrieveGrupoPermisoUseCase retrieveGrupoPermisoUseCase,
                               UpdateGrupoPermisoUseCase updateGrupoPermisoUseCase) {
        this.createGrupoPermisoUseCase = createGrupoPermisoUseCase;
        this.deleteGrupoPermisoUseCase = deleteGrupoPermisoUseCase;
        this.retrieveGrupoPermisoUseCase = retrieveGrupoPermisoUseCase;
        this.updateGrupoPermisoUseCase = updateGrupoPermisoUseCase;
    }

    @Override
    public GrupoPermiso createGrupoPermiso(GrupoPermiso grupoPermiso) {
        return createGrupoPermisoUseCase.createGrupoPermiso(grupoPermiso);
    }

    @Override
    public boolean deleteGrupoPermiso(Integer id) {
        return deleteGrupoPermisoUseCase.deleteGrupoPermiso(id);
    }

    @Override
    public Optional<GrupoPermiso> getGrupoPermisoById(Integer id) {
        return retrieveGrupoPermisoUseCase.getGrupoPermisoById(id);
    }

    @Override
    public List<GrupoPermiso> getAllGruposPermisos() {
        return retrieveGrupoPermisoUseCase.getAllGruposPermisos();
    }

    @Override
    public Optional<GrupoPermiso> updateGrupoPermiso(Integer id, GrupoPermiso updatedGrupoPermiso) {
        return updateGrupoPermisoUseCase.updateGrupoPermiso(id,updatedGrupoPermiso);
    }
}
