
package practica2;

public class practicaClase46 {

    /**
     *  Dissenya una aplicació que mostri les taules de multiplicar de l'1 al 10. 
     */
    public static void main(String[] args) {
        
        int mult;
        for(int i=1 ; i <= 10 ; i++){
            for( int j = 1 ; j <= 10 ; j++){
                mult = i * j;
                System.out.println(i +" * "+ j +" = " + mult );
            }
            System.out.println();
        
        }
        
    }
    
}
