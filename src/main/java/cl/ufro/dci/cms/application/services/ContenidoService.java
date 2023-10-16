package cl.ufro.dci.cms.application.services;

import cl.ufro.dci.cms.domain.model.Contenido;
import cl.ufro.dci.cms.domain.ports.in.contenido.CreateContenidoUseCase;
import cl.ufro.dci.cms.domain.ports.in.contenido.DeleteContenidoUseCase;
import cl.ufro.dci.cms.domain.ports.in.contenido.RetrieveContenidoUseCase;
import cl.ufro.dci.cms.domain.ports.in.contenido.UpdateContenidoUseCase;

import java.util.List;
import java.util.Optional;

public class ContenidoService implements CreateContenidoUseCase, DeleteContenidoUseCase,
        RetrieveContenidoUseCase, UpdateContenidoUseCase {
    private final CreateContenidoUseCase createContenidoUseCase;
    private final DeleteContenidoUseCase deleteContenidoUseCase;
    private final RetrieveContenidoUseCase retrieveContenidoUseCase;
    private final UpdateContenidoUseCase updateContenidoUseCase;

    public ContenidoService(CreateContenidoUseCase createContenidoUseCase, DeleteContenidoUseCase deleteContenidoUseCase,
                            RetrieveContenidoUseCase retrieveContenidoUseCase, UpdateContenidoUseCase updateContenidoUseCase) {
        this.createContenidoUseCase = createContenidoUseCase;
        this.deleteContenidoUseCase = deleteContenidoUseCase;
        this.retrieveContenidoUseCase = retrieveContenidoUseCase;
        this.updateContenidoUseCase = updateContenidoUseCase;
    }

    @Override
    public Contenido createContenido(Contenido contenido) {
        return createContenidoUseCase.createContenido(contenido);
    }

    @Override
    public boolean deleteContenido(Integer id) {
        return deleteContenidoUseCase.deleteContenido(id);
    }

    @Override
    public Optional<Contenido> getContenidoById(Integer id) {
        return retrieveContenidoUseCase.getContenidoById(id);
    }

    @Override
    public List<Contenido> getAllContenidos() {
        return retrieveContenidoUseCase.getAllContenidos();
    }

    @Override
    public Optional<Contenido> updateContenido(Integer id, Contenido updatedContenido) {
        return updateContenidoUseCase.updateContenido(id,updatedContenido);
    }
}
