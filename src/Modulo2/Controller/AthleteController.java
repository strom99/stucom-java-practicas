package Modulo2.Controller;

import Modulo2.Model.Athlete;
import Modulo2.Model.Race;

import java.util.ArrayList;
import java.util.Scanner;

import static Modulo2.Controller.RaceController.getRaceById;
import static Modulo2.Controller.RaceController.races;
import static Modulo2.MyLibrary.Arrays.getAthleteByNif;
import static Modulo2.MyLibrary.DataValidation.*;

public class AthleteController {

    public static ArrayList<Athlete> athletes = new ArrayList<>();

    public static ArrayList<Athlete> getAthletes (){
        return athletes;
    }


    public static void registerAthlete() {
        Scanner sc = new Scanner(System.in);

        String nif;
        do {
            System.out.println("Enter the Nif: ");
            nif = sc.nextLine();
        } while (!validationDNI(nif));

        if (repeatNIF(nif) == false) {
            System.out.println("Enter the name of the athlete: ");
            String name = sc.nextLine();

            int age;
            do {
                System.out.println("Enter the age of the athlete: ");
                age = sc.nextInt();
            } while (age < 1);

            char option;
            sc.nextLine();
            do {
                System.out.println("Do you want to specify your gender (S/N)");
                option = sc.nextLine().charAt(0);
            } while (option != 'S' && option != 'N');

            // eleccion de si el usuario quiere poner su genero , como opcional
            if (option == 'S') {
                String gender;
                do {
                    System.out.println("Ingresa tu sexo");
                    gender = sc.nextLine();
                } while (!gender.equals("M") && !gender.equals("F"));

                System.out.println("error");
                athletes.add(new Athlete(nif ,name, age, gender));
                System.out.println("Atleta creado!!");
            } else if (option == 'N') {
                athletes.add(new Athlete(nif ,name, age));
                System.out.println("Atleta creado!!");
            }
        }
    }


    public static void showAthletes() {
        if (athletes.size() == 0) {
            System.out.println("There are no athletes created yet");
        } else {
                for(int i = 0; i < athletes.size(); i++){
                    System.out.println("Nif :" + athletes.get(i).getNif());
                    System.out.println("Name :" + athletes.get(i).getName());
                    System.out.println("Age : "+ athletes.get(i).getAge());

                    if(athletes.get(i).getGender() != null){
                        System.out.println("Gender: "+athletes.get(i).getGender());
                    }
                    if(athletes.get(i).isSenior()){
                        System.out.println("He's older");
                    }

                    System.out.println("Race for by "+ athletes.get(i).getName());
                    if(athletes.get(i).getAthletesRace().size() > 0){
                        for(int j = 0 ; j < athletes.get(i).getAthletesRace().size() ; j++){
                            Race rute =  athletes.get(i).getAthletesRace().get(j);
                            System.out.println("CodeRace : "+ rute.getId() + " Location : " + rute.getLocalidad());
                        }
                    }else{
                        System.out.println("Not registered races");
                    }

                    System.out.println(" ");
                }
        }
    }

    public static boolean showRacesNotRegister(Athlete athlete){
        boolean freeRaces = false;
        for(int i = 0; i < races.size() ; i++){
            // si hay algun atleta disponible , devuelve true
            if(!athlete.getAthletesRace().contains(races.get(i))){
                System.out.println(" ---------------------------------- ");
                System.out.println("Id race : "+ races.get(i).getId());
                System.out.println("Location : "+ races.get(i).getLocalidad());
                freeRaces = true;
            }
        }
        return freeRaces;
    }


