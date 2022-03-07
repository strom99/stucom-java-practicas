package Modulo2.Controller;

import Modulo2.Model.Athlete;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

import static Modulo2.MyLibrary.Arrays.*;
import static Modulo2.MyLibrary.DataValidation.*;

public class AthleteController {

    public static ArrayList<Athlete> athletes = new ArrayList<>();



    public static void registerAthlete() {
        Scanner sc = new Scanner(System.in);
        /*
        if (athletes == null) {
        athletes = new Athlete[readInBetweenMinAndMax(1, 10)];
        }*/

        /*if (!isFull(athletes)) {
        System.out.println("No hay espacio");

        } else {*/
        String nif;
        do {
            System.out.println("Introduce el nif: ");
            nif = sc.nextLine();
        } while (!validationDNI(nif));

        if (repeatNIF(nif) == false) {
            System.out.println("Ingrese el nombre del atleta");
            String name = sc.nextLine();

            int age;
            do {
                System.out.println("Ingrese la edad");
                age = sc.nextInt();
            } while (age < 1);

            char eleccion;
            sc.nextLine();
            do {
                System.out.println("¿Quieres especificar tu sexo? (S/N)");
                eleccion = sc.nextLine().charAt(0);
            } while (eleccion != 'S' && eleccion != 'N');

            // eleccion de si el usuario quiere poner su genero , como opcional
            if (eleccion == 'S') {
                String sexo;
                do {
                    System.out.println("Ingresa tu sexo");
                    sexo = sc.nextLine();
                } while (!sexo.equals("M") && !sexo.equals("F"));
                athletes.add(new Athlete(nif ,name, age, sexo));
                System.out.println("Atleta creado!!");
            } else if (eleccion == 'N') {
                athletes.add(new Athlete(nif ,name, age));
                System.out.println("Atleta creado!!");
            }
        }
    }


    public static void showAthletes(String atributo) {

        if (athletes.size() == 0) {
            System.out.println("Aun no hay atletas creados");/*

        } else if (isEmpty(athletes)) {
            System.out.println("Aun no hay datos en el array");*/
        } else {
            if(atributo.equalsIgnoreCase("all")){
                for(int i = 0; i < athletes.size(); i++){
                    System.out.println("DNI :" + athletes.get(i).getNif());
                    System.out.println("Nombre :" + athletes.get(i).getName());
                    System.out.println("Edad : "+ athletes.get(i).getAge());

                    if(athletes.get(i).getGender() != null){
                        System.out.println("Genero: "+athletes.get(i).getGender());
                    }
                    if(athletes.get(i).isSenior()){
                        System.out.println("Es mayor de Edad ");
                    }

                    System.out.println("Carreras por "+ athletes.get(i).getName());
                    if(athletes.get(i).getAthletesRace().isEmpty()){
                        System.out.println("No hay carreras registradas");
                    }else{
                        System.out.println("codeRace : "+ athletes.get(i).getAthletesRace().get(i).getId() + " Localidad : " + athletes.get(i).getAthletesRace().get(i).getLocalidad());
                    }

                    System.out.println(" ");
                }
            }else if(atributo.equalsIgnoreCase("name")){
                System.out.println("nothing");
            }
        }
    }


    public static void modifyAthlete() {

        Scanner sc = new Scanner(System.in);
        if (athletes.size() == 0) {
            System.out.println("Aun no hay ningun atleta");
        } else {
            System.out.println("Introduce el nif del atleta que deseas modificar ");
            String nifModify = sc.nextLine();

            if (validationDNI(nifModify)) {
                boolean salirModidy = false;
                do {
                    // guardamos la posicion de donde se encuentra el array en otro objeto , y verificamos si el atleta que ingreso coincide con otro
                    Athlete athToMod = getAthleteByNif(nifModify);
                    if (athToMod != null) {
                        System.out.println("Que atributo del atleta quieres modificar : " + athToMod.getNif());
                        System.out.println(" Modify nombre [1]");
                        System.out.println(" Modify edad [2]");
                        System.out.println(" Modify genero [3]");
                        System.out.println(" Exit  menu [4]");
                        int opcionAtributo = sc.nextInt();

                        switch (opcionAtributo) {
                            case 1:
                                System.out.println("El nombre del Atleta es : " + athToMod.getName());
                                System.out.println("Introduce el nuevo nombre :  ");
                                sc.nextLine();
                                athToMod.setName(sc.nextLine());
                                break;
                            case 2:
                                System.out.println("La edad del atleta es : " + athToMod.getAge());
                                do {
                                    System.out.println("Introduce la nueva edad : ");
                                    athToMod.setAge(sc.nextInt());
                                } while (athToMod.getAge() < 1);

                                break;
                            case 3:
                                if(athToMod.getGender() != null){
                                    System.out.println("El genero del atleta es : " + athToMod.getGender());
                                    sc.nextLine();
                                    do {
                                        System.out.println("Introduce el nuevo genero :  ");
                                        athToMod.setGender(sc.nextLine());
                                    } while (!athToMod.getGender().equals("M") && !athToMod.getGender().equals("F"));
                                }
                                break;
                            case 4:
                                System.out.println("Saliste");
                                salirModidy = true;
                                break;
                            default:
                                System.out.println("opcion incorrecta");

                        }
                        System.out.println("Atributo Modificado!");
                    } else {
                        System.out.println("no hay nada aun!");
                        salirModidy = true;
                    }

                } while (!salirModidy);
            } else {
                System.out.println("el nif introducido es incorrecto");
            }
        }
    }
}
/*
    public static void deleteAthlete() {
        Scanner sc = new Scanner(System.in);

        //comprobamos que el array se haya iniciado y que el array no este vacio
        if (athletes == null || isEmpty(athletes) == true) {
            System.out.println("Aun no existen atletas que eliminar");
        } else {
            System.out.println("Empecemos con la eliminacion del atleta");
            System.out.println("Introduce el Nif :");
            String nifDelete = sc.nextLine();
            if (validationDNI(nifDelete)) {
                if (repeatNIF(nifDelete)) {
                    // guardamos la posicion del array
                    Athlete saNif = getAthleteByNif(nifDelete);
                    // guardamos el indice de su posicion , para seleccionar sus atributos
                    int atletaIndex = getIndexByAthleteNif(saNif.getNif());
                    if (atletaIndex != -1) {
                        athletes[atletaIndex] = null;
                        System.out.println("eliminado");
                    }
                }else {
                    System.out.println("no existe el atleta con ese nif");
                }
            } else {
                System.out.println("El dni introducido es incorrecto");
            }
        }
    }*/


