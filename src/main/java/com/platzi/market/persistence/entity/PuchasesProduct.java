package com.platzi.market.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * La tabla compras-productos tiene dos claves únicas como su primary key: compras y productos
 * Para crear la clave de esta tabla, usaremos la clase PurchasesProductPK, que será la encargada de contener ambos valores|
 */
@Entity
@Table(name="compras-productos")
public class PuchasesProduct {



}
