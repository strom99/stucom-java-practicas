package Modulo2.MyLibrary;

import Modulo2.Model.Athlete;
import Modulo2.Model.Race;

import static Modulo2.Controller.AthleteController.athletes;
import static Modulo2.Controller.RaceController.races;

public class Arrays {

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
        for (int i = 0; i < athletes.size(); i++) {
            if (athletes.get(i).getNif().equals(nifModify)) {
                athlete = athletes.get(i);
                break;
            }

        }
        return athlete;
    }
    public static Race getRaceById (String id) {
        Race registeringRace = null;
        for (int i = 0; i < races.size(); i++) {
            if (races.get(i).getId().equals(id)) {
                registeringRace = races.get(i);
                break;
            }

        }
        return registeringRace;
    }

    public static boolean raceIdRepeat(String id){
        boolean isRepeat = false;
        if(races.size() != 0){
            for (int j = 0; j < races.size() && !isRepeat; j++) {
                if (id.equalsIgnoreCase(races.get(j).getId())) {
                    isRepeat = true;
                }
            }
        }
        return isRepeat;
    }

}
