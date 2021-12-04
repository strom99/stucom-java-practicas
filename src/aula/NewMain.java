
package aula;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.println("Introduce un numero:");
		System.out.print("escanear edad:");
		int edad = scanner.nextInt();
//		boolean puedeBeber=(edad>=18)&&(edad<=60);
		boolean noPuedeBeber=(edad<18)||(edad>60);
		if (noPuedeBeber) {
			System.out.println(" no puede beber");
		} else {
			System.out.println("puede beber");
		}
		System.out.print("mostrar la edad: ");
		System.out.println(edad);
    }
    
}
