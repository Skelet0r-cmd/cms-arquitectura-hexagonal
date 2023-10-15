package cl.ufro.dci.cms.application.usecases.categoria;

import cl.ufro.dci.cms.domain.model.Categoria;
import cl.ufro.dci.cms.domain.ports.in.categoria.RetrieveCategoriaUseCase;
import cl.ufro.dci.cms.domain.ports.out.CategoriaRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveCategoriaUseCaseImpl implements RetrieveCategoriaUseCase {

    private final CategoriaRepositoryPort categoriaRepositoryPort;

    public RetrieveCategoriaUseCaseImpl(CategoriaRepositoryPort categoriaRepositoryPort) {
        this.categoriaRepositoryPort = categoriaRepositoryPort;
    }


    @Override
    public Optional<Categoria> getCategoriaById(Integer id) {
        return categoriaRepositoryPort.findById(id);
    }

    @Override
    public List<Categoria> getAllCategorias() {
        return categoriaRepositoryPort.findAll();
    }
}
