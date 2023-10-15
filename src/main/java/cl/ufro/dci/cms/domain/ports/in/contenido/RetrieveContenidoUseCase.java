package cl.ufro.dci.cms.domain.ports.in.contenido;

import cl.ufro.dci.cms.domain.model.Contenido;

import java.util.List;
import java.util.Optional;

public interface RetrieveContenidoUseCase {
    Optional<Contenido> getContenidoById (Integer id);
    List<Contenido> getAllContenidos();
}
