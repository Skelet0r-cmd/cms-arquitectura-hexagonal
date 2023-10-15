package cl.ufro.dci.cms.application.usecases.categoria;

import cl.ufro.dci.cms.domain.model.Categoria;
import cl.ufro.dci.cms.domain.ports.in.categoria.UpdateCategoriaUseCase;
import cl.ufro.dci.cms.domain.ports.out.CategoriaRepositoryPort;

import java.util.Optional;

public class UpdateCategoriaUseCaseImpl implements UpdateCategoriaUseCase {

    private final CategoriaRepositoryPort categoriaRepositoryPort;

    public UpdateCategoriaUseCaseImpl(CategoriaRepositoryPort categoriaRepositoryPort) {
        this.categoriaRepositoryPort = categoriaRepositoryPort;
    }

    @Override
    public Optional<Categoria> updateCategoria(Integer id, Categoria updatedCategoria) {
        return categoriaRepositoryPort.update(updatedCategoria);
    }
}
