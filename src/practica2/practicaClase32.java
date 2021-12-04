
package practica2;

import java.util.Scanner;

public class practicaClase32 {

    /**
     * pide 15 numeros y escribe la suma total
     */
    public static void main(String[] args) {
        
        int numeros, contador, suma;
        Scanner sc = new Scanner (System.in);
        contador = 0;
        suma = 0 ;
        
        boolean salida = true ;
        
        while(contador < 15){
            System.out.println("introduce un numero : ");
            numeros= sc.nextInt();
            contador++;
            suma += numeros;
            
            if(contador == 15){
                System.out.println("son 15 numeros, la suma total es : "+ suma);
                salida = false;
            }
            
            //hacerlo mas facil con un for solo
        
        }
        
        
        
    
}
}
