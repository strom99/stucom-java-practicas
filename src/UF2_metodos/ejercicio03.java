package UF2_metodos;

import java.util.Scanner;

public class ejercicio03 {
    /**
     * una versión que calcule el máximo de 3 números.
     */

    public static int maximun(int a , int b , int c){
        int numMaximo ;
        /*
        if(a > b){
            numMaximo = a ;
        }else{
            numMaximo = b;
        }

        if(numMaximo < c){
            numMaximo = c ;
        }*/

        if(a > b && a > c){
            numMaximo = a ;
        }else if(b > a && b > c){
            numMaximo = b ;
        }else{
            numMaximo = c;
        }


        return (numMaximo);
    }

    public static void main(String[] args) {
        int numMaximo;
        int a , b, c ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame tres numeros :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        numMaximo = maximun(a , b,c);
        System.out.println("el numero maximo es  : " + numMaximo);
    }
}
