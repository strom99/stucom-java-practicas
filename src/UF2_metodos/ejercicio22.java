package UF2_metodos;


import java.util.Scanner;

import static java.lang.Math.sin;
/*
Dado el valor de un ángulo, sería interesante saber su seno, coseno y tangente. Escribir una
función que muestre en pantalla los datos anteriores.
 */

public class ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vector[] = new double[3];
        double numero ;
        double radians ;
        System.out.println("introduce un grado :");
        numero = sc.nextDouble();

        vector= sincostan(numero);
        System.out.println("vector");

    }

    public static double[] sincostan(double numero){
        double radians = Math.toRadians(numero);
        double data[] = new double[3];
        double seno = sin(radians) ;

        data[0] = seno;
        data[0] = seno;
        data[0] = seno;

        return data;
    }
}
