
package practica2;

import java.util.Scanner;

public class practicaClase07 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");
        
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        
        if (numero1 > numero2){
            System.out.println("el numero : "+ numero1 + " es mayor que : "+ numero2);
        }else{
            System.out.println(" el numero : "+ numero2 + " es mayor que "+ numero1);
        }
        
       

    }
    
}
