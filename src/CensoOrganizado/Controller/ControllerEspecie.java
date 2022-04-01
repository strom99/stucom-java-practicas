package CensoOrganizado.Controller;

import CensoOrganizado.modelo.*;
import Modulo2.Model.Athlete;

import java.util.ArrayList;
import java.util.Scanner;

import static CensoOrganizado.Controller.ControllerPlanet.*;
import static CensoOrganizado.MetodosGlobales.Metodos.*;
import static CensoOrganizado.modelo.Ferengiano.dineroC;
import static CensoOrganizado.modelo.Humano.correctaEdad;
import static Modulo2.Controller.AthleteController.athletes;

public class ControllerEspecie {
    public static ArrayList <Especie> especies = new ArrayList<>();

    public static boolean verificarNombreE(Especie especie){
        boolean existe = false;
        if (!especies.isEmpty()) {
            for(int i = 0 ; i < especies.size(); i++){
                if(especies.get(i).equals(especie)){
                    existe = true;
                }
            }
        }
        return existe;
    }

    public static void verSeres(){
        for(Especie especie : especies){
            System.out.println(especie);
        }
    }
    public static void CensarSer(){
        if(!planetas.isEmpty()){
            Scanner sc = new Scanner(System.in);
            int opcion;
            System.out.println("Que tipo de especie quieres censar:");
            System.out.println("[1] Andoriano");
            System.out.println("[2] Ferengiano");
            System.out.println("[3] Humano");
            System.out.println("[4] Klingoniano");
            System.out.println("[5] Nibiriano");
            System.out.println("[6] Vulcaniano");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    crearAndoriano();
                    break;
                case 2:
                    crearFerengiano();
                    break;
                case 3:
                    crearHumano();
                    break;
                case 4:
                    crearKlingoniano();
                    break;
                case 5:
                    crearNibiriano();
                    break;
                case 6:
                    crearVulcaniano();
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }
        }else{
            System.out.println("Aun no hay ningun planeta registrado");
        }
    }
    public static void crearAndoriano(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        String rango = "";
        int rangoN;
        boolean salirNombre = false;
        boolean salirRango = false;
        String aenar ;
        boolean Aenar = false;
        Andoriano andoriano;
        do{
            System.out.println("Introduce el nombre del ser: ");
            nombre = sc.nextLine();
            andoriano = new Andoriano(nombre);
            if(verificarNombreE(andoriano)){
                System.out.println("Ya existe ese nombre");
            } else {
                salirNombre = true;
            }
        }while(!salirNombre);

        do {
            System.out.println("Que rango tiene "+ nombre+":");
            System.out.println("[1] Entrenador");
            System.out.println("[2] Defensor");
            System.out.println("[3] Luchador");
            System.out.println("[4] Caballero");
            rangoN = sc.nextInt();
            switch (rangoN){
                case 1:
                    rango = "Entrenador";
                    salirRango = true;
                    break;
                case 2:
                    rango = "Defensor";
                    salirRango = true;
                    break;
                case 3:
                    rango = "Luchador";
                    salirRango = true;
                    break;
                case 4:
                    rango = "Caballero";
                    salirRango = true;
                    break;
                default:
                    System.out.println("introduce un valor correcto");
            }
        }while (!salirRango);

        sc.nextLine();
        do{
            System.out.println("Eres aenar ??(yes/no)");
            aenar = sc.nextLine();
            if(aenar.equals("yes")){
                Aenar = true;
            }else if(aenar.equals("no")){
                Aenar = false;
            }
        }while (!aenar.equalsIgnoreCase("yes") && !aenar.equalsIgnoreCase("no"));

        System.out.println("ser creado!!!");
        especies.add(new Andoriano(nombre , rango , Aenar));
        Especie ando = getRaceByName(nombre);

        boolean salirP = false;
        String nombrePlaneta;
        Planeta planeta = null;
        do {
            System.out.println("Introduce el nombre del planeta al que quieres registrarte:");
            verPlanetas();
            nombrePlaneta = sc.nextLine();
            planeta = getPlanetByName(nombrePlaneta);
            if(planeta != null){
                planeta.getPoblacion().add(ando);
                salirP = true;
            }
        }while (!salirP);
    }

    public static void crearFerengiano(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        int oro;
        boolean salirNombre = false;
        Ferengiano ferengiano ;
        do{
            System.out.println("Introduce el nombre del ser: ");
            nombre = sc.nextLine();
            ferengiano = new Ferengiano(nombre);
            if(verificarNombreE(ferengiano)){
                System.out.println("Ya existe ese nombre");
            } else {
                salirNombre = true;
            }
        }while(!salirNombre);

        do {
            System.out.println("De cuanto oro dispones???");
            oro = sc.nextInt();
            dineroC(oro);
        }while (oro <= 0);

        especies.add(new Ferengiano(nombre , oro));
        System.out.println("creado!");


    }

    public static void crearHumano(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        Humano humano;
        int edad;
        char genero;
        boolean salirNombre = false;
        boolean salirGenero = false;
        do{
            System.out.println("Introduce el nombre del ser: ");
            nombre = sc.nextLine();
            humano = new Humano(nombre);
            if(verificarNombreE(humano)){
                System.out.println("Ya existe ese nombre");
            } else {
                salirNombre = true;
            }
        }while(!salirNombre);

        do {
            System.out.println("introduce la edad:");
            edad = sc.nextInt();
            correctaEdad(edad);
        }while (edad < 0 || edad > 130);

        do {
            sc.nextLine();
            System.out.println("introduce tu genero:[M / F]");
            genero = sc.nextLine().charAt(0);
            if(genero == 'M' || genero == 'F'){
                salirGenero = true;
            }
        }while (!salirGenero);
        especies.add(new Humano(nombre,edad,genero));
        System.out.println("Humano creado");
    }

    public static void crearKlingoniano(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        Klingoniano klingoniano;
        int nivelFuerza;
        boolean salirNombre =false;
        do{
            System.out.println("Introduce el nombre del ser: ");
            nombre = sc.nextLine();
            klingoniano = new Klingoniano(nombre);
            if(verificarNombreE(klingoniano)){
                System.out.println("Ya existe ese nombre");
            } else {
                salirNombre = true;
            }
        }while(!salirNombre);

        System.out.println("Introduce el nivel de fuerza:");
        nivelFuerza = readInBetweenMinAndMax(50,350);

        especies.add(new Klingoniano(nombre, nivelFuerza));
        System.out.println("creado");
    }

    public static void crearNibiriano(){
        Scanner sc = new Scanner(System.in);
        String nombre ;
        Nibiriano nibiriano;
        boolean salirNombre = false;
        boolean alimentacionPl = false;
        String alimentacionPlantas;
        boolean alimentacionPe = false;
        String alimentacionPeces;
        do{
            System.out.println("Introduce el nombre del ser: ");
            nombre = sc.nextLine();
            nibiriano = new Nibiriano(nombre);
            if(verificarNombreE(nibiriano)){
                System.out.println("Ya existe ese nombre");
            } else {
                salirNombre = true;
            }
        }while(!salirNombre);

        do{
            System.out.println("Tu alimentacion se basa en plantas??(yes/no)");
            alimentacionPlantas = sc.nextLine();
            if(alimentacionPlantas.equals("yes")){
                alimentacionPl = true;
            }else if(alimentacionPlantas.equals("no")){
                alimentacionPl = false;
            }
        }while (!alimentacionPlantas.equalsIgnoreCase("yes") && !alimentacionPlantas.equalsIgnoreCase("no"));

        do{
            System.out.println("Tu alimentacion se basa en peces??(yes/no)");
            alimentacionPeces = sc.nextLine();
            if(alimentacionPeces.equals("yes")){
                alimentacionPe = true;
            }else if(alimentacionPeces.equals("no")){
                alimentacionPe = false;
            }
        }while (!alimentacionPlantas.equalsIgnoreCase("yes") && !alimentacionPlantas.equalsIgnoreCase("no"));

        especies.add(new Nibiriano(nombre,alimentacionPl,alimentacionPe));
        System.out.println("creado");
    }

    public static void crearVulcaniano(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        Vulcaniano vulcaniano;
        boolean salirNombre = false;
        int nivelMeditacion;
        do{
            System.out.println("Introduce el nombre del ser: ");
            nombre = sc.nextLine();
            vulcaniano = new Vulcaniano(nombre);
            if(verificarNombreE(vulcaniano)){
                System.out.println("Ya existe ese nombre");
            } else {
                salirNombre = true;
            }
        }while(!salirNombre);

        nivelMeditacion = readInBetweenMinAndMax(0,10);

        especies.add(new Vulcaniano(nombre,nivelMeditacion));
        System.out.println("creado");

    }


    public static Especie getRaceByName(String name) {
        Especie especie = null;
        for (int i = 0; i < especies.size(); i++) {
            if (especies.get(i).getNombre().equals(name)) {
                especie = especies.get(i);
                break;
            }

        }
        return especie;
    }
}
