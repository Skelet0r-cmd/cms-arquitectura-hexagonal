package cl.ufro.dci.cms.domain.model;

import java.time.Instant;

public class Grupo {
    private Integer id;
    private String nombre;
    private Instant fecha;

    public Grupo(Integer id, String nombre, Instant fecha) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
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

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }
}
