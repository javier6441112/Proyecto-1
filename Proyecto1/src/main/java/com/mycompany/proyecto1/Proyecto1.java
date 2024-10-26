/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyecto1;

import java.util.Scanner;
import javax.swing.JFrame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author lestu
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.mycompany.proyecto1.Repositorys"})
public class Proyecto1 {

    public void ejecutable() {
//   DaoCrudJSON daoCrudJSON = new DaoCrudJSON ();
//       Datos datos = daoCrudJSON.leer();
//      System.out.println(datos.getClientes().get(0).getNombre());
////      System.out.println(datos.getPedidos().get(0).getCliente());
    }

    public void insetar() {

//    DaoCrudJSON daoCrudJSON = new DaoCrudJSON ();
//     ControlPedidos controlPedidos = new ControlPedidos();
//     
//     ControlPedido controlPedido = new ControlPedido();
//     controlPedido.setCliente("javier");
//     controlPedido.setEstadoPedido("finalizado");
//     controlPedido.setId(1);
//     controlPedidos.getControlPedidos().add(controlPedido);
//daoCrudJSON.InsertPedido(controlPedidos);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("El Tunas");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu menuGrafico = new Menu();
        frame.add(menuGrafico);
         frame.setVisible(true);

        // Inicializa el contexto de Spring
        ApplicationContext context = SpringApplication.run(Proyecto1.class, args);
        // Obtiene el bean de la clase Creacion
        Creacion creacion = context.getBean(Creacion.class);

        //        Proyecto1 proyecto1= new Proyecto1();
        //        proyecto1.insetar();
        int menu = 0;
//        Creacion creacion = new Creacion();
        Scanner sp = new Scanner(System.in);
        do {
            System.out.println("Nuevo cliente           1");
            System.out.println("ver clientes            2");
            System.out.println("Crear pedidos           3");
            System.out.println("ver pedidos             4");
            System.out.println("cambiar estado producto 5 ");
            System.out.println("salir                   6");

            menu = sp.nextInt();
            switch (menu) {
                case 1:
                    creacion.crearCliente();
                    break;

                case 2:
                    creacion.mostrarClientes();
                    break;

                case 3:
                    creacion.crearPedido();
                    break;

                case 4:
                    creacion.verPedidos();
                    break;

                case 5:
                    creacion.avanzarFlujo();
                    break;
            }

        } while (menu != 6);

    }
}
