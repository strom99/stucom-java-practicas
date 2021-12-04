
package practica2;

import java.util.Scanner;

/**
 *
 * @author Storm
 */
public class practicaClase09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");
        
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        
        if (numero1 > numero2){
            System.out.println("el numero primero es mayor que el segundo");
        }else if(numero1 == numero2){
            System.out.println("ambos numeros son iguales");
        }else{
            System.out.println("fgrdfds");
        }
    }
    
}
