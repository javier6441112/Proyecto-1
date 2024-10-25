/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author lestu
 */
@Entity
@Table(name = "clientes")
public class Clientes {

    @Id
    @Column(name = "nit", length = 13, nullable = false)
    private String nit;

    @Column(name = "nombre", length = 25)
    private String nombre;

    @Column(name = "correo", length = 25)
    private String correo;

    public Clientes() {
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
