package pruebasJava;

import java.util.Arrays;
import java.util.Scanner;

public class ej02Matrices {
    /**
     * Crea un array de 10 números enteros con números aleatorios entre 10 y 20 y muéstralo por
     pantalla. A continuación, elimina los valores de 12 y desplazar los valores posteriores hacia el
     índice 0. Llenar los valores vacíos con 0. Mostrar el array resultante.
     Ejemplo:
     13 12 18 16 12 18 15 19 13 13
     13 18 16 18 15 19 13 13 0 0
     */
    public static void main(String[] args) {
        int [] numeros = new int [10];
        int [] numeros2 = new int[10];
        Scanner sc = new Scanner(System.in);
        int numAl = numeros.length-1;
        int count = 0;

        for(int i = 0 ; i < numeros.length ; i++){
            numAl = (int)(Math.random()* 11 ) + 10 ;
            numeros[i] = numAl;

        }
        System.out.println(Arrays.toString(numeros));

        for( int i = 0 ; i < numeros.length ; i ++){
            if(numeros[i] != 12){
                numeros[count++] = numeros[i];

            }
        }

        while(count < numeros.length){
            numeros[count++] = 0;
        }

        System.out.println(Arrays.toString(numeros));
    }
}
