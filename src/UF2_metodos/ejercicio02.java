package UF2_metodos;

import java.util.Scanner;

public class ejercicio02 {
    /**
    * Diseñar una función que tenga como parámetros dos números, y que calcule el máximo.
    */
    public static int maximun(int a ,int b){
        int max ;
        if(a > b){
            max = a;
        }else{
            max = b;
        }
        return (max);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max ;
        int a , b;

        System.out.println("Ingresa un numero :");
        a = input.nextInt();
        System.out.println("Ingresa un numero :");
        b = input.nextInt();

        max = maximun(a ,b);
        System.out.println("el numero maximo es :" + max);
    }
}
