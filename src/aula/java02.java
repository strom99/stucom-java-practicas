
package aula;
import java.util.Scanner;

public class java02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* introducir en la consola
        System.out.println("introduce un texto: ");
        String text = input.nextLine();
        /*ystem.out.println(text);*/
        /*System.out.println("numero: ");
        int number = input.nextInt();
        System.out.println(number);*/
        
        /*System.out.println("introduce un numero:");
        int number = input.nextInt();
        System.out.println(number);
        if(number == 10){
            System.out.println("es correcto");
        }else{
            System.out.println("incorrecto");
        }*/  //hacerlo con do while
        int number = input.nextInt();
        
        do {
                  System.out.print("Introduce un número entero positivo: ");
                  while (!input.hasNextInt()) {
                         System.out.println("Valor no válido");
                         input.nextInt();
                         System.out.print("Introduce un número entero positivo: ");                               
                  }
        }while(true);
}
}
    

