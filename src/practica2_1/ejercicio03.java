
package practica2_1;

public class ejercicio03 {

    /**
     * Escribe un programa que muestre todos los enteros positivos impares menores que 100, excepto
        los que sean divisibles por 7.
     */
    public static void main(String[] args) {
        
        
        int e = 1;
        
        for( e = 1 ; e <= 100 ; e+=2){
                // calcula el numero impar
                //if(e % 2 != 0){
                    //condicional if para comprobar que el numero impar no es divisible entre 7
                    if(e % 7 != 0)
                    System.out.println(e);
                }
            
            
       //}
    }
    
}
