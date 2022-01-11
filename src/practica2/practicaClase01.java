
package practica2;
import java.util.Scanner;

public class practicaClase01 {

    public static void main(String[] args) {
        //Demanar els coeficients d'una equació es 2n grau, i mostri les seves solucions reals. Si no existeixen,
        //ha d'indicar-ho.
        
        Scanner Coeficientes = new Scanner(System.in);
        System.out.println("introduce el coeficiente de A , B y C  ");
        int a = Coeficientes.nextInt();
        int b = Coeficientes.nextInt();
        int c = Coeficientes.nextInt();
        int discriminacion = ((b*b)- (4*a*c));

        double ecuacion1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
        double ecuacion2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
        
        
            if(discriminacion > 0){
                System.out.println("tiene dos soluciones \n");
                System.out.println("La solucion de la ecuacion1 es : "+ ecuacion1);
                System.out.println("\n La solucion de la ecuacion2 es : "+ ecuacion2);
            }else if( discriminacion == 0 ){
                System.out.println("tiene una solucion");
                System.out.println("La solucion de la ecuacion1 es : "+ ecuacion1);
                System.out.println("\n La solucion de la ecuacion2 es : "+ ecuacion2);
            }else{
                System.out.println("no tiene soluciones");
            }
            
           
            
            
        System.out.println("coeficiente a: "+a);
        System.out.println("coeficiente b: "+b);
        System.out.println("coeficiente c: "+c);
        System.out.println("la discriminacion es : "+ discriminacion);
        System.out.println("La solucion de la ecuacion1 es : "+ ecuacion1);
        System.out.println("La solucion de la ecuacion2 es : "+ ecuacion2);
        
}
}
