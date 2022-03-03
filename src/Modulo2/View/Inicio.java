package Modulo2.View;

import java.util.Scanner;

import static Modulo2.Controller.AthleteController.*;
import static Modulo2.Controller.RaceController.registerRace;

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

    public static void main(String[] args){
        boolean salidaMenu = false;
        int numberMenu;
        Scanner sc = new Scanner(System.in);

        do{
            menu();
            numberMenu = sc.nextInt();
            switch(numberMenu){
                case 1 :
                    registerAthlete();
                    break;
                case 2:
                    showAthletes("all");
                    break;
                case 3:
                    modifyAthlete();
                    break;
                case 4:
                    //deleteAthlete();
                    salidaMenu = true;
                    break;
                case 5:
                    registerRace();
                    break;
                case 6 :
                    System.out.println("vercarrera");
                    salidaMenu = true;
                    break;
                case 7:
                    System.out.println("eliminar carrera");
                    salidaMenu = true;
                    break;
                case 0 :
                    System.out.println("Adios !!!");
                    salidaMenu = true;
                    break;
            }
        }while(!salidaMenu);

    }

}
