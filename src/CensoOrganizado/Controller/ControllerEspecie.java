package CensoOrganizado.Controller;

import CensoOrganizado.modelo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static CensoOrganizado.Controller.ControllerPlanet.*;
import static CensoOrganizado.MetodosGlobales.Metodos.*;
import static CensoOrganizado.modelo.Ferengiano.dineroC;
import static CensoOrganizado.modelo.Humano.correctaEdad;

public class ControllerEspecie {
    public static ArrayList<Especie> especies = new ArrayList<>();

    public static boolean verificarNombreE(Especie especie) {
        boolean existe = false;
        if (!especies.isEmpty()) {
            for (int i = 0; i < especies.size(); i++) {
                if (especies.get(i).equals(especie)) {
                    existe = true;
                }
            }
        }else {
            System.out.println("No existen seres aun");
        }
        return existe;
    }

    public static void verSeres() {
        if (!especies.isEmpty()) {
            for (Especie especie : especies) {
                System.out.println(especie);
            }
        } else {
            System.out.println("Aun no hay especies registradas");
        }
    }

    public static void CensarSer() {
        if (!planetas.isEmpty()) {
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
            switch (opcion) {
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
        } else {
            System.out.println("Aun no hay ningun planeta registrado");
        }
    }

    public static void crearAndoriano() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String rango = "";
        int rangoN;
        boolean salirNombre = false;
        boolean salirRango = false;
        String aenar;
        boolean Aenar = false;
        Andoriano andoriano;
        do {
            System.out.println("Introduce el nombre del ser: ");
            nombre = sc.nextLine();

            /*
            if(!especies.contains(new Especies(nombre))){

            }*/
            andoriano = new Andoriano(nombre);
            if (verificarNombreE(andoriano)) {
                System.out.println("Ya existe ese nombre");
            } else {
                salirNombre = true;
            }
        } while (!salirNombre);

        do {
            System.out.println("Que rango tiene " + nombre + ":");
            System.out.println("[1] Entrenador");
            System.out.println("[2] Defensor");
            System.out.println("[3] Luchador");
            System.out.println("[4] Caballero");
            rangoN = sc.nextInt();
            switch (rangoN) {
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
        } while (!salirRango);

        sc.nextLine();
        do {
            System.out.println("Eres aenar ??(yes/no)");
            aenar = sc.nextLine();
            if (aenar.equals("yes")) {
                Aenar = true;
            } else if (aenar.equals("no")) {
                Aenar = false;
            }
        } while (!aenar.equalsIgnoreCase("yes") && !aenar.equalsIgnoreCase("no"));
        System.out.println("ser creado!!!");
        especies.add(new Andoriano(nombre, rango, Aenar));
        ingresoPlaneta(nombre);
    }

    // ingresar al ser en un planeta (#1)
    public static void ingresoPlaneta(String nombre) {
        Scanner sc = new Scanner(System.in);
        Especie especie = getRaceByName(nombre);
        String nombrePl;
        boolean salir = false;
        do {
            System.out.println("Planetas habitables:");
            // creamos un array para mostrar los planetas que salen del metodo obtenerPlanetasHabitables() , que devuelve un array;
            List<Planeta> planetasHabitables = obtenerPlanetasHabitables(especie);
            if (planetasHabitables.isEmpty()) {
                System.out.println("0");
                salir = true;
            } else {
                //  muestro planetas habitables del array planetasHabitables
                for (Planeta planetasH: planetasHabitables) {
                    System.out.println(planetasH);
                }
                System.out.println("Selecciona el planeta en el que quieres vivir?");
                nombrePl = sc.nextLine();
                // comprobacion de si el planeta existe
                Planeta planeta = getPlanetByName(nombrePl);
                if (verificarPlaneta(planeta)) {
                    // añade al ser en la poblacion de ese planeta
                    planeta.getPoblacion().add(especie);
                    System.out.println("Censo correcto");
                    salir =true;
                } else {
                    System.out.println("El planeta no existe!!");
                }
            }
        } while (!salir);
    }

    // comprobacion poblacion para cierto habitaante (#2), devuelve lista de planetas en un array
    public static List<Planeta> obtenerPlanetasHabitables(Especie especie) {
        ArrayList<Planeta> planetasHabitables = new ArrayList<>();

        for (Planeta planeta : planetas) {
                // Muestra los planetas en los que un andoriano puede vivir
            if (especie instanceof Andoriano && !existeHabitante(Vulcaniano.class, planeta.getPoblacion())) {
                    planetasHabitables.add(planeta);
            } else if (especie instanceof Vulcaniano && !existeHabitante(Andoriano.class, planeta.getPoblacion())) {
                // Muestra los planetas en los que un vulcaniano puede vivir
                    planetasHabitables.add(planeta);
            } else if (especie instanceof Humano) {
                // Muestra los planetas en los que un humano puede vivir
                    planetasHabitables.add(planeta);
            } else if (especie instanceof Klingoniano && !planeta.getClima().equalsIgnoreCase("Calido")) {
                // Muestra los planetas en los que un klingoniano puede vivir
                    planetasHabitables.add(planeta);
            } else if (especie instanceof Nibiriano && (((Nibiriano) especie).isAlimentacionFloraRoja() && planeta.isFlora_roja() || ((Nibiriano) especie).isAlimentacionPeces() && planeta.isSeres_acuaticos())) {
                // Muestra los planetas en los que un nibiriano puede vivir
                    planetasHabitables.add(planeta);
            } else if (especie instanceof Ferengiano && !planeta.getClima().equalsIgnoreCase("Frio")) {
                // Muestra los planetas en los que un Ferengiano puede vivir
                    planetasHabitables.add(planeta);
            }
        }
        return planetasHabitables;
    }

    //
    public static boolean existeHabitante(Class especieClass, List<Especie> poblacion) {
        boolean existeEspecie = false;
        for (Especie esp : poblacion) {
            if (esp.getClass().equals(especieClass)) {
                existeEspecie = true;
                break;
            }
        }
        // retorna false cuando no existe la especie no deseada
        return existeEspecie;
    }


    public static void crearFerengiano() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int oro;
        boolean salirNombre = false;
        Ferengiano ferengiano;
        do {
            System.out.println("Introduce el nombre del ser: ");
            nombre = sc.nextLine();
            ferengiano = new Ferengiano(nombre);
            if (verificarNombreE(ferengiano)) {
                System.out.println("Ya existe ese nombre");
            } else {
                salirNombre = true;
            }
        } while (!salirNombre);

        do {
            System.out.println("De cuanto oro dispones???");
            oro = sc.nextInt();
            dineroC(oro);
        } while (oro <= 0);

        especies.add(new Ferengiano(nombre, oro));
        System.out.println("creado!");
        ingresoPlaneta(nombre);

    }

