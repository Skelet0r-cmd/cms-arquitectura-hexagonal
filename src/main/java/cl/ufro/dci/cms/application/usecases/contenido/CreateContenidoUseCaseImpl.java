package cl.ufro.dci.cms.application.usecases.contenido;

import cl.ufro.dci.cms.domain.model.Contenido;
import cl.ufro.dci.cms.domain.ports.in.contenido.CreateContenidoUseCase;
import cl.ufro.dci.cms.domain.ports.out.ContenidoRepositoryPort;

public class CreateContenidoUseCaseImpl implements CreateContenidoUseCase {

    private final ContenidoRepositoryPort contenidoRepositoryPort;

    public CreateContenidoUseCaseImpl(ContenidoRepositoryPort contenidoRepositoryPort) {
        this.contenidoRepositoryPort = contenidoRepositoryPort;
    }

    @Override
    public Contenido createContenido(Contenido contenido) {
        return contenidoRepositoryPort.save(contenido);
    }
}
