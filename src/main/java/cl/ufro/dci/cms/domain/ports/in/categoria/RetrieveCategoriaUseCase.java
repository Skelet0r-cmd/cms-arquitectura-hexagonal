package cl.ufro.dci.cms.domain.ports.in.categoria;

import cl.ufro.dci.cms.domain.model.Categoria;

import java.util.List;
import java.util.Optional;

public interface RetrieveCategoriaUseCase {
    Optional<Categoria> getCategoriaById (Integer id);
    List<Categoria> getAllCategorias();
}
