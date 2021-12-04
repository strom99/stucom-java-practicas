
package UF1N1;

public class Exercise02 {

    public static void main(String[] args) {
        
        char A = 'A';
        char B = 'B';
        char C = A ;
        
        // Añadimos el valor C en A para empujar valores
        A = B;
        B = C;
        
        System.out.println("El valor de A es :"+ A +" y el valor de B es: "+ B);
    }
    
}
