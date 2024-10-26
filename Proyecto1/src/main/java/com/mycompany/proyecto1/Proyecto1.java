/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyecto1;

import java.util.Scanner;
import javax.swing.JFrame;

import com.mycompany.proyecto1.Repositorys.ClientesRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author lestu
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.mycompany.proyecto1.Repositorys"})
public class Proyecto1 {



    public static void main(String[] args) {


        // Inicializa el contexto de Spring
        ApplicationContext context = SpringApplication.run(Proyecto1.class, args);
        // Obtiene el bean de la clase Creacion
        Creacion creacion = context.getBean(Creacion.class);

        System.setProperty("java.awt.headless", "false");


        MenuGUI menuGUI = new MenuGUI(creacion);
        menuGUI.setVisible(true);
        menuGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        JFrame frame = new JFrame("El Tunas");
//        frame.setSize(800, 500);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Menu menuGrafico = new Menu();
//        frame.add(menuGrafico);
//        frame.setVisible(true);



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
