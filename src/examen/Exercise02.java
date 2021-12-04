
package examen;

public class Exercise02 {

    public static void main(String[] args) {
        
        int a = (int)(Math.random()* 101);
        int b = (int)(Math.random()* 101);
        // hago comparacion con un booleano de a y b
        boolean verifA = a < 50 && b > 20 ; 
        
        
       
        System.out.println("El valor de la variable A es  : "+a);
        System.out.println("El valor de la variable B es : "+b);
        System.out.println("a ="+a+" es menor que 50 y b ="+b+" es mayor que 20 : "+verifA);
   
    }
    
}
