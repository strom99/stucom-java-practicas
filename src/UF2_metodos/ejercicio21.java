package UF2_metodos;

import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero ;
        int numeros;
        System.out.println("dame un numero : ");
        numero = sc.nextInt();

        numeros = suma_numeros(numero);
        System.out.println("suma = " + numeros);

    }

    public static int suma_numeros(int num){
        int suma = 0 ;
        int count = 1;

        for(int i= 0; i < 60 ; i++){
            if (i % 2 != 0){
                suma = suma + i ;
                System.out.println(i);
                count++;

                if(count == num){
                    break;
                }
            }
        }

        return suma;
    }

    public static int[] vector (int num){
        int vector[] = new int[num];

        for(int i= 0; i <= num ; i++){
            if (i % 2 != 0){
                vector[i] = i;

            }
        }
        return vector;
    }
}
