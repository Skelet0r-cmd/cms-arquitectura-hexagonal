package cl.ufro.dci.cms.domain.ports.in.grupo;

import cl.ufro.dci.cms.domain.model.Grupo;

public interface CreateGrupoUseCase {
    Grupo createGrupo(Grupo grupo);
}
