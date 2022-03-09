package Modulo2.View;

import Modulo2.Model.Athlete;
import Modulo2.Model.Race;

import java.util.Scanner;

import static Modulo2.Controller.AthleteController.*;
import static Modulo2.Controller.RaceController.*;

public class Inicio {

    public static void menu(){
        System.out.println("----------- MENU -----------");
        System.out.println(" Select an opcion");
        System.out.println("[1] Register Athlete ");
        System.out.println("[2] View Athlete ");
        System.out.println("[3] Modify Athlete ");
        System.out.println("[4] Delete Athlete ");
        System.out.println("[5] Register Race ");
        System.out.println("[6] View races ");
        System.out.println("[7] Delete Race ");
        System.out.println("[0] Exit");
    }

    public static void createAthletes(){
        getAthletes().add(new Athlete("33333333F", "PEDRO",43));
        getAthletes().add(new Athlete("33333333G", "LUCAS",23));
        getAthletes().add(new Athlete("33333333T", "TOM",53));
    }

    public static void createRaces(){
        races.add(new Race("555EE","BCN",99));
        races.add(new Race("555OO","ESP",89));
        races.add(new Race("555YY","UNE",39));
    }

    public static void main(String[] args){
        boolean exitMenu = false;
        int numberMenu;
        Scanner sc = new Scanner(System.in);
        createAthletes();
        createRaces();
        do{
            menu();
            numberMenu = sc.nextInt();
            switch(numberMenu){
                case 1 :
                    registerAthlete();
                    break;
                case 2:
                    showAthletes();
                    break;
                case 3:
                    modifyAthlete();
                    break;
                case 4:
                    deleteAthlete();
                    break;
                case 5:
                    registerRace();
                    break;
                case 6 :
                    showRaces();
                    break;
                case 7:
                    deletedRaces();
                    break;
                case 0 :
                    System.out.println("Bye !!!");
                    exitMenu = true;
                    break;
            }
        }while(!exitMenu);

    }

}
