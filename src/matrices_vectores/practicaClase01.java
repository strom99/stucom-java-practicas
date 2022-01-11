
package matrices_vectores;

import java.util.Arrays;

public class practicaClase01 {

    /**
     *Leer 5 números y mostrarlos en el mismo orden introducido.
     */
    public static void main(String[] args) {
        
        int [] numeros = new int [5]; // de una dimension
        numeros[0] = 3;
        numeros[1] = 4;
        numeros[2] = 5;
        numeros[3] = 7;
        numeros[4] = 0;
        
        //foreach
        
        for( int lista : numeros) {
            System.out.println(lista);
        }
        
        //for
        for( int i = 0 ; i < numeros.length ; i++){
            System.out.println(i+" --- "+ numeros[i]);
            
        }
        
        //importar un paquete arrays, 
        System.out.println(Arrays.toString(numeros)); 
        
    }
    
}
