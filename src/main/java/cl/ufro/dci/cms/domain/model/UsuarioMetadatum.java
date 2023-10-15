package cl.ufro.dci.cms.domain.model;

import cl.ufro.dci.cms.infrastructure.entities.UsuarioEntity;

import java.time.Instant;

public class UsuarioMetadatum {
    private Integer id;
    private UsuarioEntity idUsuarioEntity;
    private String clave;
    private String valor;
    private String tipo;
    private Instant fecha;

    public UsuarioMetadatum(Integer id, UsuarioEntity idUsuarioEntity, String clave, String valor, String tipo, Instant fecha) {
        this.id = id;
        this.idUsuarioEntity = idUsuarioEntity;
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

    public UsuarioEntity getIdUsuarioEntity() {
        return idUsuarioEntity;
    }

    public void setIdUsuarioEntity(UsuarioEntity idUsuarioEntity) {
        this.idUsuarioEntity = idUsuarioEntity;
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
