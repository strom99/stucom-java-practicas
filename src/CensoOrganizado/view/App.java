package CensoOrganizado.view;

import CensoOrganizado.modelo.*;

import java.util.Scanner;

import static CensoOrganizado.Controller.ControllerEspecie.*;
import static CensoOrganizado.Controller.ControllerPlanet.*;

public class App {
    public static void crearPlanetas(){
        planetas.add(new Planeta("marte", "andromeda", "Frio",true,false));
        planetas.add(new Planeta("pluton", "filomena", "Calido",true,true));
        planetas.add(new Planeta("urano", "filomena", "Calido",false,false));
        planetas.add(new Planeta("neptuno", "filomena", "Calido",false,true));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean salir = false;
        crearPlanetas();
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
                    eliminarSer();
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
