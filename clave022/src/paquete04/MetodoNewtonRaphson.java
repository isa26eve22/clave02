/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;


import paquete02.Consola;
import paquete02.Menu;
import paquete02.MenuCallback;
import programacion.*;
import paquete03.*;
import java.io.*;


public class MetodoNewtonRaphson {
    
 
    public static void main(String[] args) {

        final NewtonRaphson metodo = new NewtonRaphson();


        Menu menu = new Menu();

        menu.setTitulo("NEWTON RAPSHON");



        Menu submenu = new Menu();


        submenu.agregar("APROXIMAR LA RAIZ=====>>>>: x^2-5*x+6", new MenuCallback() {

            public void ejecutar() {



                Funcion funcion = new Funcion("x^2-5*x+6");

                metodo.evaluar(funcion, 1.5, 0.01, 50);

            }

        });

        submenu.agregar("APROXIMAR RAIZ NEGATIVA=====>>>: x^3+3*(x^2)-1", new MenuCallback() {

            public void ejecutar() {

                Funcion funcion = new Funcion("x^3+3*(x^2)-1");

                metodo.evaluar(funcion, -2.5, 0.0001, 50);

            }

        });

        submenu.agregar("APROXIMAR LA RAIZ POSITIVA====>>>>>: 7*(x^4)+3*(x^2)-(3.14159265)", new MenuCallback() {

            public void ejecutar() {


                Funcion funcion = new Funcion("7*(x^4)+3*(x^2)-(3.14159265)");

                metodo.evaluar(funcion, 0, 0.001, 50);

            }

        });

        submenu.agregar("APROXIMAR LA RAIZ POSITIVA: 7*(x^4)+3*(x^2)-(3.14159265)", new MenuCallback() {

            public void ejecutar() {

                Funcion funcion = new Funcion("7*(x^4)+3*(x^2)-(3.14159265)");

                metodo.evaluar(funcion, 0, 0.001, 50);

            }

        });

        submenu.agregar("MODIFICAR EL PROGRAMA DEL EJERCICIO AGREGANDO APROXIMACION DE RAIZ POR METODO DE BISSECION: x^3+3*(x^2)-1", new MenuCallback() {

            public void ejecutar() {

                Funcion funcion = new Funcion("x^3+3*(x^2)-1");

                Biseccion biseccion = new Biseccion();

                biseccion.evaluar(funcion, -2.5, -3.5, 0.0001);

            }

        });


        menu.agregar("RESOVER EJERCICIO", submenu);

        menu.agregar("INGRESE UNA FUNCION", new MenuCallback() {

            public void ejecutar() {

              metodo.consola();

            }

        });

        menu.mostrar();

    }
    
}
