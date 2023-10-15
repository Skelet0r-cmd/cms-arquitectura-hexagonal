package cl.ufro.dci.cms.domain.ports.out;

import cl.ufro.dci.cms.domain.model.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepositoryPort {
    Categoria save(Categoria categoria);
    Optional<Categoria> findById(Integer id);
    List<Categoria> findAll();
    Optional<Categoria> update(Categoria categoria);
    boolean deleteById(Integer id);
}
