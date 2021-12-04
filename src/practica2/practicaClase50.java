
package practica2;

import java.util.Scanner;

public class practicaClase50 {

    /**
     * Fes un programa que calculi el perímetre i l’àrea d’un cercle i mostri a l’usuari un menú amb les següents
    opcions? Quan es tria l'opció 5, el programa finalitza  --- Si es tria una opció inexistent s’ha de mostrar un
    missatge d’advertència i torno a mostra el menú sense sortir del programa
    [1] Set radius
    [2] Display radius
    [3] Display area
    [4] Display perimeter
    [5] Quit.
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("[1] Set radius");
        System.out.println("[2] Display radius");
        System.out.println("[3] Display area");
        System.out.println("[4] Display perimeter");
        System.out.println("[5] Quit");
        
        System.out.println("Elige una opcion : ");
        
        int numeroMenu= sc.nextInt();
        
        switch (numeroMenu){
            case 1 : 
                
                int numero2 = sc.nextInt();
                System.out.println("introduce el radio del circulo: ");
                ;
            break;
            case 2 :
                System.out.println("el radio introducido es : "+ numero2);
                ;
            break;
            case 3 : System.out.println("Display area");
            break;
            case 4 : System.out.println("Display perimeter");
            break;
            case 5 : System.out.println("Quit");
            break;
            
        }
    }
    
}
