package cl.ufro.dci.cms.domain.model;

import cl.ufro.dci.cms.infrastructure.entities.GrupoEntity;

import java.time.Instant;

public class Usuario {
    private Integer id;
    private String nombre;
    private String apellido;
    private Instant fecha;
    private String contrasena;
    private String correo;
    private GrupoEntity idGrupoEntity;

    public Usuario(Integer id, String nombre, String apellido, Instant fecha, String contrasena, String correo, GrupoEntity idGrupoEntity) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.contrasena = contrasena;
        this.correo = correo;
        this.idGrupoEntity = idGrupoEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public GrupoEntity getIdGrupoEntity() {
        return idGrupoEntity;
    }

    public void setIdGrupoEntity(GrupoEntity idGrupoEntity) {
        this.idGrupoEntity = idGrupoEntity;
    }
}
