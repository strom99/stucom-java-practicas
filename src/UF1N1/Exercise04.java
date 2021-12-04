
package UF1N1;

public class Exercise04 {

    public static void main(String[] args) {
        
        int A = (int)(Math.random()* 51);// * 50 + 1
        int B = (int)(Math.random()* 51);
        
        // calculo primera parte
        int part1 = A + (B * B); // b *b*2
        System.out.println("Result of "+ A + " + "+ B+"^2 = "+ part1);
        
        // calculo segunda parte
        // se puso double por que el resultado era en decimales y numeros negativos
        double part2 = (double)2 / (A - B);
        System.out.println("Result of 2 /  ("+ A +" - "+ B +") = "+ part2);
        
        //Resultado total de A + B^2 * 2 / ( A - B)
        double result_complet = part1 * part2;
        System.out.println("The total result of the operation is = "+result_complet);
    }
    
}
