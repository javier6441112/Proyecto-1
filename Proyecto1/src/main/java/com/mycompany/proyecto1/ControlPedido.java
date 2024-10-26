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
@Table(name = "control_pedidos")
public class ControlPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_control")
    private Integer idControl;

    @Column(name = "nit", length = 13, nullable = false)
    private String nit;

    @Column(name = "estado_pedido", nullable = false)
    private Integer estadoPedido;
    
    @Column(name = "id_pedido", nullable = false)
    private Integer idPedido;
    
    
        @ManyToOne
    @JoinColumn(name = "nit", referencedColumnName = "nit", insertable = false, updatable = false)
    private Clientes clientes;
        
        @ManyToOne
    @JoinColumn(name = "id_pedido", referencedColumnName = "id_pedido", insertable = false, updatable = false)
    private Pedidos pedidos;

    public ControlPedido() {
    }

    public ControlPedido(Integer idControl, String nit, Integer estadoPedido, Integer idPedido, Clientes clientes, Pedidos pedidos) {
        this.idControl = idControl;
        this.nit = nit;
        this.estadoPedido = estadoPedido;
        this.idPedido = idPedido;
        this.clientes = clientes;
        this.pedidos = pedidos;
    }

        
        
    public Integer getIdControl() {
        return idControl;
    }

    public void setIdControl(Integer idControl) {
        this.idControl = idControl;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Integer getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(Integer estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public Pedidos getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }

        
        
}
