package Modulo2.Controller;

import Modulo2.Model.Athlete;

import java.util.Scanner;

import static Modulo2.MyLibrary.Arrays.isEmpty;
import static Modulo2.MyLibrary.Arrays.isFull;
import static Modulo2.MyLibrary.DataValidation.*;

public class AthleteController {
    public static Athlete[] athletes;
    public static int contador = 0;
    String dni;

    public static void registerAthlete () {

        Scanner sc = new Scanner(System.in);

        //VERIFICACION SI HAY ESPACIO EN EL ARRAY
        if (athletes == null) {
            athletes = new Athlete[readInBetweenMinAndMax(1, 10)];
        }

        if(!isFull(athletes)){
            System.out.println("No hay espacio");

        } else {
            String nif;
            do{
                System.out.println("introduce el dni : ");
                nif = sc.nextLine();
            }while(!validationDNI(nif));

            if(repeatNIF(nif) == false){
                System.out.println("Ingrese el nombre del atleta");
                String name = sc.nextLine();

                int age;
                do {
                    System.out.println("Ingrese la edad");
                    age = sc.nextInt();
                } while (age < 1);


                System.out.println("¿Quieres especificar tu sexo? (S/N)");
                sc.nextLine();
                char eleccion = sc.nextLine().charAt(0);

                // eleccion de si el usuario quiere poner su genero , como opcional
                if (eleccion == 'S') {
                    String sexo;
                    do {
                        System.out.println("Ingresa tu sexo");
                        sexo = sc.nextLine();
                    } while (!sexo.equals("M") && !sexo.equals("F"));
                    athletes[contador] = new Athlete(nif, name, age, sexo);
                } else {
                    athletes[contador] = new Athlete(nif, name, age);
                }
                contador++;

            }
        }
    }

    public static void showAthletes () {

        if(athletes == null){
            System.out.println("Aun no se ha creado el array");

        }else if(isEmpty(athletes)){
            System.out.println("Aun no hay datos en el array");
        }else{

            for (Athlete atleta : athletes) {
                if (atleta != null) {
                    System.out.println("---------- Atleta ------------");
                    System.out.println("Dni :" + atleta.getNif());
                    System.out.println("Nombre :" + atleta.getName());

                    if(atleta.isSenior() == true){
                        System.out.println("Senior : +50");
                    }else{
                        System.out.println("Edad :" + atleta.getAge());
                    }

                    if(atleta.getGender() != null){
                        System.out.println("Genero :"+ atleta.getGender());
                    }else{
                        System.out.println("Genero : sin especificar ");
                    }
                }
            }
        }

    }

    public static void modifyAthlete(){
        boolean salirModidy = false;
        Scanner sc = new Scanner(System.in);
        if(athletes == null){
            System.out.println("Aun no hay ningun atleta");
        }else{
            System.out.println("Introduce el nif del atleta que deseas modificar ");
            String nifModify = sc.nextLine();

            if(validationDNI(nifModify)){
                if(repeatNIF(nifModify)){
                    do{
                        System.out.println("Que atributo del atleta quieres modificar : ");
                        System.out.println(" Modify nombre [1]");
                        System.out.println(" Modify edad [2]");
                        System.out.println(" Modify genero [3]");
                        System.out.println(" Exit  menu [4]");
                        int opcionAtributo = sc.nextInt();

                        switch (opcionAtributo){
                            case 1 :
                                System.out.println("Introduce el nuevo nombre");
                                break;
                            case 2:
                                System.out.println("Introduce la nueva edad : ");
                                break;
                            case 3:
                                System.out.println("Introduce el nuevo genero :");
                                break;
                            case 4:
                                System.out.println("Saliste");
                                salirModidy = true;
                            default:
                                System.out.println("Wrong opcion");

                        }
                    }while ();
                }else{
                    System.out.println("el nif introducido es incorrecto");
                }
            }
        }

    }
}


