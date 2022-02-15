package Modulo2.MyLibrary;

import java.util.Scanner;

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


}
