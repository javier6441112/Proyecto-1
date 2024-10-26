package com.mycompany.proyecto1.Repositorys;

import com.mycompany.proyecto1.ProductoPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductosPedidoRepo extends JpaRepository<ProductoPedido, Long> {

}
