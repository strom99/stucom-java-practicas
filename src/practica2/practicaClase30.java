
package practica2;

import java.util.Scanner;

/** Pedir un número N, mostrando todos los números del 1 al N
 */
public class practicaClase30 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un numero : ");
        int numero = sc.nextInt();
        int i =1;
        
        
        if(numero > i){
            
            for(  i = 1 ; i <= numero ; i++){
            
            System.out.println(i);
            }
        }else if(numero < i){
            for( i = 1 ; i >= numero ; i--){
                System.out.println(i);
            }
        }else if ( numero == 1){
            System.out.println("el numero es igual a 1");
        }
      
    }
    
}
