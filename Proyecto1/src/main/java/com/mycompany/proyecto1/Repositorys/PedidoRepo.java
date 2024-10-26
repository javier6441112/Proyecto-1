package com.mycompany.proyecto1.Repositorys;

import com.mycompany.proyecto1.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepo extends JpaRepository<Pedidos, Object> {
}
