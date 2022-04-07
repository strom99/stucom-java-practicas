package CensoOrganizado.Controller;

import CensoOrganizado.modelo.Especie;
import CensoOrganizado.modelo.Planeta;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerPlanet {
    public static ArrayList <Planeta> planetas = new ArrayList<>(); // para recorrer las especies

    // consigue el objeto planeta con el nombre
    public static Planeta getPlanetByName(String name) {
        Planeta planeta = null;
        for (int i = 0; i < planetas.size(); i++) {
            if (planetas.get(i).getNombre().equals(name)) {
                planeta = planetas.get(i);
                break;
            }

        }
        return planeta;
    }

    public static boolean verificarPlaneta(Planeta planeta){
        boolean existe = false;
        if (!planetas.isEmpty()) {
            for(int i = 0 ; i < planetas.size(); i++){
                if(planetas.get(i).equals(planeta)){
                    existe = true;
                }
            }
        }
        return existe;
    }

    public static String Clima(){
        Scanner sc = new Scanner(System.in);
        boolean salida = false;
        int numero;
        String clima="";
        do {
            System.out.println("Introduce un clima:");
            System.out.println("[1] Frio");
            System.out.println("[2] Calido");
            System.out.println("[3] Templado");
            numero = sc.nextInt();
            switch (numero){
                case 1 :
                    clima = "Frio";
                    salida =true;
                    break;
                case 2:
                    clima = "Calido";
                    salida =true;
                    break;
                case 3:
                    clima = "Templado";
                    salida =true;
                    break;
                default:
                    System.out.println("opcion erronea");
            }
        }while (!salida);
        return clima;
    }
    public static void crearPlaneta(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        String galaxia;
        String flora;
        String seres;
        boolean floraRoja = false;
        boolean seresAcuaticos = false;
        Planeta planeta;

        // nombre planeta
        boolean salir = false;
        do{
            System.out.println("Introduce el nombre del planeta: ");
            nombre = sc.nextLine();
            planeta = new Planeta(nombre);
            if(verificarPlaneta(planeta)){
                System.out.println("Ya existe ese nombre");
            } else {
                salir = true;
            }
        }while(!salir);

        // galaxia nombre
        System.out.println("Introduce la galaxia : ");
        galaxia = sc.nextLine();

        // clima galaxia
        String clima = Clima();

        // flora roja boolean
        do{
            System.out.println("Tu planeta dispone de flora roja??(yes/no)");
            flora = sc.nextLine();
            if(flora.equals("yes")){
                floraRoja = true;
            }else if(flora.equals("no")){
                floraRoja = false;
            }
        }while (!flora.equalsIgnoreCase("yes") && !flora.equalsIgnoreCase("no"));

        do{
            System.out.println("Tu planeta dispone seres acuaticos??(yes/no)");
            seres = sc.nextLine();
            if(seres.equals("yes")){
                seresAcuaticos = true;
            }else if(seres.equals("no")){
                seresAcuaticos = false;
            }
        }while (!seres.equalsIgnoreCase("yes") && !seres.equalsIgnoreCase("no"));
        planetas.add(new Planeta(nombre,galaxia,clima,floraRoja,seresAcuaticos));

    }

    public static void verPlanetas(){
        if(!planetas.isEmpty()){
            for(int i = 0 ; i < planetas.size();i++){
                System.out.println(planetas.get(i));
            }
        }else{
            System.out.println("Aun no hay planetas");
        }
    }

    public static void verPoblacionPlanetas(){
        Scanner sc = new Scanner(System.in);
        Planeta planeta = null;
        verPlanetas();
        System.out.println("Introduce el nombre del planeta , para ver su poblacion");
        planeta = getPlanetByName(sc.nextLine());
        if(planeta != null){
            System.out.println("poblacion del planeta "+planeta.getNombre());
            if(!planeta.getPoblacion().isEmpty()){
                for (int i = 0; i < planeta.getPoblacion().size(); i++){
                    System.out.println(planeta.getPoblacion().get(i));
                }
            }else
                System.out.println("el planeta no dispone de habitantes");
        }else{
            System.out.println("ese planeta no es correcto");
        }
    }
}
