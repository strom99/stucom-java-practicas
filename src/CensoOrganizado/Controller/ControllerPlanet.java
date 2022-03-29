package CensoOrganizado.Controller;

import CensoOrganizado.modelo.Planetas;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerPlanet {
    ArrayList <Planetas> poblacion = new ArrayList<>(); // para recorrer las especies

    public static void crearPlaneta(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        boolean salir = false ;
        System.out.println("Creacion planeta ");
        do {
            System.out.println("Introduce el nombre del planeta : ");
            nombre = sc.nextLine();
            salir = true;
        }while (!salir);
    }
}
