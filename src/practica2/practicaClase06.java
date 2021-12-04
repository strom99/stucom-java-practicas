
package practica2;

import java.util.Scanner;

public class practicaClase06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce dos numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("los numeros son : "+ num1+" , "+ num2);
        
        double multiplo = num1 /num2;
        double resl = multiplo * num2;
        
        if (num1 == resl){
            System.out.println("el numero "+num1+" es multiplo del numero "+num2);
        }else{
            System.out.println("el numero : "+num1+" no es multiplo del numero de : "+num2);
        }
        
        
        // if (n1 % n2 == 0 ) sout multiplos or (n1 % n2 == 0 ) || or | (n2 % n1 == 0 ) diferencia entre simples y dobles
      
    }
    
}
