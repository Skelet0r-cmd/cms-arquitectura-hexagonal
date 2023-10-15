package cl.ufro.dci.cms.domain.model;

import java.time.Instant;

public class Categoria {
    private Integer id;
    private String nombre;
    private String descripcion;
    private Instant fecha;
    private Integer idCategoriaSuperior;

    public Categoria(Integer id, String nombre, String descripcion, Instant fecha, Integer idCategoriaSuperior) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.idCategoriaSuperior = idCategoriaSuperior;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }

    public Integer getIdCategoriaSuperior() {
        return idCategoriaSuperior;
    }

    public void setIdCategoriaSuperior(Integer idCategoriaSuperior) {
        this.idCategoriaSuperior = idCategoriaSuperior;
    }
}
