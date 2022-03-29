package CensoOrganizado.view;

import CensoOrganizado.modelo.Especies;
import CensoOrganizado.modelo.Planetas;

import java.util.Scanner;

import static CensoOrganizado.Controller.ControllerPlanet.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean salir = false;
        Planetas pl = null;
        Planetas pl1 = new Planetas("urano","fdfsf ","frio",true ,false);
        Planetas pl2 = new Planetas("marte","fdfsf ","frio",true ,false);
        Especies esp1 = new Especies(null, 1);
        //System.out.println(pl1.equals(pl2));
        planetas.add(pl1);
        planetas.add(pl2);

        do{
            menu();
            numero = sc.nextInt();
            switch (numero){
                case 1 :
                    System.out.println("registrar planeta");
                    crearPlaneta();
                    break;
                case 2 :
                    System.out.println("censar");
                    salir = true;

                    break;
                case 3:
                    System.out.println("borrar");
                    salir = true;

                    break;
                case 4:
                    verEspecies();
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
            System.out.println("ver planetas [4]");
            System.out.println("Salir [0]");

        }
}
