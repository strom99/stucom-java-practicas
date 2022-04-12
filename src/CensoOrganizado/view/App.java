package CensoOrganizado.view;

import CensoOrganizado.Model.*;

import java.util.Scanner;

import static CensoOrganizado.Controller.ControllerRace.*;
import static CensoOrganizado.Controller.ControllerPlanet.*;

public class App {
    public static void registerPlanets(){
        planetas.add(new Planet("marte", "andromeda", "Frio",true,false));
        planetas.add(new Planet("pluton", "filomena", "Calido",true,true));
        planetas.add(new Planet("urano", "filomena", "Calido",false,false));
        planetas.add(new Planet("neptuno", "filomena", "Calido",false,true));
        especies.add(new Ferengian("luis",3));
        especies.add(new Klingonian("martin",5));
        especies.add(new Klingonian("maria",6));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean salir = false;
        registerPlanets();
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
            System.out.println("ver seres [6]");
            System.out.println("Salir [0]");

        }
}
