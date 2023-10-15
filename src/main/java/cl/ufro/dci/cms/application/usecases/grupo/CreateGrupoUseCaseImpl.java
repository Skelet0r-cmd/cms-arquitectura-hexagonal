package cl.ufro.dci.cms.application.usecases.grupo;

import cl.ufro.dci.cms.domain.model.Grupo;
import cl.ufro.dci.cms.domain.ports.in.grupo.CreateGrupoUseCase;
import cl.ufro.dci.cms.domain.ports.out.GrupoRepositoryPort;

public class CreateGrupoUseCaseImpl implements CreateGrupoUseCase {

    private final GrupoRepositoryPort grupoRepositoryPort;

    public CreateGrupoUseCaseImpl(GrupoRepositoryPort grupoRepositoryPort) {
        this.grupoRepositoryPort = grupoRepositoryPort;
    }

    @Override
    public Grupo createGrupo(Grupo grupo) {
        return grupoRepositoryPort.save(grupo);
    }
}
