package Modulo2.Controller;

import Modulo2.Model.Athlete;
import Modulo2.Model.Race;
import Modulo2.MyLibrary.Arrays;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

import static Modulo2.Controller.AthleteController.athletes;
import static Modulo2.MyLibrary.DataValidation.*;

public class RaceController {
        private static ArrayList<Race> races = new ArrayList<>();

        public static boolean raceIdRepeat(String id){
            boolean isRepeat = false;
            if(races.size() != 0){
                for (int j = 0; j < races.size() && !isRepeat; j++) {
                    if (races.get(j) != null && id.equalsIgnoreCase(races.get(j).getId())) {
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
                if(races.get(i) != null && athletes.get(i) != null && !races.get(i).getParticipantes().contains(athletes.get(i))){
                    System.out.println("Athlete : "+ races.get(i).getParticipantes().get(i).getName());
                    System.out.println("ID : "+ races.get(i).getParticipantes().get(i).getNif());
                    freeAtletes = true;
                }else{
                    System.out.println("No hay ninguna atleta registrado");
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
            String localidad;
            int kilometros;

            do{
                System.out.println("Introduce el codigo de carrera : ");
                id = sc.nextLine();
            }while (!validationID(id));

            if(raceIdRepeat(id) == false){
                System.out.println("Introduce una localidad : ");
                localidad = sc.nextLine();

                do{
                    System.out.println("Introduce la distancia (KM)");
                    kilometros = sc.nextInt();
                }while (kilometros < 0);

                races.add(new Race(id, localidad ,kilometros));
                Race registeringRace = getRaceById(id);

                System.out.println("Carrera creada!!");
                System.out.println(races);

                char option;
                sc.nextLine();
                do {
                    System.out.println("¿Quiere Añadir atletas a la carrera??(N/Y)");
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
                                    System.out.println("Enter the athlete Dni : ");
                                    idAthlete = sc.nextLine();
                                }while (!validationDNI(idAthlete));
                                if(repeatNIF(idAthlete)){
                                    // revisa el atleta especifica si esta ne la carrera
                                    if(registeringRace.getParticipantes().contains(idAthlete)){
                                        System.out.println("El atleta ya existe en la carrera");
                                    }else{
                                        Athlete atleta = Arrays.getAthleteByNif(idAthlete);
                                        registeringRace.getParticipantes().add(atleta);
                                        atleta.getAthletesRace().add(registeringRace);
                                        exit = true;
                                    }

                                }else{
                                    System.out.println("El atleta no existe");
                                }

                            }else{
                                System.out.println("No hay atletas disponibles parta una carrera");
                                exit = true;
                            }

                        }while (!exit);
                    }
                } while (option != 'Y' && option != 'N');

            }else{
                System.out.println("El id ya existe!!!!!");
            }
        }

        public static void showRaces(){
            if (races.size() == 0) {
                System.out.println("Aun no hay atletas creados");
            } else {
                    for(int i = 0; i < races.size(); i++){
                        System.out.println("ID :" + races.get(i).getId());
                        System.out.println("Localidad :" + races.get(i).getLocalidad());
                        System.out.println("Kilometros : "+ athletes.get(i).getAge());
                        System.out.println("Time register : "+ races.get(i).getFechaHoraRegistro());
                        System.out.println("Atletas participantes en la carrera :"+ races.get(i).getId());

                        if(races.get(i).getParticipantes().size() > 0){
                            for(int j = 0; j < races.get(i).getParticipantes().size() ; j++){
                                Athlete participante = races.get(i).getParticipantes().get(j);

                                System.out.println(" Dni:" + participante.getNif());
                                System.out.println("Nombre :" + participante.getName());
                                System.out.println("Edad : "+ participante.getAge());
                                if(participante.getGender() != null){
                                    System.out.println("Genero: "+ participante.getGender());
                                }
                                if(participante.isSenior()){
                                    System.out.println("Es mayor de Edad ");
                                }
                                System.out.println(" ");
                            }
                        }
                    }
                }
        }
}
