
package practica2;

import java.util.Scanner;
/** Pedir números hasta que se teclee un negativo, y mostrar cuántos números se han introducido.
*/
public class practicaClase26 {

    public static void main(String[] args) {
        
        int numero , contador;
        Scanner sc = new Scanner (System.in);
        System.out.println("introduce un numero :");
        numero = sc.nextInt();
        contador = 0;
        
        while(numero >= 0 ){
            contador ++;
            
            System.out.println("introduce un numero : ");
            numero = sc.nextInt();
        }
        System.out.println("se han introducido en total " + contador+ "numeros");
    }
    
}
