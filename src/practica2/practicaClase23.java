
package practica2;

import java.util.Scanner;

public class practicaClase23 {

    /**
    Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
    negativo.
     */
    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);
        int numeroPotenciado;
        boolean salida = true;
        
        do{
            System.out.println("Introdusca un numero :");
            numeroPotenciado = numero.nextInt();
            if (numeroPotenciado < 0 ){
                System.out.println("Valor negativo !!!!");
                salida = true;
                
            }else{
                System.out.println("Valor corecto "+ numeroPotenciado + " ^2 = "+ numeroPotenciado * numeroPotenciado);
                
                salida = false;
                
            }
        }while(!salida);
       
    }
    
}
