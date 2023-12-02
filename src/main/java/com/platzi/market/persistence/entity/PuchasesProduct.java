package com.platzi.market.persistence.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * La tabla compras-productos tiene dos claves únicas como su primary key: compras y productos
 * Para crear la clave de esta tabla, usaremos la clase PurchasesProductPK, que será la encargada de contener ambos valores|
 */
@Entity
@Table(name="compras-productos")
public class PuchasesProduct {

    @EmbeddedId
    private PurchasesProductPK id;

    private Integer cantidad;
    private Double total;
    private Boolean estado;

    public PurchasesProductPK getId() {
        return id;
    }

    public void setId(PurchasesProductPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
