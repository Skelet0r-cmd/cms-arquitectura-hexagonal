package cl.ufro.dci.cms.domain.model;

public class AdditionalPostInfo {
    private final Integer idCategoria;
    private final String nombreCategoria;
    private final Integer idCategoriaSuperior;

    public AdditionalPostInfo(Integer idCategoria, String nombreCategoria, Integer idCategoriaSuperior) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.idCategoriaSuperior = idCategoriaSuperior;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public Integer getIdCategoriaSuperior() {
        return idCategoriaSuperior;
    }
}
