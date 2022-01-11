
package practica2;

import java.util.Scanner;

/**
 *
 * @author Storm
 */
public class practicaClase09 {

    public static void main(String[] args) {

        //Demanar dos números i mostrar-los ordenats de major a menor

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numMayor = 0;
        int numMenor = 0;

        if(numero1 > numero2){
            numMayor = numero1;
            numMenor = numero2;
            System.out.println(numMayor+ " , "+ numMenor);
        }else if ( numero1 == numero2){
            System.out.println("los numeros son iguales");
        }else{
            numMayor = numero2;
            numMenor = numero1;
            System.out.println(numMayor+ " , "+ numMenor);
        }

    }
    
}
