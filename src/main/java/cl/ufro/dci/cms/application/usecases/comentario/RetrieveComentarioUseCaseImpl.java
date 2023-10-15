package cl.ufro.dci.cms.application.usecases.comentario;

import cl.ufro.dci.cms.domain.model.Comentario;
import cl.ufro.dci.cms.domain.ports.in.comentario.CreateComentarioUseCase;
import cl.ufro.dci.cms.domain.ports.in.comentario.RetrieveComentarioUseCase;
import cl.ufro.dci.cms.domain.ports.out.ComentarioRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveComentarioUseCaseImpl implements RetrieveComentarioUseCase {

    private final ComentarioRepositoryPort comentarioRepositoryPort;

    public RetrieveComentarioUseCaseImpl(ComentarioRepositoryPort comentarioRepositoryPort) {
        this.comentarioRepositoryPort = comentarioRepositoryPort;
    }

    @Override
    public Optional<Comentario> getComentarioById(Integer id) {
        return comentarioRepositoryPort.findById(id);
    }

    @Override
    public List<Comentario> getAllComentarios() {
        return comentarioRepositoryPort.findAll();
    }
}
