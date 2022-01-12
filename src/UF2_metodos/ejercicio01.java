package UF2_metodos;

import java.util.Scanner;

public class ejercicio01 {

    /**
     * Realizar una función, a la que se le pase como parámetro un número N, y muestre por pantalla N
     * veces, el mensaje: “Módulo ejecutándose”.
     */
    public static void main(String[] args) {
        int num ;
        Scanner input = new Scanner (System.in);
        System.out.println("Ingresa un numero : ");
        num = input.nextInt();
        System.out.println("----------------------------");
        show(num);
        System.out.println("----------------------------");
    }

    public static void show(int num){
        for(int i = 0 ; i < num ; i++){
            System.out.println("TE VALE VERGA WEE");
        }
    }
}
