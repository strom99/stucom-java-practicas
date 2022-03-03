package Modulo2.Controller;

import Modulo2.Model.Race;

import java.util.ArrayList;
import java.util.Scanner;

import static Modulo2.MyLibrary.DataValidation.validationID;

public class RaceController {
        private static ArrayList<Race> races = new ArrayList<>();

        public static void registerRace(){
            Scanner sc = new Scanner(System.in);
            String id;
            String localidad;
            int kilometros;
            do{
                System.out.println("Introduce el codigo de carrera : ");
                id = sc.nextLine();
            }while (!validationID(id));

            System.out.println("Introduce una localidad : ");
            localidad = sc.nextLine();

            do{
                System.out.println("Introduce la distancia (KM)");
                kilometros = sc.nextInt();
            }while (!validationID(id));

            System.out.println("Carrera creada!!");
        }
}
