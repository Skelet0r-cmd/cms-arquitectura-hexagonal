package cl.ufro.dci.cms.application.services;


import cl.ufro.dci.cms.domain.model.AdditionalComentarioInfo;
import cl.ufro.dci.cms.domain.model.Comentario;
import cl.ufro.dci.cms.domain.ports.in.comentario.*;

import java.util.List;
import java.util.Optional;

public class ComentarioService implements CreateComentarioUseCase, DeleteComentarioUseCase,
        GetAdditionalComentarioInfoUseCase, RetrieveComentarioUseCase, UpdateComentarioUseCase {
    private final CreateComentarioUseCase createComentarioUseCase;
    private final DeleteComentarioUseCase deleteComentarioUseCase;
    private final GetAdditionalComentarioInfoUseCase getAdditionalComentarioInfoUseCase;
    private final RetrieveComentarioUseCase retrieveComentarioUseCase;
    private final UpdateComentarioUseCase updateComentarioUseCase;

    public ComentarioService(CreateComentarioUseCase createComentarioUseCase,
                             DeleteComentarioUseCase deleteComentarioUseCase,
                             GetAdditionalComentarioInfoUseCase getAdditionalComentarioInfoUseCase,
                             RetrieveComentarioUseCase retrieveComentarioUseCase,
                             UpdateComentarioUseCase updateComentarioUseCase) {
        this.createComentarioUseCase = createComentarioUseCase;
        this.deleteComentarioUseCase = deleteComentarioUseCase;
        this.getAdditionalComentarioInfoUseCase = getAdditionalComentarioInfoUseCase;
        this.retrieveComentarioUseCase = retrieveComentarioUseCase;
        this.updateComentarioUseCase = updateComentarioUseCase;
    }

    @Override
    public Comentario createComentario(Comentario comentario) {
        return createComentarioUseCase.createComentario(comentario);
    }

    @Override
    public boolean deleteComentario(Integer id) {
        return deleteComentarioUseCase.deleteComentario(id);
    }

    @Override
    public AdditionalComentarioInfo getAdditionalComentarioInfo(Integer comentarioId) {
        return getAdditionalComentarioInfoUseCase.getAdditionalComentarioInfo(comentarioId);
    }

    @Override
    public Optional<Comentario> getComentarioById(Integer id) {
        return retrieveComentarioUseCase.getComentarioById(id);
    }

    @Override
    public List<Comentario> getAllComentarios() {
        return retrieveComentarioUseCase.getAllComentarios();
    }

    @Override
    public Optional<Comentario> updateComentario(Integer id, Comentario updatedComentario) {
        return updateComentarioUseCase.updateComentario(id,updatedComentario);
    }
}
