
package practica2;
import java.util.Scanner;

public class practicaClase02 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        double radius;
        boolean exit = false;
        
        do{
            System.out.println("Introduce el  valor del radio : ");
            radius = input.nextDouble();
            if (radius <= 0 ){
                System.out.println("valor incorrecto : el radio ha de ser superior a 0");
                
            }else{
                System.out.println("Valor corecto");
                exit = true;
            }
        }while(!exit);
        System.out.println("El area del circulo es : "+ radius*radius*Math.PI);
}
}