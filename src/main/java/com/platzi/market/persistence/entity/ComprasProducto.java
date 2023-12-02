package com.platzi.market.persistence.entity;

import jakarta.persistence.*;

/**
 * La tabla compras-productos tiene dos claves únicas como su primary key: compras y productos
 * Para crear la clave de esta tabla, usaremos la clase PurchasesProductPK, que será la encargada de contener ambos valores|
 * Interfaz que extiende CrudRepository: CrudRepository
 * Clase que implementa los métodos CRUD: Repository
 */
@Entity
@Table(name="compras-productos")
public class ComprasProducto {

    @EmbeddedId
    private ComprasProductoPK id;

    private Integer cantidad;
    private Double total;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = true, updatable = true)
    private Producto Producto;

    public ComprasProductoPK getId() {
        return id;
    }

    public void setId(ComprasProductoPK id) {
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

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public com.platzi.market.persistence.entity.Producto getProducto() {
        return Producto;
    }

    public void setProducto(com.platzi.market.persistence.entity.Producto producto) {
        Producto = producto;
    }
}
