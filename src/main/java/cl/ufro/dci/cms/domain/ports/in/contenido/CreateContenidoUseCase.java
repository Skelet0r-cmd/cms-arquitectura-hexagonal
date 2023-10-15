package cl.ufro.dci.cms.domain.ports.in.contenido;

import cl.ufro.dci.cms.domain.model.Contenido;

public interface CreateContenidoUseCase {
    Contenido createContenido(Contenido contenido);
}
