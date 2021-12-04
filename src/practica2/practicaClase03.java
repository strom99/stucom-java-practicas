
package practica2;

import java.util.Scanner;

public class practicaClase03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("introduce el radio de una circunferencia: ");
        int radio = sc.nextInt();
        double longitud = 2 * Math.PI * radio;
        
        if(radio <= 0 ){
            System.out.println("valor incorrecto : introduce otro numero que no sea menor o iga¡ual a o");
            
        }else{
            System.out.println("valor correcto \n la longitud es : "+longitud);
        }
        
       
        

    }
    
}
