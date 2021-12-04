
package practica2;

import java.util.Scanner;

public class practicaClase25 {

    /**
     Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int numero ;
        boolean salida = true;
        
        do {
            
            System.out.println("Introduzca un numero : ");
            numero = sc.nextInt();
            if(numero == 0 ){
                System.out.println(" El numero es 0");
                salida = false;
                
            }else if( numero%2 == 0){
                System.out.println("el numero es par");
                }else {
                    System.out.println("es impar");
                }
            
        }while(salida);
     
    }
    
}
