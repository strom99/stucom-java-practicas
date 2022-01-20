package UF2_metodos;

import java.util.Scanner;

public class ejercicio09 {
    /*
    Módulo al que se le pasa un número entero y devuelve el número de divisores primos que tiene.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingresa un numero para calcular los divisores : ");
        numero = sc.nextInt();

        int divisores = Countdivisores(numero) ;
        System.out.println("Los cantidad de divisores primos son : " + divisores);
    }

    public static int Countdivisores(int numero){
        int i ;
        int count = 1;
        int numeros ;

        for(i = 2 ; i <=  numero ; i++){
            if(esPrimo(i) && numero % i == 0){
                count++;
            }
        }
        return count;
    }

    public static boolean esPrimo(int numero){
        boolean primo = true;
        int i ;
        return primo;
    }
}
