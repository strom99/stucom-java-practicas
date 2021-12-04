
package practica3;

import java.util.Scanner;

/**
 *Leer por teclado una serie de 10 números enteros, La aplicación debe indicarnos si los números están
    ordenados de forma creciente, decreciente, o si están desordenados.
 */
public class practicaClase07 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numeros=0;
        int i = 0;
        boolean salida = true;
        int [] numeroArray = new int[10];
        
        for(i =0 ; i <= numeroArray.length ; i++){
        System.out.println("introduce los numeros :");
        numeroArray[i] = sc.nextInt();
        
        
            /*if(numeros <= 0){
                while(salida){
                    System.out.println("introduce los numeros :");
                    numeros = sc.nextInt();
                    if(numeros >= 0 ){
                        salida = false;
                    }
                }
            }*/
        
        }
        System.out.println(numeroArray[i]);
        
        
        
        
    }
    
}
