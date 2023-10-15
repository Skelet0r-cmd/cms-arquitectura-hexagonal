package cl.ufro.dci.cms.application.usecases.comentario;

import cl.ufro.dci.cms.domain.model.Comentario;
import cl.ufro.dci.cms.domain.ports.in.comentario.CreateComentarioUseCase;
import cl.ufro.dci.cms.domain.ports.in.comentario.DeleteComentarioUseCase;
import cl.ufro.dci.cms.domain.ports.out.ComentarioRepositoryPort;

public class DeleteComentarioUseCaseImpl implements DeleteComentarioUseCase {

    private final ComentarioRepositoryPort comentarioRepositoryPort;

    public DeleteComentarioUseCaseImpl(ComentarioRepositoryPort comentarioRepositoryPort) {
        this.comentarioRepositoryPort = comentarioRepositoryPort;
    }

    @Override
    public boolean deleteComentario(Integer id) {
        return comentarioRepositoryPort.deleteById(id);
    }
}
