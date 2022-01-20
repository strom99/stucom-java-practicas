package UF2_metodos;

import java.util.Scanner;

public class ejercicio06 {

    /**
     * Función que muestra en pantalla el doble del valor que se le ocurre como parámetro.
     */
    public static void main(String[] args) {
        int valorDoble, numIngresado ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero :");
        numIngresado = sc.nextInt();
        valorDoble = doble(numIngresado);
        System.out.println("Su valor doble es :" + valorDoble);
    }

    public static int doble(int numIngresado){
        int valorDoble;
        int dos = 2;
        valorDoble = numIngresado * dos ;

        return (valorDoble) ;
    }

}
