/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lestu
 */
public class Creacion {

    DaoCrudJSON daoCrudJSON = new DaoCrudJSON();
    Datos datos = new Datos();
    ControlPedidos controlPedidos = new ControlPedidos();

    public void crearCliente() {
        Scanner sp = new Scanner(System.in);
        datos = daoCrudJSON.leer();
        Clientes cliente = new Clientes();
        System.out.println("ingrese el nombre");
        cliente.setNombre(sp.nextLine());
        System.out.println("ingresa el correo");
        cliente.setCorreo(sp.nextLine());
        System.out.println("ingresa el nit");
        cliente.setNit(sp.nextLine());
        datos.getClientes().add(cliente);
        daoCrudJSON.Insert(datos);
    }

    public void mostrarClientes() {
        datos = daoCrudJSON.leer();
        for (Clientes cliente : datos.getClientes()) {
            System.out.println("---------------------------------");
            System.out.println("el nombre es: " + cliente.getNombre());
            System.out.println("el nit es: " + cliente.getNit());
            System.out.println("el correo es: " + cliente.getCorreo());
            System.out.println("---------------------------------");
        }
    }

    public void crearPedido() {
        datos = daoCrudJSON.leer();
        Scanner sp = new Scanner(System.in);
        int i = 1;
        controlPedidos = daoCrudJSON.leerPedidos();
        int idPedido = controlPedidos.getControlPedidos().getLast().getId();
        Pedidos pedidos = new Pedidos();
        List<Productos> productos = new ArrayList<Productos>();
        ProductoPedido productoPedidos = new ProductoPedido();
        idPedido = idPedido + 1;
        int j = 1;
        String agregarProducto = "";
        int eleccion;
        ControlPedido controlPedido = new ControlPedido();
        //mostrar los nombres de los clientes
        System.out.println("-------------------------------------");
        System.out.println("elija el cliente para el pedido");
        for (Clientes cliente : datos.getClientes()) {
            System.out.println(cliente.getNombre() + "  " + i);
            i++;
        }
        System.out.println("--------------------------------------");
        System.out.println("cliente elegido");
        pedidos.setCliente(datos.getClientes().get(sp.nextInt()-1).getNombre());
        pedidos.setFecha(sp.nextLine());
        pedidos.setId(idPedido);
        System.out.println("--------------------------------------");
        System.out.println("estos son los productos en estock");

        do {
            j = 1;
            for (Productos producto : datos.getProductos()) {
                System.out.println(producto.getNombre() + "   " + j);
                System.out.println(producto.getPrecio());
                j++;
            }
            System.out.println("--------------------------------------");

            System.out.println("ingrese el numero de producto a agregar");
            eleccion = sp.nextInt();
            productoPedidos.setId(datos.getProductos().get(eleccion-1).getId());
            System.out.println("ingrese la cantidad ");
            productoPedidos.setCantidad(sp.nextInt());
            productos.add(datos.getProductos().get(eleccion-1));
            System.out.println("desea agregar otro producto");
            agregarProducto = sp.nextLine();
            agregarProducto = sp.nextLine();
        } while (!agregarProducto.equals("no"));
        pedidos.getProductos().add(productoPedidos);
        controlPedido.setCliente(pedidos.getCliente());
        controlPedido.setEstadoPedido("creado");
        controlPedido.setId(idPedido);
        datos.getPedidos().add(pedidos);
        controlPedidos.getControlPedidos().add(controlPedido);
        daoCrudJSON.InsertPedido(controlPedidos);
        daoCrudJSON.Insert(datos);

    }

    public void verPedidos() {
        List<Productos> productos = new ArrayList();
        controlPedidos = daoCrudJSON.leerPedidos();
        datos = daoCrudJSON.leer();
        List<Pedidos> pedidos = new ArrayList();
        List<ControlPedido> controlPedidoss = new ArrayList();
        pedidos = datos.getPedidos();
        controlPedidoss = controlPedidos.getControlPedidos();
        productos = datos.getProductos();

        for (Pedidos pedido : pedidos) {
            System.out.println("pedido numero :" + pedido.getId());
            System.out.println("el cliente es :" + controlPedidoss.get(pedido.getId() - 1).getCliente());
            System.out.println("el estado del pedido es :" + controlPedidoss.get(pedido.getId() - 1).getEstadoPedido());
            for (ProductoPedido productoPedido : pedidos.get(pedido.getId()-1).getProductos()) {
                System.out.println("producto " + productos.get((productoPedido.getId() - 1)).getNombre());
                System.out.println("categoria " + productos.get((productoPedido.getId() - 1)).getCategoria());
            }
            System.out.println("");
        }

    }

    public void avanzarFlujo() {
        int numeroPedido =0;
        Scanner sp = new Scanner(System.in);
        controlPedidos = daoCrudJSON.leerPedidos();
        datos = daoCrudJSON.leer();
        List<Pedidos> pedidos = new ArrayList();
        List<ControlPedido> controlPedidoss = new ArrayList();
        pedidos = datos.getPedidos();
        controlPedidoss = controlPedidos.getControlPedidos();

        for (Pedidos pedido : pedidos) {
            System.out.println("pedido numero :" + pedido.getId());
            System.out.println("el estado del pedido es :" + controlPedidoss.get(pedido.getId() - 1).getEstadoPedido());       
        }
        System.out.println("elija el pedido al que le dara avance");
        numeroPedido = sp.nextInt();
        System.out.println("ingrese el nuevo estado");
        sp.nextLine();
        controlPedidoss.get(numeroPedido-1).setEstadoPedido(sp.nextLine());
        controlPedidos.setControlPedidos(controlPedidoss);
        daoCrudJSON.InsertPedido(controlPedidos);
    }
}
