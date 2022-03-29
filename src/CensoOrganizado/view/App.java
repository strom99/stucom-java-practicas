package CensoOrganizado.view;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean salir = false;

        do{
            menu();
            numero = sc.nextInt();
            switch (numero){
                case 1 :
                    System.out.println("registrar planeta");
                    salir = true;

                    break;
                case 2 :
                    System.out.println("censar");
                    salir = true;

                    break;
                case 3:
                    System.out.println("borrar");
                    salir = true;

                    break;
                case 0 :
                    System.out.println("adios");
                    salir = true;
                    break;
                default:
                    System.out.println("error");
            }
        }while (!salir);
    }
        public static void menu () {
            System.out.println("----------------------------");
            System.out.println("Registrar planeta [1]");
            System.out.println("Censar a un ser [2]");
            System.out.println("Borrar a un ser [3]");
            System.out.println("Salir [0]");
        }
}
