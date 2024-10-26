package com.mycompany.proyecto1.Repositorys;

import com.mycompany.proyecto1.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepo extends JpaRepository<Productos, Object> {
}
