package com.mycompany.proyecto1;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos_pedido")
public class ProductoPedido {

    @Column(name = "cantidad")
    private Integer cantidad;

    @EmbeddedId
    private ProductoPedidoPK productoPedidoPK;


    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public ProductoPedidoPK getProductoPedidoPK() {
        return productoPedidoPK;
    }

    public void setProductoPedidoPK(ProductoPedidoPK productoPedidoPK) {
        this.productoPedidoPK = productoPedidoPK;
    }
}
