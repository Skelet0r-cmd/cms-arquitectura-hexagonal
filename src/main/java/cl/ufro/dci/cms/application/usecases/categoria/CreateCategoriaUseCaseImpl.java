package cl.ufro.dci.cms.application.usecases.categoria;

import cl.ufro.dci.cms.domain.model.Categoria;
import cl.ufro.dci.cms.domain.ports.in.categoria.CreateCategoriaUseCase;
import cl.ufro.dci.cms.domain.ports.out.CategoriaRepositoryPort;

public class CreateCategoriaUseCaseImpl implements CreateCategoriaUseCase {

    private final CategoriaRepositoryPort categoriaRepositoryPort;

    public CreateCategoriaUseCaseImpl(CategoriaRepositoryPort categoriaRepositoryPort) {
        this.categoriaRepositoryPort = categoriaRepositoryPort;
    }

    @Override
    public Categoria createCategoria(Categoria categoria) {
        return categoriaRepositoryPort.save(categoria);
    }
}
