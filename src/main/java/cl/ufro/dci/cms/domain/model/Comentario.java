package cl.ufro.dci.cms.domain.model;

import java.time.Instant;

public class Comentario {
    private Integer id;
    private String comentario;
    private String respuesta;
    private Instant fecha;

    public Comentario(Integer id, String comentario, String respuesta, Instant fecha) {
        this.id = id;
        this.comentario = comentario;
        this.respuesta = respuesta;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }
}
