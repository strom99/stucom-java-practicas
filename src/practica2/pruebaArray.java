package practica2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pruebaArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Arrays estaticos
        int[] listaNumeros = new int[5];
        
        int contador = 0;
        int suma = 0;
        
        while (contador < listaNumeros.length) {
            System.out.println("Ingresa el número "+ (contador+1));
            
            // pedimos el número
            int numeroEntrado = sc.nextInt();
            
            // metemos el número en el indice en el array
            listaNumeros[contador] = numeroEntrado;
            
            suma+=numeroEntrado;   
                  
            
            contador++;
        }
        
        System.out.println("suma : "+suma);
        
        
        System.out.println(Arrays.toString(listaNumeros));
        
        
        //Arrays dinámicos o Listas
        ArrayList<Integer> listaNumeros2 = new ArrayList<>();
        
        listaNumeros2.add(3);
        listaNumeros2.add(4);
        
        //Array
        int[] listaNumeros3 = {1,2,3,4,5};
        System.out.println(" "+ Arrays.toString(listaNumeros));
    }
    
}
