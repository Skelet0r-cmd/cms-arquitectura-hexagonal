package cl.ufro.dci.cms.application.usecases.comentario;

import cl.ufro.dci.cms.domain.model.Comentario;
import cl.ufro.dci.cms.domain.ports.in.comentario.CreateComentarioUseCase;
import cl.ufro.dci.cms.domain.ports.in.comentario.UpdateComentarioUseCase;
import cl.ufro.dci.cms.domain.ports.out.ComentarioRepositoryPort;

import java.util.Optional;

public class UpdateComentarioUseCaseImpl implements UpdateComentarioUseCase {

    private final ComentarioRepositoryPort comentarioRepositoryPort;

    public UpdateComentarioUseCaseImpl(ComentarioRepositoryPort comentarioRepositoryPort) {
        this.comentarioRepositoryPort = comentarioRepositoryPort;
    }

    @Override
    public Optional<Comentario> updateComentario(Integer id, Comentario updatedComentario) {
        return comentarioRepositoryPort.update(updatedComentario);
    }
}
