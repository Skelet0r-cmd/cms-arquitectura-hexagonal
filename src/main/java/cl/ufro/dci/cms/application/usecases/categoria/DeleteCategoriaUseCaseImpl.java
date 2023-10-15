package cl.ufro.dci.cms.application.usecases.categoria;

import cl.ufro.dci.cms.domain.ports.in.categoria.DeleteCategoriaUseCase;
import cl.ufro.dci.cms.domain.ports.out.CategoriaRepositoryPort;

public class DeleteCategoriaUseCaseImpl implements DeleteCategoriaUseCase {

    private final CategoriaRepositoryPort categoriaRepositoryPort;

    public DeleteCategoriaUseCaseImpl(CategoriaRepositoryPort categoriaRepositoryPort) {
        this.categoriaRepositoryPort = categoriaRepositoryPort;
    }

    @Override
    public boolean deleteCategoria(Integer id) {
        return categoriaRepositoryPort.deleteById(id);
    }
}
