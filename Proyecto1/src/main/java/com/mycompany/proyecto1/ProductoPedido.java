/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


/**
 *
 * @author lestu
 */
@Entity
@Table(name = "Productos_pedido")
public class ProductoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Productos_pedido")
    private Integer idProductosPedido;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "id_produccto")
    private Integer idProducto;

    @ManyToOne
    @JoinColumn(name = "id_produccto", referencedColumnName = "id_produccto", insertable = false, updatable = false)
    private Productos productos;

    public ProductoPedido() {
    }

    public ProductoPedido(Integer idProductosPedido, Integer cantidad, Integer idProducto, Productos productos) {
        this.idProductosPedido = idProductosPedido;
        this.cantidad = cantidad;
        this.idProducto = idProducto;
        this.productos = productos;
    }

    public Integer getIdProductosPedido() {
        return idProductosPedido;
    }

    public void setIdProductosPedido(Integer idProductosPedido) {
        this.idProductosPedido = idProductosPedido;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

}
