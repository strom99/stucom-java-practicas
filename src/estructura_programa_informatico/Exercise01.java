
package estructura_programa_informatico;

public class Exercise01 {

    public static void main(String[] args) {
        
        
        int min =1;
        int max = 51;
        int A = (int)(Math.random()* 5);// * 50+1
        int B = (int)(Math.random()* (max - min) + min);
        int sum = A + B;
        int subtraction = A - B;
        int multiplication = A * B;
        double division = (double)A / B;
        
        
        System.out.println("A = "+ A);
        System.out.println("B = "+ B);
        System.out.println("resultado suma = "+ sum);
        System.out.println("resultado resta = "+ subtraction);
        System.out.println("resultado multiplicacion = "+ multiplication);
        System.out.println("resultado division = "+ division);
    }
    
}
