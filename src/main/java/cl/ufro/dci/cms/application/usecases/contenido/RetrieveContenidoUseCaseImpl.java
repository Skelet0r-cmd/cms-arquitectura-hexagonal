package cl.ufro.dci.cms.application.usecases.contenido;

import cl.ufro.dci.cms.domain.model.Contenido;
import cl.ufro.dci.cms.domain.ports.in.contenido.DeleteContenidoUseCase;
import cl.ufro.dci.cms.domain.ports.in.contenido.RetrieveContenidoUseCase;
import cl.ufro.dci.cms.domain.ports.out.ContenidoRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveContenidoUseCaseImpl implements RetrieveContenidoUseCase {

    private final ContenidoRepositoryPort contenidoRepositoryPort;

    public RetrieveContenidoUseCaseImpl(ContenidoRepositoryPort contenidoRepositoryPort) {
        this.contenidoRepositoryPort = contenidoRepositoryPort;
    }

    @Override
    public Optional<Contenido> getContenidoById(Integer id) {
        return contenidoRepositoryPort.findById(id);
    }

    @Override
    public List<Contenido> getAllContenidos() {
        return contenidoRepositoryPort.findAll();
    }
}
