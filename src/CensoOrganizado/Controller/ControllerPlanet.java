package CensoOrganizado.Controller;

import CensoOrganizado.modelo.Planetas;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerPlanet extends Planetas {
    public static ArrayList <Planetas> planetas = new ArrayList<>(); // para recorrer las especies

    public static boolean verificarNombre(String nombre){
            for(int i = 0 ; i < planetas.size(); i++){
                if(nombre.equalsIgnoreCase(planetas.get(i).getNombre())){
                   return true;
                }
            }
            return false;
    }
    public static void crearPlaneta(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        String galaxia;
        String clima;
        String flora;
        String seres;
        boolean floraRoja = false;
        boolean seresAcuaticos = false;

        do{
            System.out.println("Introduce el nombre del planeta ");
            nombre = sc.nextLine();
            if(verificarNombre(nombre)){
                System.out.println("Ya existe ese nombre");
            }
        }while(verificarNombre(nombre));


        System.out.println("Introduce la galaxia : ");
        galaxia = sc.nextLine();

        System.out.println("Introduce el clima :");
        clima= sc.nextLine();

        do{
            System.out.println("Tu planeta dispone de flora roja??(yes/no)");
            flora = sc.nextLine();
            if(flora.equals("yes")){
                floraRoja = true;
            }else if(flora.equals("no")){
                floraRoja = false;
            }
        }while (!flora.equals("yes") && !flora.equals("no"));

        do{
            System.out.println("Tu planeta dispone seres acuaticos??(yes/no)");
            seres = sc.nextLine();
            if(seres.equals("yes")){
                seresAcuaticos = true;
            }else if(seres.equals("no")){
                seresAcuaticos = false;
            }
        }while (!seres.equals("yes") && !seres.equals("no"));
        planetas.add(new Planetas(nombre,galaxia,clima,floraRoja,seresAcuaticos));

    }

    public static void verEspecies(){
        for(Planetas planeta : planetas){
            System.out.println(planeta.getNombre());
        }
    }
}
