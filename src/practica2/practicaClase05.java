
package practica2;

import java.util.Scanner;

public class practicaClase05 {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Introduce un valor :");
        int numeroIntroducido = numero.nextInt();
        System.out.println("el valor introducido es "+numeroIntroducido);
        
        
        if(numeroIntroducido >= 0){
            System.out.println("el numero introducido es positivo");
        }else{
            System.out.println("el numero introducido es negativo");
        }
    }
    
}
