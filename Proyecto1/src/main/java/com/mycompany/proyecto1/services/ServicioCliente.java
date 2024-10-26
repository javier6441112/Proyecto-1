package com.mycompany.proyecto1.services;

import com.mycompany.proyecto1.Clientes;
import com.mycompany.proyecto1.Repositorys.ClientesRepo;

import java.util.List;

public class ServicioCliente {
    private final ClientesRepo clientesRepo;

    public ServicioCliente(ClientesRepo clientesRepo) {
        this.clientesRepo = clientesRepo;
    }

    public List<Clientes> getClientes() {
        return clientesRepo.findAll();
    }
}
