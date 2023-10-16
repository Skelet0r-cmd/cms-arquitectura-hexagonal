package cl.ufro.dci.cms.application.services;

import cl.ufro.dci.cms.domain.model.Grupo;
import cl.ufro.dci.cms.domain.ports.in.grupo.CreateGrupoUseCase;
import cl.ufro.dci.cms.domain.ports.in.grupo.DeleteGrupoUseCase;
import cl.ufro.dci.cms.domain.ports.in.grupo.RetrieveGrupoUseCase;
import cl.ufro.dci.cms.domain.ports.in.grupo.UpdateGrupoUseCase;

import java.util.List;
import java.util.Optional;

public class GrupoService implements CreateGrupoUseCase, DeleteGrupoUseCase,
        RetrieveGrupoUseCase, UpdateGrupoUseCase {
    private final CreateGrupoUseCase createGrupoUseCase;
    private final DeleteGrupoUseCase deleteGrupoUseCase;
    private final RetrieveGrupoUseCase retrieveGrupoUseCase;
    private final UpdateGrupoUseCase updateGrupoUseCase;

    public GrupoService(CreateGrupoUseCase createGrupoUseCase, DeleteGrupoUseCase deleteGrupoUseCase,
                        RetrieveGrupoUseCase retrieveGrupoUseCase, UpdateGrupoUseCase updateGrupoUseCase) {
        this.createGrupoUseCase = createGrupoUseCase;
        this.deleteGrupoUseCase = deleteGrupoUseCase;
        this.retrieveGrupoUseCase = retrieveGrupoUseCase;
        this.updateGrupoUseCase = updateGrupoUseCase;
    }

    @Override
    public Grupo createGrupo(Grupo grupo) {
        return createGrupoUseCase.createGrupo(grupo);
    }

    @Override
    public boolean deleteGrupo(Integer id) {
        return deleteGrupoUseCase.deleteGrupo(id);
    }

    @Override
    public Optional<Grupo> getGrupoById(Integer id) {
        return retrieveGrupoUseCase.getGrupoById(id);
    }

    @Override
    public List<Grupo> getAllGrupos() {
        return retrieveGrupoUseCase.getAllGrupos();
    }

    @Override
    public Optional<Grupo> updateGrupo(Integer id, Grupo updatedGrupo) {
        return updateGrupoUseCase.updateGrupo(id,updatedGrupo);
    }
}
