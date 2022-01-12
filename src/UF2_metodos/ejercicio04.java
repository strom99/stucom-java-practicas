package UF2_metodos;

public class ejercicio04 {

    /**
     * una versión que calcule el máximo de una tabla de n elementos.
     */

    public static int maximun(int []vector){
        int max;
        max = vector[3];

        for(int i = 0 ; i < vector.length ; i++){
            if( vector[i] > max){
                max = vector[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int max ;
        int []vector = new int[6];

        for(int i = 0; i < vector.length ; i++){
            vector[i] = (int) (Math.random()* 100) + 1;
        }

        for(int i = 0; i < vector.length ; i++){
            System.out.print(vector[i]+ " ");
        }
        System.out.println("");
        max = maximun(vector);
        System.out.println("el maximo es : " + max);
    }
}
