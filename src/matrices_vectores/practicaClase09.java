
package matrices_vectores;

import java.util.Arrays;

public class practicaClase09 {

    /**
     * Crear un programa que llegeixi per teclat una taula de 10 nombres enters i la desplaci una posició cap
    avall: el primer passa a ser el segon, el segon passa a ser el tercer i així successivament , L'últim passa a
    ser el primer.
     */
    public static void main(String[] args) {
        
        int numeros [] = new int [10];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;
        numeros[7] = 8;
        numeros[8] = 9;
        numeros[9] = 10;

        
        System.out.println(Arrays.toString(numeros));
        
        for(int i = 0 ; i < numeros.length ; i++){
            if (i < numeros.length) {
               numeros[i] = numeros[i+1];
            }
        }
        
        System.out.println(Arrays.toString(numeros));
        
    }
    
}
