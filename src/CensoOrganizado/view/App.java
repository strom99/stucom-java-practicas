package CensoOrganizado.view;

import CensoOrganizado.Controller.FileController;
import CensoOrganizado.Model.*;

import java.util.Scanner;

import static CensoOrganizado.Controller.ControllerRace.*;
import static CensoOrganizado.Controller.ControllerPlanet.*;

public class App {
    public static void registerPlanets(){
        planets.add(new Planet("marte", "andromeda", "Frio",true,false,1));
        /*planets.add(new Planet("pluton", "filomena", "Calido",true,true,4));
        planets.add(new Planet("urano", "filomena", "Calido",false,false,90));*/
        planets.add(new Planet("marte", "andromeda", "Frio",true,false,5));
        planets.add(new Planet("pluton", "filomena", "Calido",true,true,5));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        registerPlanets();
        /*Every time the app returns to the starting point, the data will be recorded in the .txt file, I put it there to save myself putting the code in each case */
        do{
            FileController.writePlanets();
            FileController.writeSpecies();
            menu();
            switch (sc.nextInt()){
                case 1 :
                    createPlanet();
                    break;
                case 2 :
                    censusBeing();
                    break;
                case 3:
                    removeBeing();
                    break;
                case 4:
                    viewPoblationPlanet();
                    break;
                case 5:
                    modifyPropertySpecies();
                    break;
                case 6:
                    viewSpecies();
                    break;
                case 0 :
                    System.out.println("bye");
                    exit = true;
                    break;
                default:
                    System.out.println("wrong option");
            }
        }while (!exit);
    }
        public static void menu () {
            System.out.println("----------------------------");
            System.out.println("Register planet [1]");
            System.out.println("Census a being[2]");
            System.out.println("Remove a being [3]");
            System.out.println("View planetas/population [4]");
            System.out.println("Modify the property of a being [5]");
            System.out.println("View beings [6]");
            System.out.println("exit [0]");

        }
}
