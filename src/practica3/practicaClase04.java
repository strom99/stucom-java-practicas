
package practica3;

public class practicaClase04 {

    /**
     * Leer 10 números enteros , Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el
     * penúltimo, el tercero, etc.
     */
    public static void main(String[] args) {
        int i = 0;
        int [] numeros = new int [10];
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
        // dar vueltas con el array
        for (i = numeros.length-1 ; i >= 0 ; i--){
            System.out.println(numeros[i]);
        }
        for(int e = 0 , r = 10 ; e <= 10 && r >= 0 ; e++ , r--){
            System.out.println("e = "+e);
            System.out.println("r = "+r);
        }
        
        
    }
    
}
