
package matrices_vectores;

public class practicaClase10 {

    /**
     * Ídem que lo anterior, desplazar N posicionis (N es introducido por el usuario).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] numeros = new int [6][2];
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[1][0] = 3;
        numeros[1][1] = 4;
        numeros[2][0] = 5;
        numeros[2][1] = 6;
        numeros[3][0] = 7;
        numeros[3][1] = 8;
        numeros[4][0] = 9;
        numeros[4][1] = 10;
        numeros[5][0] = 11;
        numeros[5][1] = 12;

        for(int i = 0; i < numeros.length ; i++){
            for(int e = 0 ; e < numeros[i].length; e++){
                System.out.println(i + ""+ e);
            }
        }
    }
    
}
