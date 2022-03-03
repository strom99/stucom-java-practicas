package Modulo2.MyLibrary;

import java.util.Scanner;

import static Modulo2.Controller.AthleteController.athletes;

public class DataValidation {

    public static int readInBetweenMinAndMax(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean exit = false;
        do {
            System.out.println("Introduce un numero entre " + min + " y " + max);
            num = sc.nextInt();
            if (min <= num && num <= max)
                exit = true;
            else
                System.out.println("Pon un valor entree 1 y 10");
        } while (!exit);

        return num;
    }


    public static boolean validationDNI(String nif){
        //validacion para que el dni cuente con 8 numero y una letra entre la A a la Z
        return nif.matches("^[0-9]{8}[A-Z]$");
    }

    public static boolean validationID(String id){
        //validacion para que el dni cuente con 8 numero y una letra entre la A a la Z
        return id.matches("^[0-9]{3}[A-Z]{2}$");
    }

    public static boolean repeatNIF(String nif) {
        // verificacion si ya existe el dni repetido
        
        boolean esRepetido = false;
        for (int j = 0; j < athletes.size() && !esRepetido; j++) {
            if (nif.equalsIgnoreCase(athletes.get(j).getNif())) {
                esRepetido = true;
            }
        }
        return esRepetido;
        
    }

}
