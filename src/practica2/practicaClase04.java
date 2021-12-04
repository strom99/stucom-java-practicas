
package practica2;
import java.util.Scanner;

public class practicaClase04 {

    public static void main(String[] args) {
        
        Scanner numeros = new Scanner(System.in);
        System.out.println("Introduce dos numeros:");
        int num1 = numeros.nextInt();
        int num2 = numeros.nextInt();
        
        if(num1 == num2){
            System.out.println("los dos valores introducidos son iguales");
        }else{
            System.out.println("los dos valores introducidos no son iguales");
        }
    }
    
}
