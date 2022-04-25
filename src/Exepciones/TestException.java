package Exepciones;

import java.util.Scanner;

public class TestException {

    public static void main(String[] args) {

        System.out.println("Ingresa un número");
        Scanner sc = new Scanner(System.in);

        try {
            String numeroUsuario = sc.nextLine();
            System.out.println(numeroUsuario);
        } catch (Exception e) {
            System.out.println("Solo enteros permitos.");
        }

        System.out.println("hola");

    }

}
