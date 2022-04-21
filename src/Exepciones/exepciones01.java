package Exepciones;

import java.util.Scanner;

public class exepciones01 {
    public static void main(String[] args) {
        /* . Crear un programa que pida los datos de dos alumnos, que son: nombre (letras), edad
        (entero) y altura (decimal). Se debe realizar un control de la entrada de datos, de tal forma que,
        si el usuario introduce números en el nombre, o letras en la edad o la altura, se vuelva a pedir
        el dato correspondiente hasta que la entrada sea correcta. */
        Scanner sc = new Scanner(System.in);
        boolean salida = false;
        String nombre;
        int edad;
        double altura;

        nombre = controlSpaceBlank("Introduce tus datos : ");
        edad = readInBetweenMinAndMax("Introduce tu edad:", 0,100);
        altura = height("Introduce tu altura");

        System.out.println("nombre: "+ nombre+ "edad: "+edad + "altura: "+ altura);
    }
    public static String controlSpaceBlank(String letter){
        Scanner sc = new Scanner(System.in);
        String giveMe = "";
        boolean exit = false;
        while (!exit){
            System.out.println(letter);
            giveMe = sc.nextLine();
            if(!giveMe.equals("") && giveMe.matches("^[A-Za-z]*$")){
                exit = true;
            }else{
                System.out.println("cannot contain blank spaces");
            }
        }
        return giveMe;
    }
    public static int readInBetweenMinAndMax(String message,int min, int max) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean exit = false;
        System.out.println(message);
        do {
            System.out.println("Enter a number between " + min + " and " + max);
            num = sc.nextInt();
            if (min <= num && num <= max)
                exit = true;
            else
                System.out.println("put a value between "+ min +"  and " + max);
        } while (!exit);

        return num;
    }
    public static double height (String message){
        Scanner sc = new Scanner(System.in);
        double height;
        do {
            System.out.println(message);
            height = sc.nextDouble();
        }while (height <= 1.0 && height >= 5.0);
        return height;
    }
}
