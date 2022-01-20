package UF2_metodos;

import java.util.Scanner;

public class ejercicio13 {
    /*
    Ídem amb una taula
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre [] = new String[3];
        System.out.println("escribe 3 nombres : ");

        for(int i = 0 ; i < nombre.length ; i++){
            nombre[i] = sc.nextLine();
        }

        show(nombre);

    }

    public static void show( String nombre[]){

        for(int i = 0 ; i < nombre.length ; i++){
            System.out.println("Bienvenido " + nombre[i]);
        }
    }
}
