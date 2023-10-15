package cl.ufro.dci.cms.application.usecases.grupo;

import cl.ufro.dci.cms.domain.model.Grupo;
import cl.ufro.dci.cms.domain.ports.in.grupo.UpdateGrupoUseCase;
import cl.ufro.dci.cms.domain.ports.out.GrupoRepositoryPort;

import java.util.Optional;

public class UpdateGrupoUseCaseImpl implements UpdateGrupoUseCase {

    private final GrupoRepositoryPort grupoRepositoryPort;

    public UpdateGrupoUseCaseImpl(GrupoRepositoryPort grupoRepositoryPort) {
        this.grupoRepositoryPort = grupoRepositoryPort;
    }

    @Override
    public Optional<Grupo> updateGrupo(Integer id, Grupo updatedGrupo) {
        return grupoRepositoryPort.update(updatedGrupo);
    }
}
