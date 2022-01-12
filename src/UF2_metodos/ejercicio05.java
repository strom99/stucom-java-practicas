package UF2_metodos;

import java.util.Scanner;

public class ejercicio05 {
    /**
     * Función a la que se le pasan dos enteros y muestra todos los números comprendidos entre ellos,
     inclusive.
     */
    public static void main(String[] args) {
        int numA, numB;
        Scanner num = new Scanner(System.in);
        System.out.println("Ingresa el primer valor: ");
        numA = num.nextInt();
        System.out.println("Ingresa el segundo Valor: ");
        numB = num.nextInt();

        System.out.println("Valores comprendidos : ");
        numeros(numA, numB);
    }
    public static void numeros(int a, int b){
        int mayor = 0, menor = 0;
        if(a == b){
            System.out.println("Datos iguales.");
        }
        else{
            if(a > b){
                mayor = a;
                menor = b;
            }
            else{
                mayor = b;
                menor = a;
            }
        }
        for (int i = menor; i <= mayor; i++) {
            System.out.print(i + " ");
        }
    }
}
