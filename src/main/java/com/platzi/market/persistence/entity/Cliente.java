package com.platzi.market.persistence.entity;

import jakarta.persistence.*;

import java.util.List;


/**
 * Interfaz que extiende CrudRepository: ClienteCrudRepository
 * Clase que implementa los métodos CRUD: ClienteRepository
 *
 */
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    private Long id;
    private String nombre;
    private String apellidos;
    private Integer celular;
    private String direccion;

    @Column(name = "correo_electronico")
    private String email;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }
}
