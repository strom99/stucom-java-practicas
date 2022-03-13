package Modulo2.Controller;

import Modulo2.Model.Athlete;
import Modulo2.Model.Race;

import java.io.File;
import java.io.FileWriter;

public class FileController {
    //aqui ubicamos los ficheros que guardaran la informacion de athletas
    public static void  writeAthlete(){
        //
        try {
            // establecemos el nombre del archivo que va a crear y la ruta donde se creara , como no especifico, se crea en raiz
            File files = new File("Athletes.txt");
            // comprueba que el ficehro exista
            if (!files.exists()){
                System.out.println("creating Athletes.txt .....");
                // creamos el fichero athletes.txt
                files.createNewFile();
            }

            // verificamos si tiene permisos de escritura
            if(files.canWrite()){
                // creamos un objeto de tipo FileWriter que nos permite escribir en el fichero
                FileWriter newfile = new FileWriter(files, false);
                for(Athlete athlete : AthleteController.getAthletes()){
                    newfile.write(athlete.getNif() + "\t\t"+ athlete.getBib()+ "\t\t"+ athlete.getName()+ "\t\t" + athlete.getAge() + "\t\t"+ athlete.getGender()+ "\t\t"+athlete.isSenior());
                    for(Race races : athlete.getAthletesRace()){
                        newfile.write("\t\t"+ races.getId());
                    }
                    // escribe sobre el archivo
                    newfile.write("\n");
                }
                // cierra el file
                newfile.close();

            }else{
                System.out.println("cannot acces to write...");
            }
        }catch (java.io.IOException e){
            System.out.println("unable to save athletes.txt");
        }
    }

    // aqui ubicamos los ficheros que guardaran la informacion de las carreras
    public static void writeRace() {
        try {
            File files = new File("Races.txt");
            if (!files.exists()){
                System.out.println("creating Races.txt .....");
                files.createNewFile();
            }

            if(files.canWrite()){
                FileWriter newfile = new FileWriter(files, false);
                for(Race race : RaceController.races){
                    newfile.write(race.getId() + "\t\t"+ race.getLocalidad()+ "\t\t"+ race.getKilometros()+ "\t\t" + race.getFechaHoraRegistro());
                    for(Athlete athlete : race.getParticipantes()){
                        newfile.write("\t\t"+ athlete.getNif());
                    }
                    newfile.write("\n");
                }
                newfile.close();

            }else{
                System.out.println("cannot acces to write...");
            }
        }catch (java.io.IOException e){
            System.out.println("unable to save athletes.txt");
        }
    }
}
