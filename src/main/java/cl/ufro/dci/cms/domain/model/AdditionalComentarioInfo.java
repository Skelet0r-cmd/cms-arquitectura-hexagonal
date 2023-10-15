package cl.ufro.dci.cms.domain.model;


public class AdditionalComentarioInfo {
    private final Integer userId;
    private final String nombre;
    private final String apellido;
    private final String correo;
    private final Integer idGrupo;

    public AdditionalComentarioInfo(Integer userId, String nombre, String apellido, String correo, Integer idGrupo) {
        this.userId = userId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.idGrupo = idGrupo;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }
}
