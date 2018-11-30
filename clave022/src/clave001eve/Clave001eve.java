/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clave001eve;

/**
 *
 * @author BIENVENIDO
 */
import paquete02.Menu;

import paquete02.MenuCallback;

import paquete03.*;
public class Clave001eve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Menu menu = new Menu();

        menu.setTitulo("METODO DE NUMEROS");



        menu.agregar("NEWTON RAPHSON", new MenuCallback() {

            public void ejecutar() {

                NewtonRaphson metodo = new NewtonRaphson();

                metodo.consola();

            }

        });


        menu.agregar(" EL METODO DE RUNGE KUTTA", new MenuCallback() {

            public void ejecutar() {

                RungeKutta metodo = new RungeKutta();

                metodo.consola();

            }

        });
        menu.mostrar();
    }
    
}
