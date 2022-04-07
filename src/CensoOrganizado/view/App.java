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
        especies.add(new Ferengiano("luis",3));
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
                    verPoblacionPlanetas();
                    break;
                case 5:
                    modificarPropiedadEspecie();
                    break;
                case 6:
                    verPlanetas();
                    break;
                case 7:
                    verSeres();
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
            System.out.println("ver poblacion de un planeta [4]");
            System.out.println("Modificar la propiedad de un ser [5]");
            System.out.println("ver planetas [6]");
            System.out.println("ver seres [7]");
            System.out.println("Salir [0]");

        }
}
