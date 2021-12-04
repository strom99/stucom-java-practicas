
package practica2;

import java.util.Scanner;

public class practicaClase47 {

    /**
     * Dibuja un cuadrado de n elementos de lado utilizando *.
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("introduce un numero : ");
        int n = sc.nextInt();
       
        if( n > 2 && n < 20){
            
            //linea superior
            for(int i= 0 ; i < n ; i++){
                System.out.print("* ");
                
            }
            System.out.println();
            
            //centro
            for(int e = 0 ; e < n-2 ; e++){
                System.out.print("* ");
                for(int a = 0; a < n-2 ; a++){
                    System.out.print("  ");
                }
                System.out.println("*");
            }
            //linea inferior
            for( int j = 0 ; j < n ; j++){
                    System.out.print("* ");
                }
        }
        
  
    
    
}
}