package Modulo2.Controller;

import Modulo2.Model.Athlete;
import Modulo2.Model.Race;
import Modulo2.MyLibrary.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

import static Modulo2.Controller.AthleteController.athletes;
import static Modulo2.MyLibrary.Arrays.getAthleteByNif;
import static Modulo2.MyLibrary.DataValidation.*;

public class RaceController {
    public static ArrayList<Race> races = new ArrayList<>();

    public static boolean raceIdRepeat(String id){
        boolean isRepeat = false;
        if(races.size() != 0){
            for (int j = 0; j < races.size() && !isRepeat; j++) {
                if (id.equalsIgnoreCase(races.get(j).getId())) {
                    isRepeat = true;
                }
            }
        }
        return isRepeat;
    }

    public static boolean showAthletesNotRegister(Race race){
        boolean freeAtletes = false;
        for(int i = 0; i < athletes.size() ; i++){
            // si hay algun atleta disponible , devuelve true
                if(!race.getParticipantes().contains(athletes.get(i))){
                    System.out.println("Athlete : "+ athletes.get(i).getName());
                    System.out.println(" With ID : "+ athletes.get(i).getNif());
                    freeAtletes = true;
                }
        }
        return freeAtletes;
    }

    public static Race getRaceById (String id) {
        Race registeringRace = null;
        for (int i = 0; i < races.size(); i++) {
            if (races.get(i).getId().equals(id)) {
                registeringRace = races.get(i);
                break;
            }

        }
        return registeringRace;
    }

    public static void registerRace(){
        Scanner sc = new Scanner(System.in);
        String id;
        String location;
        int kilometres;

        do{
            System.out.println("Enter the codeRace :  ");
            id = sc.nextLine();
        }while (!validationID(id));

        if(raceIdRepeat(id) == false){
            System.out.println("Enter the location : ");
            location = sc.nextLine();

            do{
                System.out.println("Enter the distance (KM):");
                kilometres = sc.nextInt();
            }while (kilometres < 0);

            // registrar carrera
            races.add(new Race(id, location ,kilometres));
            // get.size()-1 -..
            Race registeringRace = getRaceById(id);
            System.out.println("Career created!!");

            char option;
            sc.nextLine();
            do {
                System.out.println("Do you want to add athletes to the race ?(N/Y)");
                option = sc.nextLine().charAt(0);

                if(option == 'N'){
                }else if(option == 'Y'){
                    boolean exit= false;
                    do{
                        // revisar todos los atletas
                        if(showAthletesNotRegister(registeringRace)){
                            System.out.println("These athletes have not been registered yet");
                            String idAthlete;
                            do {
                                System.out.println("Enter the athlete Nif : ");
                                idAthlete = sc.nextLine();
                            }while (!validationDNI(idAthlete));
                            if(repeatNIF(idAthlete) == true){
                                // revisa el atleta especifica si esta ne la carrera
                                if(registeringRace.getParticipantes().contains(getAthleteByNif(idAthlete))){
                                    System.out.println("The athlete is already registered in the race");
                                }else{
                                    registeringRace.getParticipantes().add(getAthleteByNif(idAthlete));
                                    Arrays.getAthleteByNif(idAthlete).getAthletesRace().add(registeringRace);
                                }

                            }else{
                                System.out.println("The athlete does not exist");
                            }

                            System.out.println("Do you want to add another athlete?? [Y][N]");
                            option = sc.nextLine().charAt(0);

                            if(option == 'Y'){

                            }else if(option == 'N'){
                                System.out.println("bye");
                                exit = true;
                            }else{
                                System.out.println("wrong option, we assume you don't want to add another athlete");
                            }

                        }else{
                            System.out.println("There are no athletes available for a race");
                            exit = true;
                        }
                    }while (!exit);
                }else{
                    System.out.println("Wrong option , is Y o N");
                }
            } while (option != 'Y' && option != 'N');

        }else{
            System.out.println("This race was registered");
        }
    }

    public static void showRaces(){
        if (races.size() == 0) {
            System.out.println("there are no athletes created yet");
        } else {
            for(int i = 0; i < races.size(); i++){
                System.out.println("---------------------------------------------------");
                System.out.println("ID :" + races.get(i).getId());
                System.out.println("location :" + races.get(i).getLocalidad());
                System.out.println("kilometres : "+ races.get(i).getKilometros());
                System.out.println("Time register : "+ races.get(i).getFechaHoraRegistro());
                System.out.println("Athletes participing in the race :");

                if(races.get(i).getParticipantes().size() > 0){
                    for(int j = 0; j < races.get(i).getParticipantes().size() ; j++){
                        Athlete participante = races.get(i).getParticipantes().get(j);

                        System.out.println("Nif:" + participante.getNif());
                        System.out.println("Name :" + participante.getName());
                        System.out.println("Age : "+ participante.getAge());
                        if(participante.getGender() != null){
                            System.out.println("Gender : "+ participante.getGender());
                        }
                        if(participante.isSenior()){
                            System.out.println("He's old");
                        }
                        System.out.println(" ");
                    }
                }else{
                    System.out.println("There are no athletes added to the race yet");
                }
            }
        }
    }

    public static void deletedRaces(){
        Scanner sc = new Scanner(System.in);
        if(races.size() == 0){
            System.out.println("there are not races");
        }else{
            System.out.println("Let's start with the elimination of the races");
            System.out.println("Enter the race to remove:");
            String raceRemove = sc.nextLine();
            if(validationID(raceRemove)){
                if(raceIdRepeat(raceRemove)){
                    Race objectRace = getRaceById(raceRemove);
                    races.remove(objectRace);
                    if(objectRace.getParticipantes().size() > 0){
                        for (Athlete atleta : athletes){
                            if(atleta.getAthletesRace().contains(objectRace)){
                                atleta.getAthletesRace().remove(objectRace);
                            }
                        }
                    }else{
                        System.out.println("there are not participes");
                    }
                }else{
                    System.out.println("the race doesnt exists¡¡");
                }
            }else{
                System.out.println("the code race have invalidated caractheres");
            }

        }
    }
}
