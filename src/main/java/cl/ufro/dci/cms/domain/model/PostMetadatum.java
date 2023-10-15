package cl.ufro.dci.cms.domain.model;

import cl.ufro.dci.cms.infrastructure.entities.PostEntity;

import java.time.Instant;

public class PostMetadatum {
    private Integer id;
    private PostEntity idPostEntity;
    private String clave;
    private String valor;
    private String tipo;
    private Instant fecha;

    public PostMetadatum(Integer id, PostEntity idPostEntity, String clave, String valor, String tipo, Instant fecha) {
        this.id = id;
        this.idPostEntity = idPostEntity;
        this.clave = clave;
        this.valor = valor;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PostEntity getIdPostEntity() {
        return idPostEntity;
    }

    public void setIdPostEntity(PostEntity idPostEntity) {
        this.idPostEntity = idPostEntity;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }
}
