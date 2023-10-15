package cl.ufro.dci.cms.domain.ports.in.contenido;

import cl.ufro.dci.cms.domain.model.Contenido;

import java.util.Optional;

public interface UpdateContenidoUseCase {
    Optional<Contenido> updateContenido (Integer id, Contenido updateContenido);
}
