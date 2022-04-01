package CensoOrganizado.view;

import CensoOrganizado.modelo.Especie;
import CensoOrganizado.modelo.Planeta;

import java.util.Scanner;

import static CensoOrganizado.Controller.ControllerEspecie.*;
import static CensoOrganizado.Controller.ControllerPlanet.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean salir = false;
        Planeta pl = null;
        Planeta pl1 = new Planeta("urano","fdfsf ","frio",true ,false);
        Planeta pl2 = new Planeta("marte","fdfsf ","frio",true ,false);
        Especie esp1 = new Especie("coma", 1);
        //System.out.println(pl1.equals(pl2));
        planetas.add(pl1);
        planetas.add(pl2);
        especies.add(esp1);

        do{
            menu();
            numero = sc.nextInt();
            switch (numero){
                case 1 :
                    crearPlaneta();
                    break;
                case 2 :
                    CensarSer();
                    break;
                case 3:
                    System.out.println("borrar");
                    salir = true;
                    break;
                case 4:
                    verPlanetas();
                    break;
                case 5:
                    verSeres();
                    break;
                case 6:
                    verPoblacionPlanetas();
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
            System.out.println("ver seres [5]");
            System.out.println("ver poblacion de un planeta [6]");
            System.out.println("Salir [0]");

        }
}
