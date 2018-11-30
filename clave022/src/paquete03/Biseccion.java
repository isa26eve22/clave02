/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author BIENVENIDO
 */
import paquete02.Consola;
import programacion.*;

public class Biseccion extends Base {
    
    public double evaluar(Funcion funcion, double xa, double xb, double e) {

        System.out.println("Xa: "+xa);
        System.out.println("Xb: "+xb);
        System.out.println(" e: "+e);
        System.out.println();

        this.funcion = funcion;

        double fb = funcion.evaluar(xb);

        double xm = 0;

        double x = 0;

        double f = 0;

        double previo = 0;

        int i = 0;

        System.out.println(

                this.redondear("N", 5, true)

                + this.redondear("a")

                + this.redondear("b")

                + this.redondear("c")

                + this.redondear("f(a)")

                + this.redondear("f(b)")

                + this.redondear("f(c)")

                + this.redondear("E"));

        do {

            i++;

            xm = (xa + xb) / 2;

            double tmpxa, tmpxb;

            tmpxa = xa;

            tmpxb = xb;



            if ((fb * funcion.evaluar(xm)) > 0) {

                xb = xm;

            } else {

                xa = xm;

            }

            System.out.println(

                    this.redondear(i + "", 5, true)

                    + this.redondear(tmpxa)

                    + this.redondear(xm)

                    + this.redondear(tmpxb)

                    + this.redondear(funcion.evaluar(tmpxa))

                    + this.redondear(funcion.evaluar(xm))

                    + this.redondear(funcion.evaluar(tmpxb))

                    + this.redondear(this.getErrorAproximado(xm, previo)));

            previo = xm;

        } while (Math.abs(xb - xa) > Math.abs(e));

        System.out.println(" ");

        x = this.getInterpolacion(xa, xb);



        System.out.println("SOLUCION:" + this.redondear(x));

        System.out.println("VALOR DE COMPROBACION:" + this.redondear(funcion.evaluar(x)));

        return x;

    }



    public void consola() {



        Consola consola = new Consola();

        String funcion_cadena = consola.getCadena("INSERTE LA FUNCION");

        double Xa = consola.getNumero("INSERTE EL VALOR DE X1");

        double Xb = consola.getNumero("INSERTE EL VALOR DE X2");

        double error = consola.getNumero("INSERTE LA TOLERANCIA");

        boolean fraccion = consola.getBoolean("DESEAS USAR FRANCION?");

        int decimales = consola.getEntero("QUE CANTIDAD DE DECIMALES DESEAS USAR PARA EL REPORTE?", 6);

        int espaciado = consola.getEntero("CUANTO ESPACIO ES NECESARIO", 12);



        this.fraccion = fraccion;

        this.decimales = decimales;

        this.espaciado = espaciado < this.espaciado ? this.espaciado : espaciado;



        consola.limpiarPantalla();

        Funcion funcion = new Funcion(funcion_cadena);

        this.evaluar(funcion, Xa, Xb, error);

    }
    
}
