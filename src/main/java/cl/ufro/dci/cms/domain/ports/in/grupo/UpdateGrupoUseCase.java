package cl.ufro.dci.cms.domain.ports.in.grupo;

import cl.ufro.dci.cms.domain.model.Grupo;

import java.util.Optional;

public interface UpdateGrupoUseCase {
    Optional<Grupo> updateGrupo (Integer id, Grupo updateGrupo);
}
