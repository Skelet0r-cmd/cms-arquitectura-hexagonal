package cl.ufro.dci.cms.application.usecases.grupo;

import cl.ufro.dci.cms.domain.ports.in.grupo.DeleteGrupoUseCase;
import cl.ufro.dci.cms.domain.ports.out.GrupoRepositoryPort;

public class DeleteGrupoUseCaseImpl implements DeleteGrupoUseCase {

    private final GrupoRepositoryPort grupoRepositoryPort;

    public DeleteGrupoUseCaseImpl(GrupoRepositoryPort grupoRepositoryPort) {
        this.grupoRepositoryPort = grupoRepositoryPort;
    }

    @Override
    public boolean deleteGrupo(Integer id) {
        return grupoRepositoryPort.deleteById(id);
    }
}
