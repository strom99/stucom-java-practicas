
package practicasPersonales;


import java.util.Scanner;

public class arraysClase {

    public static void main(String[] args) {
        
        int [] numeros = new int[5]; // int es un objeto

        Scanner sc = new Scanner(System.in);

        
        int numerosIntr;
        
        //mostrara los dos primeros numeros del array
        //escribe array
        
        for( int i = 0 ; i < numeros.length ; i++){
             
            System.out.println("introduce el numeros : "+ (i + 1));
            numerosIntr = sc.nextInt();
            
        
        }
        
        
        for( int i = 0 ; i < numeros.length ; i++){
        
            if(numeros[i]< 0 ){
                System.out.println(i);
            }else{
                System.out.println(numeros[i]);
            }
        
        
        }
        // intento de matriz de numeros
        
        int [][] numerosNotas = new int[2][3];
        
        for(int i = 0; i<numerosNotas.length ; i++){//filas
            for(int k = 0; k < numerosNotas.length ; k++){//columans
                System.out.println("introduce el valor de i y k : ");
                System.out.println("hola como estas :3");
                
            }
        }

        //lee el array
        EXIT:
         for(int i = 0; i<numerosNotas.length ; i++){//filas
            for(int k = 0; k < numerosNotas.length ; k++){//columans
                if(numerosNotas[i][k] < 0 ){
                    System.out.println(i);
                    break EXIT;
                }else{
                    System.out.print(numerosNotas[i][k]+ " ");
            }
                
            }
        }
         System.out.println();
        
            
           
        
    }
    
}
