
package practica2;

import java.util.Scanner;

public class practicaClase48 {

    /**
     * Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0
        al 9-9-9-9-9, con la particularidad de que cada vez que aparezca un 3 le sustituya por una E.
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce 5 digitos");
        int numero = sc.nextInt();
        String letra= "";
        
        
        
        
        if(numero < 5 && numero > 0){
            letra += numero;
            System.out.println(letra);
        }
        
        
        
        
    }
    
}
