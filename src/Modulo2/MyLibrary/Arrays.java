package Modulo2.MyLibrary;

import Modulo2.Model.Athlete;

import static Modulo2.Controller.AthleteController.athletes;

public class Arrays {

    public static boolean isFull (Object array []) {
        int contador = 0;
        boolean hayEspacio = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                hayEspacio = true;
            }
        }
        return hayEspacio;
    }

    // recorre el array e inicia un contador para ver si el array esta vacio
    public static boolean isEmpty (Athlete [] athletes) {
        int contador = 0;
        boolean hayEspacio = false;
        for (int i = 0; i < athletes.length; i++) {
            if (athletes[i] == null) {
                contador++;
            }
        }

        if(contador == athletes.length){
            hayEspacio = true;
        }
        return hayEspacio;
    }
    public static int  firstFreePosition (Object array []) {
        boolean full = true;
        int position = -1;
        for (int i = 0; i < array.length && full; i++) {
            if (array[i] == null) {
                full = false;
                position = i;
            }
        }
        return position;
    }

    // busca la posicion del atleta en el array y si coincide con el nif ingresado
    public static Athlete getAthleteByNif(String nifModify) {
        Athlete athlete = null;
        for (int i = 0; i < athletes.length; i++) {
            if (athletes[i] != null && athletes[i].getNif().equals(nifModify)) {
                athlete = athletes[i];
                break;
            }

        }
        return athlete;
    }

    // busca el indice del array y compara el nif
    public static int getIndexByAthleteNif(String nif) {
        int index = -1;
        for (int i = 0; i < athletes.length; i++) {
            if (athletes[i] != null && athletes[i].getNif().equals(nif)) {
                index = i;
                break;
            }
        }
        return index;
    }

}
