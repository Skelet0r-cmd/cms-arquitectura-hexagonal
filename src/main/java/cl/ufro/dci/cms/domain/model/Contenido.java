package cl.ufro.dci.cms.domain.model;

import java.time.Instant;

public class Contenido {
    private Integer id;
    private String tipo;
    private String contenido;
    private Instant fecha;

    public Contenido(Integer id, String tipo, String contenido, Instant fecha) {
        this.id = id;
        this.tipo = tipo;
        this.contenido = contenido;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }
}
