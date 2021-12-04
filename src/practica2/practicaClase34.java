
package practica2;

import java.util.Scanner;

/**
 *
 * Pedir un número y calcular su factorial.
 */
public class practicaClase34 {

    public static void main(String[] args) {
        // es multiplicar los factorIALES  , no decrementalmente
        
        Scanner sc = new Scanner (System.in);
        
        int numero = 1;
        
        while (numero > 0) {
            System.out.println("introduce un numero");
            numero = sc.nextInt();
            
            if (numero > 0) {
                int resultado = numero * numero;
                System.out.println("Número " + resultado);
            };
            
        }
        
        
    }
    
}
