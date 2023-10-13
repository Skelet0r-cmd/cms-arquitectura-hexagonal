package cl.ufro.dci.cms.domain.model;

import java.time.Instant;

public class Categoria {
    private Integer id;
    private String nombre;
    private String descripcion;
    private Instant fecha;
    private Integer categoriaSuperior;

    public Categoria(Integer id, String nombre, String descripcion, Instant fecha, Integer categoriaSuperior) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.categoriaSuperior = categoriaSuperior;
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

    public Integer getCategoriaSuperior() {
        return categoriaSuperior;
    }

    public void setCategoriaSuperior(Integer categoriaSuperior) {
        this.categoriaSuperior = categoriaSuperior;
    }
}
