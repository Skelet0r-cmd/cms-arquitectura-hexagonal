package cl.ufro.dci.cms.application.usecases.contenido;

import cl.ufro.dci.cms.domain.model.Contenido;
import cl.ufro.dci.cms.domain.ports.in.contenido.UpdateContenidoUseCase;
import cl.ufro.dci.cms.domain.ports.out.ContenidoRepositoryPort;

import java.util.List;
import java.util.Optional;

public class UpdateContenidoUseCaseImpl implements UpdateContenidoUseCase {

    private final ContenidoRepositoryPort contenidoRepositoryPort;

    public UpdateContenidoUseCaseImpl(ContenidoRepositoryPort contenidoRepositoryPort) {
        this.contenidoRepositoryPort = contenidoRepositoryPort;
    }

    @Override
    public Optional<Contenido> updateContenido(Integer id, Contenido updatedContenido) {
        return contenidoRepositoryPort.update(updatedContenido);
    }
}
