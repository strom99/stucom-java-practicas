
package practica2;

import java.util.Scanner;

public class practicaClase24 {

    /**
     Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca
        un 0.
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean continua = true;
        
        do {
            
            System.out.println("Introduce un numero : ");
            numero = sc.nextInt();
            if( numero > 0){
                System.out.println(numero + " es positivo");
               
            }else if ( numero < 0 ){
                System.out.println(numero + " es negativo");
                
            }else{
                System.out.println("El numero es 0");
                continua = false;
            }
        }while(continua);
    }
    
}
