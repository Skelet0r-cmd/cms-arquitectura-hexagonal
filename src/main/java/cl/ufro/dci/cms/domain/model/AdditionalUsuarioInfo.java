package cl.ufro.dci.cms.domain.model;

public class AdditionalUsuarioInfo {
    private final Integer idGrupo;
    private final String nombreGrupo;

    public AdditionalUsuarioInfo(Integer idGrupo, String nombreGrupo) {
        this.idGrupo = idGrupo;
        this.nombreGrupo = nombreGrupo;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }
}