    public static void crearHumano() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        Humano humano;
        int edad;
        char genero;
        boolean salirNombre = false;
        boolean salirGenero = false;
        do {
            System.out.println("Introduce el nombre del ser: ");
            nombre = sc.nextLine();
            humano = new Humano(nombre);
            if (verificarNombreE(humano)) {
                System.out.println("Ya existe ese nombre");
            } else {
                salirNombre = true;
            }
        } while (!salirNombre);

        do {
            System.out.println("introduce la edad:");
            edad = sc.nextInt();
            correctaEdad(edad);
        } while (edad < 0 || edad > 130);

        do {
            sc.nextLine();
            System.out.println("introduce tu genero:[M / F]");
            genero = sc.nextLine().charAt(0);
            if (genero == 'M' || genero == 'F') {
                salirGenero = true;
            }
        } while (!salirGenero);
        especies.add(new Humano(nombre, edad, genero));
        System.out.println("Humano creado");
        ingresoPlaneta(nombre);
    }

    public static void crearKlingoniano() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        Klingoniano klingoniano;
        int nivelFuerza;
        boolean salirNombre = false;
        do {
            System.out.println("Introduce el nombre del ser: ");
            nombre = sc.nextLine();
            klingoniano = new Klingoniano(nombre);
            if (verificarNombreE(klingoniano)) {
                System.out.println("Ya existe ese nombre");
            } else {
                salirNombre = true;
            }
        } while (!salirNombre);

        System.out.println("Introduce el nivel de fuerza:");
        nivelFuerza = readInBetweenMinAndMax(50, 350);

        especies.add(new Klingoniano(nombre, nivelFuerza));
        System.out.println("creado");
        ingresoPlaneta(nombre);
    }

    public static void crearNibiriano() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        Nibiriano nibiriano;
        boolean salirNombre = false;
        boolean alimentacionPl = false;
        String alimentacionPlantas;
        boolean alimentacionPe = false;
        String alimentacionPeces;
        do {
            System.out.println("Introduce el nombre del ser: ");
            nombre = sc.nextLine();
            nibiriano = new Nibiriano(nombre);
            if (verificarNombreE(nibiriano)) {
                System.out.println("Ya existe ese nombre");
            } else {
                salirNombre = true;
            }
        } while (!salirNombre);

        do {
            System.out.println("Tu alimentacion se basa en plantas??(yes/no)");
            alimentacionPlantas = sc.nextLine();
            if (alimentacionPlantas.equals("yes")) {
                alimentacionPl = true;
            } else if (alimentacionPlantas.equals("no")) {
                alimentacionPl = false;
            }
        } while (!alimentacionPlantas.equalsIgnoreCase("yes") && !alimentacionPlantas.equalsIgnoreCase("no"));

        do {
            System.out.println("Tu alimentacion se basa en peces??(yes/no)");
            alimentacionPeces = sc.nextLine();
            if (alimentacionPeces.equals("yes")) {
                alimentacionPe = true;
            } else if (alimentacionPeces.equals("no")) {
                alimentacionPe = false;
            }
        } while (!alimentacionPlantas.equalsIgnoreCase("yes") && !alimentacionPlantas.equalsIgnoreCase("no"));

        especies.add(new Nibiriano(nombre, alimentacionPl, alimentacionPe));
        System.out.println("creado");
        ingresoPlaneta(nombre);
    }

    public static void crearVulcaniano() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        Vulcaniano vulcaniano;
        boolean salirNombre = false;
        int nivelMeditacion;
        do {
            System.out.println("Introduce el nombre del ser: ");
            nombre = sc.nextLine();
            vulcaniano = new Vulcaniano(nombre);
            if (verificarNombreE(vulcaniano)) {
                System.out.println("Ya existe ese nombre");
            } else {
                salirNombre = true;
            }
        } while (!salirNombre);

        nivelMeditacion = readInBetweenMinAndMax(0, 10);

        especies.add(new Vulcaniano(nombre, nivelMeditacion));
        System.out.println("creado");
        ingresoPlaneta(nombre);


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

    public static void eliminarSer(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        if(!especies.isEmpty()){
            System.out.println("Introduce el nombre del ser que deseas eliminar:");
            nombre = sc.nextLine();
            Especie especie = getRaceByName(nombre);
            if(verificarNombreE(especie)){
                especies.remove(especie);
                for (Planeta planeta : planetas){
                    if(planeta.getPoblacion().contains(especie)){
                        planeta.getPoblacion().remove(especie);
                    }
                }
            }else {
                System.out.println("Ese ser no existe");
            }

        }else{
            System.out.println("Aun no existen seres");
        }
    }

    public static void modificarPropiedadEspecie(){
        Scanner sc = new Scanner(System.in);
        int opcion ;
        Class especie;
        boolean salida = false;
        if(!especies.isEmpty()){
            do {
                System.out.println("Que especie deseas modificar??");
                System.out.println("[1] Ferengiano");
                System.out.println("[2] Humano");
                System.out.println("[3] Klingoniano");
                System.out.println("[4] Vulcaniano");
                opcion = sc.nextInt();
                switch (opcion){
                    case 1 :
                        especie = Ferengiano.class;
                        boolean exit = false;
                        String nombre;
                        if(!existeSer(especie)){

                        };
                        do {
                            System.out.println("Introduce el nombre del Ferengiano :");
                            nombre = sc.nextLine();
                            Especie esp = getRaceByName(nombre);
                            if(verificarNombreE(esp)){
                                System.out.println("Nivel de oro :"+((Ferengiano) esp).getOro());
                                boolean salidaOro = false;
                                String y_n = "";
                                do{
                                    System.out.println("Quieres modificar el nivel de oro??");
                                    y_n = sc.nextLine();
                                    if(y_n.equals("yes")){
                                        salidaOro = false;
                                    }else if(y_n.equals("no")){
                                        salidaOro = true;
                                    }
                                }while (!y_n.equalsIgnoreCase("yes") && !y_n.equalsIgnoreCase("no"));
                            }else{
                                System.out.println("No existe un ser con tal nombre");
                            }

                        }while (!exit);
                        break;
                }
            }while (!salida);
        }else{
            System.out.println("Aun no hay especies registradas");
        }



    }

    public static boolean existeSer(Class ser){
        Scanner sc = new Scanner(System.in);
        boolean si_hay = false;
        String especie ;
        for (Especie ps : especies){
            if (ser.getClass().equals(ser)){
                si_hay = true;
            }
        }
        return si_hay;

    }

}
