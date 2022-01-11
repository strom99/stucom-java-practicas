
package matrices_vectores;

public class practicaClase02 {

    /**
     * Leer 5 números y mostrarlos en orden inverso al introducido
     */
    public static void main(String[] args) {
        
        int [] numeros = new int [5]; // de una sola dimension
        numeros[0] = 3;
        numeros[1] = 4;
        numeros[2] = 5;
        numeros[3] = 7;
        numeros[4] = 0;
        
        
        
        for( int i = numeros.length-1; i >= 0; i--){
            System.out.println(i + " == " + numeros[i]);
            
        }
        
        
    }
    
}
