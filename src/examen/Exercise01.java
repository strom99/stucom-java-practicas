
package examen;

public class Exercise01 {

    
    public static void main(String[] args) {
        
        int radio = (int)(Math.random()* 30)+1;
        double volumen = (4 * Math.PI * radio*radio*radio)/ 3;
        int parteEntera = (int)volumen ;
        double parteDecimal = (volumen %10);
        
       
       
      
        
        
        
        System.out.println("Radio : "+radio);
        System.out.println("Volumen : "+ volumen);
        System.out.println("La parte entera del volumen : "+ parteEntera);
        System.out.println("La parte decimal del volumen : ");
    }
    
}
