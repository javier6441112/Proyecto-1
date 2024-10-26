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
import java.time.LocalDateTime;


/**
 *
 * @author lestu
 */
@Entity
@Table(name = "pedidos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    Integer id;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    @Column(name = "nit", length = 13)
    private String nit;

    @Column(name = "estado_pedido")
    private Long estadoPedido;

//    @ManyToOne
//    @JoinColumn(name = "nit", referencedColumnName = "nit", insertable = false, updatable = false)
//    private Clientes Clientes;

    public Pedidos() {
    }

    public Pedidos(Integer id, LocalDateTime fecha, String nits) {
        this.id = id;
        this.fecha = fecha;
        this.nit = nit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Long getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(Long estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
}
