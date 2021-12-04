
package examen;

public class Exercise03 {

    public static void main(String[] args) {
        
       
        int a = (int) ((Math.random()* (41-20))+20);
        
        // cree una variable en la que si el resto es 0 es par
        int par = a % 2;
        //igualamos a 0 para el resultado par
        boolean verificacion = par == 0;
        
        
        System.out.println("el valor de a es "+a);
        System.out.println("a es un numero par? : "+verificacion);
    }
    
}
