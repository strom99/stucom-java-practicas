
package practica2;

import java.util.Scanner;

public class practicaClase28 {

    /**
     * Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
     */
    public static void main(String[] args) {
        
        int numeros,suma;
        Scanner sc = new Scanner (System.in);
        suma = 0;
        
        
        do{
            System.out.println("Introduce numeros : ");
            numeros = sc.nextInt();
            suma += numeros;
            System.out.println("suma"+suma);
        }while(numeros != 0);
        System.out.println("la suma de los numeros es : "+ suma);
        
    }
    
}
