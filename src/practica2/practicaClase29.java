
package practica2;

import java.util.Scanner;

/**
 *Pedir números hasta que se introduzca un negativo, y calcular la media.
 */
public class practicaClase29 {

    public static void main(String[] args) {
        
        int numero,suma,elementos;
        float promedio;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un numero : ");
        numero = sc.nextInt();
        suma = 0;
        elementos = 0;
        
        while(numero >= 0 ){
            suma += numero;
            elementos++;
            System.out.println("introduce otro numero : ");
            numero = sc.nextInt();
            
            if( elementos == 0){
                System.out.println("imposible sacar el promedio");
            }else{
                promedio = (float) suma / elementos;
                System.out.println("el promedio es : "+ promedio);
            }
        }
    }
    
}
