package Modulo2.View;

import java.util.Scanner;

import static Modulo2.Controller.AthleteController.*;

public class Inicio {

    public static void menu(){
        System.out.println("----------- MENU -----------");
        System.out.println(" Select an opcion");
        System.out.println("[1] Register Athlete ");
        System.out.println("[2] View Athlete ");
        System.out.println("[3] Modify Athlete ");
        System.out.println("[4] Delete Athlete ");
        System.out.println("[5] Exit");
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
                    showAthletes();
                    break;
                case 3:
                    modifyAthlete();
                    break;
                case 4:
                    deleteAthlete();
                    break;
                case 5:
                    System.out.println("Adios !!!");
                    salidaMenu = true;
                    break;
            }
        }while(!salidaMenu);

    }

}