    public static void modifyAthlete() {

        Scanner sc = new Scanner(System.in);
        if (athletes.size() == 0) {
            System.out.println("There are not athletes created yet");
        } else {
            showAthletes();
            System.out.println("Enter the NIF of the athlete you want to modify : ");
            String nifModify = sc.nextLine();

            if (validationDNI(nifModify)) {
                boolean exitModify = false;
                do {
                    // guardamos la posicion de donde se encuentra el array en otro objeto , y verificamos si el atleta que ingreso coincide con otro
                    Athlete athToMod = getAthleteByNif(nifModify);
                    if (athToMod != null) {
                        System.out.println("What attribute of the athlete do you want to modify : " + athToMod.getNif());
                        System.out.println(" Modify Name [1]");
                        System.out.println(" Modify Age [2]");
                        System.out.println(" Modify Gender [3]");
                        System.out.println(" Modify Races [4]");
                        System.out.println(" Exit  Menu [0]");
                        int optionAttribute = sc.nextInt();

                        switch (optionAttribute) {
                            case 1:
                                System.out.println("The name of the athlete is :" + athToMod.getName());
                                System.out.println("Enter the new name: ");
                                sc.nextLine();
                                athToMod.setName(sc.nextLine());
                                break;
                            case 2:
                                System.out.println("The age of athlete is : " + athToMod.getAge());
                                do {
                                    System.out.println("Enter the new age: ");
                                    athToMod.setAge(sc.nextInt());
                                } while (athToMod.getAge() < 1);

                                break;
                            case 3:
                                if(athToMod.getGender() != null){
                                    System.out.println("The gender of the athlete is : " + athToMod.getGender());
                                    sc.nextLine();
                                    do {
                                        System.out.println("Enter the new gender:  ");
                                        athToMod.setGender(sc.nextLine());
                                    } while (!athToMod.getGender().equals("M") && !athToMod.getGender().equals("F"));
                                }
                                break;
                            case 4:
                                sc.nextLine();
                                boolean exitModRace = false;
                                do{
                                    if(showRacesNotRegister(athToMod)){
                                        String codeRace;
                                        do{
                                            System.out.println("Enter the code race to save:");
                                            codeRace = sc.nextLine();
                                        }while (!validationID(codeRace));
                                        if(RaceController.raceIdRepeat(codeRace)){
                                            Race race = getRaceById(codeRace);
                                            if(race.getParticipantes().contains(athToMod)){
                                                System.out.println("this athlete is already included in this race");
                                            }else{
                                                athToMod.getAthletesRace().add(race);
                                                race.getParticipantes().add(athToMod);
                                                System.out.println("registered race");
                                                exitModRace = true;
                                                }
                                        }else{
                                                System.out.println("This race doesnt exit!");
                                        }
                                    }else{
                                        System.out.println(" ");
                                        System.out.println("No races");
                                        exitModRace =true;
                                    }
                                }while (!exitModRace);
                                break;
                            case 0:
                                System.out.println("Go out");
                                exitModify = true;
                                break;
                            default:
                                System.out.println("Incorrect option");

                        }
                    } else {
                        System.out.println("There is nothing yet");
                        exitModify = true;
                    }

                } while (!exitModify);
            } else {
                System.out.println("The NIF entered is incorrect");
            }
        }
    }

    public static void deleteAthlete() {
        Scanner sc = new Scanner(System.in);

        //comprobamos que el array se haya iniciado y que el array no este vacio
        if (athletes.size() == 0) {
            System.out.println("There are no athletes to eliminate yet");
        } else {
            System.out.println("Let's start with the elimination of the athlete");
            System.out.println("Enter the NIF:");
            String nifDelete = sc.nextLine();
            if (validationDNI(nifDelete)) {
                if (repeatNIF(nifDelete)) {
                    // guardamos la posicion del array
                    Athlete saNif = getAthleteByNif(nifDelete);
                    athletes.remove(saNif);
                    for(Race race : races){
                        if (race.getParticipantes().get().getAthletesRace())
                    }
                }else {
                    System.out.println("no existe el atleta con ese nif");
                }
            } else {
                System.out.println("El dni introducido es incorrecto");
            }
        }
    }
}




