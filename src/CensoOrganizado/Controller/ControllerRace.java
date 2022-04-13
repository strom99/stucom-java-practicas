package CensoOrganizado.Controller;

import CensoOrganizado.Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static CensoOrganizado.Controller.ControllerPlanet.*;
import static CensoOrganizado.GlobalMethods.Methods.*;
import static CensoOrganizado.Model.Ferengian.latinumRestriction;
import static CensoOrganizado.Model.Human.correctAge;

public class ControllerRace {
    public static ArrayList<Race> species = new ArrayList<>();

    // message to choose species
    public static void messageElection(String message){
        System.out.println(message);
        System.out.println("[1] Andorian");
        System.out.println("[2] Ferengian");
        System.out.println("[3] Human");
        System.out.println("[4] Klingonian");
        System.out.println("[5] Nibirian");
        System.out.println("[6] Vulcanian");
        System.out.println("[0] Cancel");
    }

    // view species
    public static void viewSpecies() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] View beings by species");
        System.out.println("[2] View all beings");
        System.out.println("[0] exit");
        switch (sc.nextInt()){
            case 1:
                electionRaceToSee();
                break;
            case 2:
                if (!species.isEmpty()) {
                    System.out.println("Beings: ");
                    for (Race specie : species) {
                        System.out.println(specie);
                    }
                } else {
                    System.out.println("There are no registered species yet.");
                }
                break;
            case 0:
                System.out.println("Cancelled");
                break;
            default:
                System.out.println("Wrong option");
        }
    }

    public static void speciesByClass(Class x,String name_species){
        System.out.println("Selected Species: "+ name_species);
        List <Race> list = listSpecies(x);
        messagePresentation("SERES POR ESPECIE");
        if (!list.isEmpty()){
            for (Race species : list){
                System.out.println(species);
            }
            System.out.println("***************************************************************************");
        }else{
            System.out.println("0");
        }
    }

    public static void electionRaceToSee(){
        Scanner sc = new Scanner(System.in);
        messageElection("Choose a species:");
        switch (sc.nextInt()){
            case 1:
                speciesByClass(Andorian.class, "Andorian");
                break;
            case 2:
                speciesByClass(Ferengian.class, "Ferengian");
                break;
            case 3:
                speciesByClass(Human.class, "Human");
                break;
            case 4:
                speciesByClass(Klingonian.class, "Klingonian");
                break;
            case 5:
                speciesByClass(Nibirian.class, "Nibirian");
                break;
            case 6:
                speciesByClass(Vulcanian.class, "Vulcanian");
                break;
            case 0:
                System.out.println("cancelled");
                break;
            default:
                System.out.println("wrong option");
        }
    }

    public static void censusBeing() {
        if (!planets.isEmpty()) {
            Scanner sc = new Scanner(System.in);
            messageElection("What kind of species do you want to census?");
            switch (sc.nextInt()) {
                case 1:
                    createAndorian();
                    break;
                case 2:
                    createFerengian();
                    break;
                case 3:
                    createHuman();
                    break;
                case 4:
                    createKlingonian();
                    break;
                case 5:
                    createNibirian();
                    break;
                case 6:
                    createVulcanian();
                    break;
                case 0:
                    System.out.println("cancelled");
                    break;
                default:
                    System.out.println("wrong option");
            }
        } else {
            System.out.println("There is no registered planet yet");
        }
    }

    public static void createAndorian() {
        Scanner sc = new Scanner(System.in);
        String name;
        String range = "";
        int rangeN;
        boolean exitName = false;
        boolean exitRange = false;

        do {
            System.out.println("Enter the name of the being: ");
            name = sc.nextLine();
            if(species.contains(new Race(name))){
                System.out.println("That name already exists");
            }else{
                exitName = true;
            }
        } while (!exitName);

        do {
            System.out.println("What rank does it have?" + name + ":");
            System.out.println("[1] Trainer");
            System.out.println("[2] Advocate");
            System.out.println("[3] Fighter");
            System.out.println("[4] Gentleman");
            rangeN = sc.nextInt();
            switch (rangeN) {
                case 1:
                    range = "Trainer";
                    exitRange = true;
                    break;
                case 2:
                    range = "Advocate";
                    exitRange = true;
                    break;
                case 3:
                    range = "Fighter";
                    exitRange = true;
                    break;
                case 4:
                    range = "Gentleman";
                    exitRange = true;
                    break;
                default:
                    System.out.println("wrong option");
            }
        } while (!exitRange);

        sc.nextLine();
        boolean Aenar = trueOrFalse("Are you Aenar ??(yes/no)");

        System.out.println("Created being!!!");
        species.add(new Andorian(name, range, Aenar));
        enterPlanet(name);
    }

    public static void createFerengian() {
        Scanner sc = new Scanner(System.in);
        String name;
        int latinum;
        boolean exitName = false;
        Ferengian ferengian;
        do {
            System.out.println("Enter the name of the being: ");
            name = sc.nextLine();
            if(species.contains(new Race(name))){
                System.out.println("That name already exists");
            }else{
                exitName = true;
            }
        } while (!exitName);

        do {
            System.out.println("How much Latinum do you have???");
            latinum = sc.nextInt();
            latinumRestriction(latinum);
        } while (latinum <= 0);

        species.add(new Ferengian(name, latinum));
        System.out.println("created!");
        enterPlanet(name);

    }

    public static void createHuman() {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        char gender;
        boolean exitName = false;
        boolean exitGender = false;
        do {
            System.out.println("Enter the name of the being: ");
            name = sc.nextLine();
            if(species.contains(new Race(name))){
                System.out.println("That name already exists");
            }else{
                exitName = true;
            }
        } while (!exitName);

        do {
            System.out.println("Enter age:");
            age = sc.nextInt();
            correctAge(age);
        } while (age < 0 || age > 130);

        do {
            sc.nextLine();
            System.out.println("Introduce tu genero:[M / F]");
            gender = sc.nextLine().charAt(0);
            if (gender == 'M' || gender == 'F') {
                exitGender = true;
            }
        } while (!exitGender);
        species.add(new Human(name, age, gender));
        System.out.println("Created human");
        enterPlanet(name);
    }

    public static void createKlingonian() {
        Scanner sc = new Scanner(System.in);
        String name;
        int strengthLevel;
        boolean exitName = false;
        do {
            System.out.println("Enter the name of the being: ");
            name = sc.nextLine();
            if(species.contains(new Race(name))){
                System.out.println("That name already exists");
            }else{
                exitName = true;
            }
        } while (!exitName);

        strengthLevel = readInBetweenMinAndMax("Enter the strength level:",50, 350);

        species.add(new Klingonian(name, strengthLevel));
        System.out.println("Created klingonian");
        enterPlanet(name);
    }

    public static void createNibirian() {
        Scanner sc = new Scanner(System.in);
        String name;
        boolean exitName = false;

        do {
            System.out.println("Enter the name of the being: ");
            name = sc.nextLine();
            if(species.contains(new Race(name))){
                System.out.println("That name already exists");
            }else{
                exitName = true;
            }
        } while (!exitName);

        boolean feedPl = trueOrFalse("Your diet is based on plants??(yes/no)");

        boolean feedingFi = trueOrFalse("Is your diet based on fish??(yes/no)");

        species.add(new Nibirian(name, feedPl, feedingFi));
        System.out.println("Created Nibirian");
        enterPlanet(name);
    }

    public static void createVulcanian() {
        Scanner sc = new Scanner(System.in);
        String name;
        Vulcanian vulcanian;
        boolean exitName = false;
        int levelMeditation;
        do {
            System.out.println("Enter the name of the being: ");
            name = sc.nextLine();
            if(species.contains(new Race(name))){
                System.out.println("That name already exists");
            }else{
                exitName = true;
            }
        } while (!exitName);

        levelMeditation = readInBetweenMinAndMax("Enter the level meditacion: ",0, 10);

        species.add(new Vulcanian(name, levelMeditation));
        System.out.println("Created vulcanian");
        enterPlanet(name);
    }

    // Enter the being on a planet (#1)
    public static void enterPlanet(String name) {
        Scanner sc = new Scanner(System.in);
        Race x = getRaceByName(name);
        String namePlanet;
        boolean exit = false;
        System.out.println("You need to census the being on a planet (required)");
        do {
            System.out.println("Habitable planets:");
            // create an array to display the planets that come out of the getHabitablePlanets() method, which returns an array;
            List<Planet> habitablePlanets = getHabitablePlanets(x);
            if (habitablePlanets.isEmpty()) {
                System.out.println("0");
                System.out.println("The being will be eliminated due to lack of planets");
                // remove the being from the array of species if there are no planets
                species.remove(x);
                exit = true;
            } else {
                //  show habitable planets from Habitable planets array
                for (Planet poblation : habitablePlanets){
                    System.out.println(poblation);
                }
                System.out.println("Select the planet you want to live on?");
                namePlanet = sc.nextLine();
                // checking if the planet exists
                if (checkPlanet(new Planet(namePlanet))) {
                    // add the being to the population of that planet
                    Planet planet = getPlanetByName(namePlanet);
                    planet.getPoblation().add(x);
                    System.out.println("correct census");
                    exit =true;
                } else {
                    System.out.println("The planet does not exist!");
                }
            }
        } while (!exit);
    }

    // Check population for certain inhabitant (#2), returns list of planets in an array
    public static List<Planet> getHabitablePlanets(Race species) {
        ArrayList<Planet> habitablesPlanets = new ArrayList<>();

        for (Planet planet : planets) {
            //First of all, we look at the capacity of the planet to show
            if(planet.getPoblation().size() != planet.getCapacity()){
                // Shows the planets an Andorian can live on
                if ( species instanceof Andorian && !existsHabitant(Vulcanian.class, planet.getPoblation())) {
                    habitablesPlanets.add(planet);
                } else if (species instanceof Vulcanian && !existsHabitant(Andorian.class, planet.getPoblation())) {
                // Shows the planets a Vulcan can live on
                    habitablesPlanets.add(planet);
                } else if (species instanceof Human) {
                // Shows the planets on which a human can live
                    habitablesPlanets.add(planet);
                } else if (species instanceof Klingonian && !planet.getClimate().equalsIgnoreCase("Warm")) {
                // Shows the planets a Klingonian can live on
                    habitablesPlanets.add(planet);
                } else if (species instanceof Nibirian && (((Nibirian) species).isRedFloraFood() && planet.isRedFlora() || ((Nibirian) species).isFishFeed() && planet.isAquaticsBeings()
                   //
                   || !((Nibirian) species).isRedFloraFood() && !((Nibirian) species).isFishFeed() )) {
                // Shows the planets a Nibirian can live on
                    habitablesPlanets.add(planet);
                } else if (species instanceof Ferengian && !planet.getClimate().equalsIgnoreCase("Cold")) {
                // Shows the planets a Ferengian can live on
                    habitablesPlanets.add(planet);
                }
            }
        }
        return habitablesPlanets;
    }

    //we insert a class of the being that we want to check
    public static boolean existsHabitant(Class speciesClass, List<Race> poblation) {
        boolean existsBeing = false;
        for (Race esp : poblation) {
            if (esp.getClass().equals(speciesClass)) {
                existsBeing = true;
                break;
            }
        }
        return existsBeing;
    }

    public static Race getRaceByName(String name) {
        Race x = null;
        for (int i = 0; i < species.size(); i++) {
            if (species.get(i).getName().equals(name)) {
                x = species.get(i);
                break;
            }

        }
        return x;
    }

    public static boolean existsByClass(Class x){
        boolean exists = false;
        for (Race ps : species){
            if (ps.getClass().equals(x)){
                exists = true;
                return exists;
            }
        }
        return exists;

    }

    public static void removeBeing(){
        Scanner sc = new Scanner(System.in);
        if(!species.isEmpty()){
            for (Race x :species){
                System.out.println(x);
            }
            System.out.println("Enter the name of the being you want to delete::");
            Race x = getRaceByName(sc.nextLine());
            if(x != null){
                for (Planet planet : planets){
                    if(planet.getPoblation().contains(x)){
                        planet.getPoblation().remove(x);
                    }
                }
                species.remove(x);
                System.out.println("Removed");
            }else {
                System.out.println("that being does not exist");
            }

        }else{
            System.out.println("There are no creatures yet");
        }
    }

    public static void modifyPropertySpecies(){
        Scanner sc = new Scanner(System.in);
        int option ;
        boolean exit = false;
        if(!species.isEmpty()){
            Race sx = null;
            do {
                System.out.println("What species do you want to modify?");
                System.out.println("[1] Ferengian");
                System.out.println("[2] Human");
                System.out.println("[3] Klingonian");
                System.out.println("[4] Vulcanian");
                System.out.println("[0] Cancel");
                switch (sc.nextInt()){
                    case 1 :
                        modifyFerengiano(sx);
                        break;
                    case 2:
                        modifyHumano(sx);
                        break;
                    case 3:
                        modifyKlingoniano(sx);
                        break;
                    case 4:
                        modifyVulcaniano(sx);
                        break;
                    case 0 :
                        exit = true;
                        break;
                    default:
                        System.out.println("wrong option");
                }
            }while (!exit);
        }else{
            System.out.println("There are no registered species yet.");
        }
    }

    public static void modifyFerengiano(Race n){
        Scanner sc = new Scanner(System.in);
        Ferengian x =  ((Ferengian) n);
        boolean exit = false;
        String name = "";

        if(existsByClass(Ferengian.class)){
            List<Race> list_ferengian = listSpecies(Ferengian.class);
            for(Race ferengian : list_ferengian){
                System.out.println(ferengian);
            }
            do {
                System.out.println("Enter the name of the Ferengian to modify :");
                name = sc.nextLine();
                x = (Ferengian) getRaceByName(name);
                if(x != null){
                    do {
                        System.out.println("Enter the amount of new Latinum:");
                        x.setLatinum(sc.nextInt());
                    } while (x.getLatinum() <= 0);
                    System.out.println("Modified Latinum");
                    exit = true;
                }else{
                    System.out.println("There is no being with such a name");
                }
            }while (!exit);
        }else{
            System.out.println("There are no Ferengians....");
        }
    }

    public static void modifyHumano(Race n){
        Scanner sc = new Scanner(System.in);
        Human x =  ((Human) n);
        boolean exit = false;

        if(existsByClass(Human.class)){
            List<Race> list_humans = listSpecies(Human.class);
            for(Race human : list_humans){
                System.out.println(human);
            }
            do {
                System.out.println("Enter the name of the Human to modify :");
                x = (Human) getRaceByName(sc.nextLine());
                System.out.println("Age: "+x.getAge());
                if(x != null){
                    x.setAge(readInBetweenMinAndMax("Enter the new age:",0,130));
                    System.out.println("Modified age");
                }else{
                    System.out.println("There is no being with such a name");
                }
                exit = true;
            }while (!exit);
        }else{
            System.out.println("There are no humans..");
        }
    }

    public static void modifyKlingoniano(Race n){
        Scanner sc = new Scanner(System.in);
        Klingonian x =  ((Klingonian) n);
        boolean exit = false;

        if(existsByClass(Klingonian.class)){
            List<Race> list_klingonians = listSpecies(Klingonian.class);
            for(Race klingonian : list_klingonians){
                System.out.println(klingonian);
            }
            do {
                System.out.println("Enter the name of the Klingonian to modify :");
                x = (Klingonian) getRaceByName(sc.nextLine());
                if(x != null){
                    System.out.println("Strength level: "+x.getStrengthLevel());
                    x.setStrengthLevel(readInBetweenMinAndMax("Enter the new strength level:",50,350));
                    System.out.println("Modified force level.!");
                    exit = true;
                }else{
                    System.out.println("There is no being with such a name");
                }
            }while (!exit);
        }else{
            System.out.println("There are no Klingonians.");
        }
    }

    public static void modifyVulcaniano(Race n){
        Scanner sc = new Scanner(System.in);
        Vulcanian x =  ((Vulcanian) n);
        boolean exit = false;

        if(existsByClass(Vulcanian.class)){
            List<Race> list_vulcanians = listSpecies(Vulcanian.class);
            for(Race vulcanian : list_vulcanians){
                System.out.println(vulcanian);
            }
            do {
                System.out.println("Enter the name of the Vulcan to modify :");
                x = (Vulcanian) getRaceByName(sc.nextLine());
                if(x != null){
                    System.out.println("Meditation level: "+x.getMeditationLevel());
                    x.setMeditationLevel(readInBetweenMinAndMax("Enter the new level of meditation:",0 , 10));
                    System.out.println("Modified meditation level!");
                    exit = true;
                }else{
                    System.out.println("the name is wrong");
                }
            }while (!exit);
        }else{
            System.out.println("There are no Vulcans...");
        }
    }

    //returns a list of beings that have the indicated class
    public static List <Race> listSpecies(Class x){
        ArrayList <Race> listSpecies = new ArrayList<>();
        for (Race specie : species){
            if (specie.getClass().equals(x)){
                listSpecies.add(specie);
            }
        }
        return listSpecies;
    }

}
