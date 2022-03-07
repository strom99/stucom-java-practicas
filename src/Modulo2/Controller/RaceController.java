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
        private static ArrayList<Race> races = new ArrayList<>();

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
                if(!races.get(i).getParticipantes().contains(athletes.get(i))){
                    System.out.println("Athlete : "+ athletes.get(i).getName());
                    System.out.println(" WITH ID : "+ athletes.get(i).getNif());
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

                // registrar carrera
                races.add(new Race(id, localidad ,kilometros));
                // get.size()-1 -..
                Race registeringRace = getRaceById(id);
                System.out.println("Carrera creada!!");

                char option;
                sc.nextLine();
                do {
                    System.out.println("¿Quiere Añadir atletas a la carrera??(N/Y)");
                    option = sc.nextLine().charAt(0);

                    if(option == 'N'){
                    }else if(option == 'Y'){
                        System.out.println("YES");
                        boolean exit= false;
                        do{
                            // revisar todos los atletas
                            System.out.println("bucle");
                            if(showAthletesNotRegister(registeringRace)){
                                System.out.println("These athletes have not been registered yet");
                                String idAthlete;
                                do {
                                    System.out.println("Enter the athlete Dni : ");
                                    idAthlete = sc.nextLine();
                                }while (!validationDNI(idAthlete));
                                if(repeatNIF(idAthlete) == true){
                                    System.out.println("repeat");
                                    // revisa el atleta especifica si esta ne la carrera
                                    if(registeringRace.getParticipantes().contains(getAthleteByNif(idAthlete))){
                                        System.out.println("El atleta ya esta registrado en la carrera");
                                    }else{
                                        System.out.println("agregando");
                                        //Athlete atleta1 = getAthleteByNif(idAthlete);
                                        //System.out.println(atleta1);
                                        System.out.println(registeringRace.getParticipantes());
                                        registeringRace.getParticipantes().add(getAthleteByNif(idAthlete));
                                        System.out.println("atleta");
                                        //athletes.getAthletesRace().add(registeringRace);
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
                System.out.println("Aun no hay carreras creadas");
            } else {
                    for(int i = 0; i < races.size(); i++){
                        System.out.println("ID :" + races.get(i).getId());
                        System.out.println("Localidad :" + races.get(i).getLocalidad());
                        System.out.println("Kilometros : "+ races.get(i).getKilometros());
                        System.out.println("Time register : "+ races.get(i).getFechaHoraRegistro());
                        System.out.println("Atletas participantes en la carrera :");

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
                        }else{
                            System.out.println("Aun no hay atletas añadidos a la carrera");
                        }
                    }
                }
        }
}
