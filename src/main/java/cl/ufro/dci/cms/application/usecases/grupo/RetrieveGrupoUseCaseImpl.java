package cl.ufro.dci.cms.application.usecases.grupo;

import cl.ufro.dci.cms.domain.model.Grupo;
import cl.ufro.dci.cms.domain.ports.in.grupo.RetrieveGrupoUseCase;
import cl.ufro.dci.cms.domain.ports.out.GrupoRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveGrupoUseCaseImpl implements RetrieveGrupoUseCase {

    private final GrupoRepositoryPort grupoRepositoryPort;

    public RetrieveGrupoUseCaseImpl(GrupoRepositoryPort grupoRepositoryPort) {
        this.grupoRepositoryPort = grupoRepositoryPort;
    }

    @Override
    public Optional<Grupo> getGrupoById(Integer id) {
        return grupoRepositoryPort.findById(id);
    }

    @Override
    public List<Grupo> getAllGrupos() {
        return grupoRepositoryPort.findAll();
    }
}
