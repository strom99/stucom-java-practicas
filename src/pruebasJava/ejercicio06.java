package pruebasJava;

import java.util.Scanner;

public class ejercicio06 {

    /**
     * Crea un programa que tenga definida una variable count iniciada a 10 (la podéis
     hacer variar), Ahora genera un programa que muestre tantos números como la
     variable count de la secuencia de Fibonacci (investiga un poco cómo funciona
     esta secuencia).

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("introduce un numero mayor a 10 : ");
        int numero = sc.nextInt();
        boolean salida = true;
        int contador = 0;
        int i = 0;

        while(salida){
            i++;
            for(int e = 0; e < i ; e++){
                System.out.println(i+"- "+ e);
                contador++;
            }
            if(contador == numero){
                salida = false;
            }
        }

        System.out.println("numero : "+ numero);
    }
}
