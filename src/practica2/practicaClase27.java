
package practica2;

import java.util.Scanner;

/**
 *Realizar un juego para adivinar un número, Para ello pedir un número N, y después ir pidiendo
números indicando “mayor” o “menor” según sea mayor o menor respecto a N, El proceso termina
cuando el usuario acierta.
** */
public class practicaClase27 {

    public static void main(String[] args) {
        int numero, n ;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca un numero N:");
        n = sc.nextInt();
        System.out.println("introduzca numeros para adivinar :");
        numero = sc.nextInt();
        
        while(numero != n){
            
            if(numero > n){
                System.out.println("es mayor ");
            }else{
                System.out.println("es menor");
            }
            
            System.out.println("introduzca numeros para adivinar :");
            numero = sc.nextInt();
            
        }
        System.out.println("adivinaste el numero");
    }

    
}
