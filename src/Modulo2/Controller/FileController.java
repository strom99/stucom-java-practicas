package Modulo2.Controller;

import Modulo2.Model.Athlete;
import Modulo2.Model.Race;

import java.io.File;
import java.io.FileWriter;

public class FileController {
    //aqui ubicamos los ficheros que guardaran la informacion
    public static void  writeAthlete(){
        try {
            File files = new File("Athletes.txt");
            if (!files.exists()){
                System.out.println("creating Athletes.txt .....");
                files.createNewFile();
            }

            if(files.canWrite()){
                FileWriter newfile = new FileWriter(files , false);
                for(Athlete athlete : AthleteController.getAthletes()){
                    newfile.write(athlete.getNif() + "\t\t"+ athlete.getBib()+ "\t\t"+ athlete.getName()+ "\t\t" + athlete.getAge() + "\t\t"+ athlete.getGender()+ "\t\t"+athlete.isSenior());
                    for(Race races : athlete.getAthletesRace()){
                        newfile.write("\t\t"+ races.getId());
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
