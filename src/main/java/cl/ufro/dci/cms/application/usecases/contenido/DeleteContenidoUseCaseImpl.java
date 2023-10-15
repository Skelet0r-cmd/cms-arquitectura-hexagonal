package cl.ufro.dci.cms.application.usecases.contenido;

import cl.ufro.dci.cms.domain.ports.in.contenido.DeleteContenidoUseCase;
import cl.ufro.dci.cms.domain.ports.out.ContenidoRepositoryPort;

public class DeleteContenidoUseCaseImpl implements DeleteContenidoUseCase {

    private final ContenidoRepositoryPort contenidoRepositoryPort;

    public DeleteContenidoUseCaseImpl(ContenidoRepositoryPort contenidoRepositoryPort) {
        this.contenidoRepositoryPort = contenidoRepositoryPort;
    }

    @Override
    public boolean deleteContenido(Integer id) {
        return contenidoRepositoryPort.deleteById(id);
    }
}
