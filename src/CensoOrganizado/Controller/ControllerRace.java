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

    public static boolean checkName(String name) {
        boolean exists= false;
        if (!species.isEmpty()) {
            for (int i = 0; i < species.size(); i++) {
                if (species.get(i).getName().equals(name)) {
                    exists = true;
                }
            }
        }else {
            System.out.println("There are no beings yet");
        }
        return exists;
    }

    public static void viewSpecies() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] View beings by species");
        System.out.println("[2] View all beings");
        System.out.println("[0] exit");
        switch (sc.nextInt()){
            case 1:
                electionRace();
                break;
            case 2:
                if (!species.isEmpty()) {
                    System.out.println("Seres: ");
                    for (Race species_X : species) {
                        System.out.println(species_X);
                    }
                } else {
                    System.out.println("There are no registered species yet.");
                }
                break;
            case 0:
                System.out.println("cancelled");
                break;
            default:
                System.out.println("wrong option");
        }
    }

    public static void electionRace(){
        Scanner sc = new Scanner(System.in);
        messageElection("Elige una especie:");
        switch (sc.nextInt()){
            case 1:
                System.out.println("Especie Seleccionada: Andorrianos");
                List <Race> list_andorrianos = mostrarEspecie(Andorian.class);
                messagePresentation("SERES POR ESPECIE");
                if (!list_andorrianos.isEmpty()){
                    for (Race andorriano : list_andorrianos){
                        System.out.println(andorriano);
                    }
                    System.out.println("***************************************************************************");
                }else{
                    System.out.println("0");
                }
                break;
            case 2:
                System.out.println("Especie Seleccionada: Ferengianos");
                List <Race> list_ferengiano = mostrarEspecie(Ferengian.class);
                messagePresentation("SERES POR ESPECIE");
                if (!list_ferengiano.isEmpty()){
                    for (Race ferngiano : list_ferengiano){
                        System.out.println(ferngiano);
                    }
                    System.out.println("***************************************************************************");
                }else{
                    System.out.println("0");
                }
                break;
            case 3:
                System.out.println("Especie Seleccionada: Humanos");
                List <Race> list_humans = mostrarEspecie(Human.class);
                messagePresentation("SERES POR ESPECIE");
                if (!list_humans.isEmpty()){
                    for (Race human : list_humans){
                        System.out.println(human);
                    }
                    System.out.println("***************************************************************************");
                }else{
                    System.out.println("0");
                }
                break;
            case 4:
                System.out.println("Especie Seleccionada: Klingonianos");
                List <Race> list_klingonianos = mostrarEspecie(Klingonian.class);
                messagePresentation("SERES POR ESPECIE");
                if (!list_klingonianos.isEmpty()){
                    for (Race klingoniano : list_klingonianos){
                        System.out.println(klingoniano);
                    }
                    System.out.println("***************************************************************************");
                }else{
                    System.out.println("0");
                }
                break;
            case 5:
                System.out.println("Especie Seleccionada: Nibirianos");
                List <Race> list_nibirianos = mostrarEspecie(Nibirian.class);
                messagePresentation("SERES POR ESPECIE");
                if (!list_nibirianos.isEmpty()){
                    for (Race nibiriano : list_nibirianos){
                        System.out.println(nibiriano);
                    }
                    System.out.println("***************************************************************************");
                }else{
                    System.out.println("0");
                }
                break;
            case 6:
                System.out.println("Especie Seleccionada: Vulcanianos");
                List <Race> list_vulcanianos = mostrarEspecie(Vulcanian.class);
                messagePresentation("SERES POR ESPECIE");
                if (!list_vulcanianos.isEmpty()){
                    for (Race vulcanianos : list_vulcanianos){
                        System.out.println(vulcanianos);
                    }
                }else{
                    System.out.println("0");
                }
                break;
            case 0:
                System.out.println("canceled");
                break;
            default:
                System.out.println("opcion incorrecta");
        }
    }

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

    public static void CensusBeing() {
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
        String aenar;
        boolean Aenar = false;
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
        do {
            System.out.println("Are you Aenar ??(yes/no)");
            aenar = sc.nextLine();
            if (aenar.equals("yes")) {
                Aenar = true;
            } else if (aenar.equals("no")) {
                Aenar = false;
            }
        } while (!aenar.equalsIgnoreCase("yes") && !aenar.equalsIgnoreCase("no"));
        System.out.println("Created being!!!");
        species.add(new Andorian(name, range, Aenar));
        enterPlanet(name);
    }

    // Enter the being on a planet (#1)
    public static void enterPlanet(String name) {
        Scanner sc = new Scanner(System.in);
        Race species = getRaceByName(name);
        String namePlanet;
        boolean exit = false;
        do {
            System.out.println("Habitable planets:");
            // create an array to display the planets that come out of the getHabitablePlanets() method, which returns an array;
            List<Planet> habitablePlanets = getHabitablePlanets(species);
            if (habitablePlanets.isEmpty()) {
                System.out.println("0");
                exit = true;
            } else {
                //  show habitable planets from Habitable planets array
                for (Planet planetsX: habitablePlanets) {
                    System.out.println(planetsX);
                }
                System.out.println("Select the planet you want to live on?");
                namePlanet = sc.nextLine();
                // checking if the planet exists
                Planet planet = getPlanetByName(namePlanet);
                if (checkPlanet(new Planet(namePlanet))) {
                    // add the being to the population of that planet
                    planet.getPoblation().add(species);
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
            } else if (species instanceof Nibirian && (((Nibirian) species).isRedFloraFood() && planet.isRedFlora() || ((Nibirian) species).isFishFeed() && planet.isAquaticsBeings())) {
                // Shows the planets a Nibirian can live on
                habitablesPlanets.add(planet);
            } else if (species instanceof Ferengian && !planet.getClimate().equalsIgnoreCase("Cold")) {
                // Shows the planets a Ferengian can live on
                habitablesPlanets.add(planet);
            }
        }
        return habitablesPlanets;
    }

    //
    public static boolean existsHabitant(Class speciesClass, List<Race> poblation) {
        boolean existsBeing = false;
        for (Race esp : poblation) {
            if (esp.getClass().equals(speciesClass)) {
                existsBeing = true;
                break;
            }
        }
        // returns false when the unwanted species does not exist
        return existsBeing;
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
        System.out.println("creado!");
        enterPlanet(name);

    }

    public static void createHuman() {
        Scanner sc = new Scanner(System.in);
        String name;
        Human human;
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
            System.out.println("enter age:");
            age = sc.nextInt();
            correctAge(age);
        } while (age < 0 || age > 130);

        do {
            sc.nextLine();
            System.out.println("introduce tu genero:[M / F]");
            gender = sc.nextLine().charAt(0);
            if (gender == 'M' || gender == 'F') {
                exitGender = true;
            }
        } while (!exitGender);
        species.add(new Human(name, age, gender));
        System.out.println("created human");
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

        System.out.println("Enter the strength level:");
        strengthLevel = readInBetweenMinAndMax(50, 350);

        species.add(new Klingonian(name, strengthLevel));
        System.out.println("Created klingonian");
        enterPlanet(name);
    }

    public static void createNibirian() {
        Scanner sc = new Scanner(System.in);
        String name;
        Nibirian nibirian;
        boolean exitName = false;
        boolean feedPl = false;
        String feedingPlants;
        boolean feedingFi = false;
        String feedingFish;
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
            System.out.println("Your diet is based on plants??(yes/no)");
            feedingPlants = sc.nextLine();
            if (feedingPlants.equals("yes")) {
                feedPl = true;
            } else if (feedingPlants.equals("no")) {
                feedPl = false;
            }
        } while (!feedingPlants.equalsIgnoreCase("yes") && !feedingPlants.equalsIgnoreCase("no"));

        do {
            System.out.println("Tu alimentacion se basa en peces??(yes/no)");
            feedingFish = sc.nextLine();
            if (feedingFish.equals("yes")) {
                feedingFi = true;
            } else if (feedingFish.equals("no")) {
                feedingFi = false;
            }
        } while (!feedingFish.equalsIgnoreCase("yes") && !feedingFish.equalsIgnoreCase("no"));

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

        levelMeditation = readInBetweenMinAndMax(0, 10);

        species.add(new Vulcanian(name, levelMeditation));
        System.out.println("creado");
        enterPlanet(name);


    }

    public static Race getRaceByName(String name) {
        Race x = null;
        for (int i = 0; i < species.size(); i++) {
            if (species.get(i).getName().equals(name)) {
                x = species.get(i);
                return x;
            }

        }
        return x;
    }

    public static void removeBeing(){
        Scanner sc = new Scanner(System.in);
        String name;
        if(!species.isEmpty()){
            System.out.println("Enter the name of the being you want to delete::");
            name = sc.nextLine();
            Race especie = getRaceByName(name);
            if(especie != null){
                species.remove(especie);
                for (Planet planeta : planets){
                    if(planeta.getPoblation().contains(especie)){
                        planeta.getPoblation().remove(especie);
                    }
                }
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
        boolean salida = false;
        if(!species.isEmpty()){
            Race sx = null;
            do {
                System.out.println("Que especie deseas modificar??");
                System.out.println("[1] Ferengiano");
                System.out.println("[2] Humano");
                System.out.println("[3] Klingoniano");
                System.out.println("[4] Vulcaniano");
                System.out.println("[0] Salir");
                option = sc.nextInt();
                switch (option){
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
                        salida = true;
                        break;
                    default:
                        System.out.println("valor introducido incorrecto");
                }
            }while (!salida);
        }else{
            System.out.println("Aun no hay especies registradas");
        }
    }

    public static void modifyFerengiano(Race especie){
        Scanner sc = new Scanner(System.in);
        Ferengian x =  ((Ferengian) especie);
        boolean exit = false;
        String nombre = "";

        if(existeSer(Ferengian.class)){
            List<Race> lista_ferengiano = mostrarEspecie(Ferengian.class);
            for(Race ferengianos : lista_ferengiano){
                System.out.println(ferengianos);
            }
            do {
                System.out.println("Introduce el nombre del Ferengiano a modificar :");
                nombre = sc.nextLine();
                x = (Ferengian) getRaceByName(nombre);
                if(x != null){
                    do {
                        System.out.println("Introduce la cantidad de oro nueva:");
                        x.setOro(sc.nextInt());
                    } while (x.getOro() <= 0);
                    System.out.println("Oro modificado");
                    exit = true;
                }else{
                    System.out.println("No existe un ser con tal nombre");
                }
            }while (!exit);
        }else{
            System.out.println("No existen Ferengianos..");
        }
    }

    public static List <Race> mostrarEspecie(Class especie){
        ArrayList <Race> lista_seres = new ArrayList<>();
        for (Race especies : especies){
            if (especies.getClass().equals(especie)){
                lista_seres.add(especies);
            }
        }
        return lista_seres;
    }
    public static void modifyHumano(Race especie){
        Scanner sc = new Scanner(System.in);
        Human x =  ((Human) especie);
        boolean exit = false;

        if(existeSer(Human.class)){
            List<Race> lista_humanos = mostrarEspecie(Human.class);
            for(Race humanos : lista_humanos){
                System.out.println(humanos);
            }
            do {
                System.out.println("Introduce el nombre del Humano a modificar :");
                x = (Human) getRaceByName(sc.nextLine());
                System.out.println("Edad: "+x.getEdad());
                if(x != null){
                    System.out.println("Introduce la nueva edad:");
                    x.setEdad(readInBetweenMinAndMax(0,130));
                    System.out.println("edad modificada");
                }else{
                    System.out.println("No existe un ser con tal nombre");
                }
                exit = true;
            }while (!exit);
        }else{
            System.out.println("No existen Humanos..");
        }
    }

    public static void modifyKlingoniano(Race especie){
        Scanner sc = new Scanner(System.in);
        Klingonian x =  ((Klingonian) especie);
        boolean exit = false;

        if(existeSer(Klingonian.class)){
            List<Race> lista_klingoniano = mostrarEspecie(Klingonian.class);
            for(Race klingonianos : lista_klingoniano){
                System.out.println(klingonianos);
            }
            do {
                System.out.println("Introduce el nombre del Klingoniano a modificar :");
                x = (Klingonian) getRaceByName(sc.nextLine());
                if(x != null){
                    System.out.println("Nivel Fuerza: "+x.getNivelFuerza());
                    System.out.println("Introduce el nuevo nivel de fuerza :");
                    x.setNivelFuerza(readInBetweenMinAndMax(50,350));
                    System.out.println("Nivel de fuerza modificado.!");
                    exit = true;
                }else{
                    System.out.println("No existe un ser con tal nombre");
                }
            }while (!exit);
        }else{
            System.out.println("No existen Klingoniano..");
        }
    }

    public static void modifyVulcaniano(Race especie){
        Scanner sc = new Scanner(System.in);
        Vulcanian x =  ((Vulcanian) especie);
        boolean exit = false;

        if(existeSer(Vulcanian.class)){
            List<Race> lista_vulcaniano = mostrarEspecie(Vulcanian.class);
            for(Race vulcanianos : lista_vulcaniano){
                System.out.println(vulcanianos);
            }
            do {
                System.out.println("Introduce el nombre del Vulcaniano a modificar :");
                x = (Vulcanian) getRaceByName(sc.nextLine());
                if(x != null){
                    System.out.println("Nivel meditacion: "+x.getNivelMeditacion());
                    System.out.println("Introduce el nuevo nivel de meditacion :");
                    x.setNivelMeditacion(readInBetweenMinAndMax(0 , 10));
                    System.out.println("Nivel de meditacion modificado!");
                    exit = true;
                }else{
                    System.out.println("El nombre es incorrecto");
                }
            }while (!exit);
        }else{
            System.out.println("No existen Vulcanianos..");
        }
    }

    public static boolean existeSer(Class ser){
        boolean si_hay = false;
        for (Race ps : especies){
            if (ps.getClass().equals(ser)){
                si_hay = true;
                return si_hay;
            }
        }
        return si_hay;

    }

}
