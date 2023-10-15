package cl.ufro.dci.cms.application.usecases.comentario;

import cl.ufro.dci.cms.domain.model.Comentario;
import cl.ufro.dci.cms.domain.ports.in.comentario.CreateComentarioUseCase;
import cl.ufro.dci.cms.domain.ports.out.ComentarioRepositoryPort;

public class CreateComentarioUseCaseImpl implements CreateComentarioUseCase {

    private final ComentarioRepositoryPort comentarioRepositoryPort;

    public CreateComentarioUseCaseImpl(ComentarioRepositoryPort comentarioRepositoryPort) {
        this.comentarioRepositoryPort = comentarioRepositoryPort;
    }


    @Override
    public Comentario createComentario(Comentario comentario) {
        return comentarioRepositoryPort.save(comentario);
    }
}
