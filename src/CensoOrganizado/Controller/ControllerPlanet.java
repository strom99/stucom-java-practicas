package CensoOrganizado.Controller;

import CensoOrganizado.Model.Race;
import CensoOrganizado.Model.Planet;
import java.util.ArrayList;
import java.util.Scanner;
import static CensoOrganizado.GlobalMethods.Methods.*;

public class ControllerPlanet {
    //I put a limit on the array of planets
    public static ArrayList <Planet> planets = new ArrayList<>(); // to tour the species

    // get the planet object with the name
    public static Planet getPlanetByName(String name) {
        Planet planet = null;
        for (int i = 0; i < planets.size(); i++) {
            if (planets.get(i).getName().equals(name)) {
                planet = planets.get(i);
                break;
            }
        }
        return planet;
    }

    public static boolean checkPlanet(Planet planet){
        boolean exist = false;
        if (!planets.isEmpty()) {
            if(planets.contains(planet)){
                exist = true;
            }
        }
        return exist;
    }

    public static String Climate(){
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int numero;
        String climate="";
        do {
            System.out.println("Enter a weather:");
            System.out.println("[1] Cold");
            System.out.println("[2] Warm");
            System.out.println("[3] Tempered");
            numero = sc.nextInt();
            switch (numero){
                case 1 :
                    climate = "Cold";
                    exit =true;
                    break;
                case 2:
                    climate = "Warm";
                    exit =true;
                    break;
                case 3:
                    climate = "Tempered";
                    exit =true;
                    break;
                default:
                    System.out.println("wrong option");
            }
        }while (!exit);
        return climate;
    }

    public static void createPlanet(){
        Scanner sc = new Scanner(System.in);
        String name;
        String galaxy;
        name = controlSpaceBlank("Enter the name of the planet: ");

        if(checkPlanet(new Planet(name))){
            System.out.println("That name already exists");
        } else {
            System.out.println("Enter the galaxy:");
            galaxy = sc.nextLine();

            String clima = Climate();

            // red flora boolean
            boolean redFlora = trueOrFalse("Your planet has red flora??(yes/no)");

            boolean aquaticsBeings = trueOrFalse("Your planet has aquatics beings??(yes/no)");

            int capacity = readInBetweenMinAndMax("what is the capacity of your planet?",0,5000);
            planets.add(new Planet(name,galaxy,clima,redFlora,aquaticsBeings,capacity));
            System.out.println("created planet");
        }
    }

    public static void viewPlanets(){
        if(!planets.isEmpty()){
            for(int i = 0 ; i < planets.size();i++){
                System.out.println(planets.get(i));
            }
        }else{
            System.out.println("There are no planets yet");
        }
    }

    public static void viewPoblationPlanet(){

        if(!planets.isEmpty()){
            Scanner sc = new Scanner(System.in);
            Planet planet = null;
            System.out.println("[1] View population of a planet ");
            System.out.println("[2] View beings by Planets");
            System.out.println("[0] Cancel");
            switch (sc.nextInt()){
                case 1:
                    sc.nextLine();
                    viewPlanets();
                    System.out.println("Enter the name of the planet, to see its population");
                    planet = getPlanetByName(sc.nextLine());
                    if(planet != null){
                        System.out.println("Population of the planet "+planet.getName());
                        if(!planet.getPoblation().isEmpty()){
                            for (Race pl : planet.getPoblation()){
                                System.out.println(pl);
                                System.out.println("***************************************************************************");
                            }
                        }else
                            System.out.println("0 population");
                    }else{
                        System.out.println("that planet is not correct");
                    }
                    break;
                case 2:
                    messagePresentation("BEINGS PER PLANET");
                    for (Planet planet_X :planets) {
                        System.out.println(planet_X);
                        System.out.println("Poblation: ");
                        if (!planet_X.getPoblation().isEmpty()){
                            for (Race poblation :planet_X.getPoblation()){
                                System.out.println(poblation);
                            }
                        }else{
                            System.out.println("0");
                        }
                        System.out.println("***************************************************************************");
                    }
                    break;
                case 0:
                    System.out.println("cancelled");
                    break;
                default:
                    System.out.println("wrong option");
            }
        }else{
            System.out.println("Not planets yet");
        }

    }
}
