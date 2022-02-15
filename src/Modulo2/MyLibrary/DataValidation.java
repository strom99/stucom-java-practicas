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

    public static boolean repeatNIF(String nif){
        // verificacion si ya existe el dni repetido
        boolean esRepetido = false;
        for (int j = 0; j < athletes.length && !esRepetido; j++) {
            if (athletes[j] != null && athletes[j].getNif().equalsIgnoreCase(nif)) {
                System.out.println("Ya existe un atleta con este Dni");
                esRepetido = true;
            }
        }
        return  esRepetido;
    }
    /*
    public static String dni(int number, int caracter){

        do{
            Scanner sc = new Scanner(System.in);
            id = sc.nextLine();
            if(id.length() == number + caracter){

                if(){

                }
            }

        }while (!idlength || !numbersOK || !charOK);
        return id;
    }*/

}
