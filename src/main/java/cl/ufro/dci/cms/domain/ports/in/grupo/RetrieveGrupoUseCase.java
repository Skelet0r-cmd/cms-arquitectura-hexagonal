package cl.ufro.dci.cms.domain.ports.in.grupo;

import cl.ufro.dci.cms.domain.model.Grupo;

import java.util.List;
import java.util.Optional;

public interface RetrieveGrupoUseCase {
    Optional<Grupo> getGrupoById (Integer id);
    List<Grupo> getAllGrupos();
}
