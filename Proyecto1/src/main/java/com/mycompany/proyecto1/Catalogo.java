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
import jakarta.persistence.Table;



/**
 *
 * @author user
 */
@Entity
@Table(name = "catalogo")
public class Catalogo  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_catalogo")
    private Integer idCatalogo;

    @Column(name = "codigo_catalogo", nullable = false)
    private Integer codigoCatalgo;

    @Column(name = "descripcion", length = 30 , nullable = false)
    private String descripcion;

    public Catalogo(Integer idCatalogo, Integer codigoCatalgo, String descripcion) {
        this.idCatalogo = idCatalogo;
        this.codigoCatalgo = codigoCatalgo;
        this.descripcion = descripcion;
    }

    public Catalogo() {
    }

    public Integer getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(Integer idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public Integer getCodigoCatalgo() {
        return codigoCatalgo;
    }

    public void setCodigoCatalgo(Integer codigoCatalgo) {
        this.codigoCatalgo = codigoCatalgo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
