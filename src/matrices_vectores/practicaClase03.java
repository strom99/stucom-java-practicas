
package matrices_vectores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practicaClase03 {

    /**
     * Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media
    de los negativos y contar el número de ceros.
     */
    public static void main(String[] args) {
        
        List numerosLista = new ArrayList(); // dinamicamente
        Scanner reader = new Scanner ( System.in);
        System.out.println("introduce 5 numeros : ");
        int numeros = 0 ;
        int contPositivos = 0;
        int contNegativos = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int ceros = 0;
        float mediapositivos = 0;
        float mediaNegativos = 0;
        
        for (int i = 0; i < 5 ; i++){
            numeros = reader.nextInt();
            numerosLista.add(numeros);
                if(numeros > 0 ){
                    contPositivos++;
                    sumaPositivos += numeros;
                    mediapositivos = (float) sumaPositivos / contPositivos; 
                    
                    }else if( numeros == 0){
                        ceros++;
                }else{
                    contNegativos++;
                    sumaNegativos += numeros;
                    mediaNegativos = (float) sumaNegativos / contNegativos;
                }
            
        }
        
        System.out.println(numerosLista);
        
        System.out.println("contador positivos = "+contPositivos);
        System.out.println("contador negativos = "+contNegativos);
        System.out.println("suma positivos = "+sumaPositivos);
        System.out.println("suma negativos = "+sumaNegativos);
        System.out.println("ceros = "+ ceros);
        System.out.println("-------");
        System.out.println("media positivos = " + mediapositivos);
        System.out.println("media negativos = " + mediaNegativos);
        /*
        for(int e = 0; e < 5 ; e++){
            System.out.println(numerosLista2[e]);
        }*/
        
    }
    
}
