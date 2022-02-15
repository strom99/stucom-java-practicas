package Modulo2.MyLibrary;

import Modulo2.Model.Athlete;

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

}
