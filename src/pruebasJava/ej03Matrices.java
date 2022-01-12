package pruebasJava;

import java.util.Arrays;

public class ej03Matrices {
    /**
     * Genera un array de 20 posiciones donde cada posición valga 0. Después se deberán ir generado
     números aleatorios entre 1 y 10 de tal manera que:
     - Si el valor generado es par, se guardará en la primera posición par que esté libre, si es impar
     se guardará en la primera posición impar libre. El programa dejará de pedir valores aleatorios
     cuando se completen las celdas pares o impares. Y posteriormente devolverá el resultado
     del array final con el resultado de la suma de todos los valores.
     */
    public static void main(String[] args) {
        int [] array = new int [20];
        int numAl;
        int cont_par = 0;
        int suma_valores = 0;
        int cont_neg = 1;
        boolean salida =true;

        for(int i = 0; i < array.length ; i++){
            array[i] = 0;
        }

        System.out.println(Arrays.toString(array));
        //numAl = (int) (Mat.random()* 10 ) + 1;

        while (salida){
            numAl = (int) (Math.random()* 10 ) + 1;
            if (numAl % 2 == 0) {

                if(cont_par <= 18){
                    array[cont_par] = numAl;
                    System.out.println(cont_par + " " + numAl);
                    suma_valores += numAl;
                }
                cont_par+=2;

            } else {
                if(cont_neg <= 19){
                    array[cont_neg] = numAl;
                    System.out.println(cont_neg + " " + numAl);
                    suma_valores += numAl;
                }
                cont_neg+=2;
            }

            if (cont_par > array.length || cont_neg > array.length) {
                salida = false;
            }


        }

        System.out.println(Arrays.toString(array));
        System.out.println("la suma total de valores es : "+suma_valores);
    }
}
