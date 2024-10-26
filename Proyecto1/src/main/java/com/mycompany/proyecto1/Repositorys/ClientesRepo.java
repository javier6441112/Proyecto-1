/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyecto1.Repositorys;

import com.mycompany.proyecto1.ClientePedidos;
import com.mycompany.proyecto1.Clientes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public interface ClientesRepo extends JpaRepository <Clientes, Object>{
    @Query("select * from clientes c inner join pedidos p c.nit = p.nit")
    List<ClientePedidos> findAllPedidos();   
}
