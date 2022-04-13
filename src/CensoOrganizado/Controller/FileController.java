package CensoOrganizado.Controller;

import CensoOrganizado.Model.*;

import java.io.File;
import java.io.FileWriter;

public class FileController {
    public static void writePlanets(){
        try {
            File files = new File("Planets.txt");
            // check if the file exists
            if (!files.exists()){
                    System.out.println("creating Planets.txt .....");
                // we create the file Planets.txt
                files.createNewFile();
            }

            // check if you have write permissions
            if(files.canWrite()){
                // we create an object of type FileWriter that allows us to write to the file
                FileWriter newfile = new FileWriter(files, false);
                for(Planet planet : ControllerPlanet.planets){
                    newfile.write(planet.getName() + "\t\t"+ planet.getGalaxy()+ "\t\t"+ planet.getClimate()+ "\t\t" + planet.isRedFlora() + "\t\t"+ planet.isAquaticsBeings()+ "\t\t"+planet.getCapacity()+"\t\t"+ "Poblacion [");

                    if(!planet.getPoblation().isEmpty()){
                        for(Race specie : planet.getPoblation()){
                            newfile.write("\t"+ specie.getName()+",");
                        }
                    }else{
                        newfile.write("0");
                    }
                    // write over file
                    newfile.write("]"+ "\n");
                }
                // close the file
                newfile.close();

            }else{
                System.out.println("cannot acces to write...");
            }
        }catch (java.io.IOException e){
            System.out.println("unable to save Planets.txt");
        }
    }

    public static void writeSpecies(){
        try {
            File files = new File("Species.txt");
            // check if the file exists
            if (!files.exists()){
                System.out.println("creating Species.txt .....");
                // we create the file Planets.txt
                files.createNewFile();
            }

            // check if you have write permissions
            if(files.canWrite()){
                // we create an object of type FileWriter that allows us to write to the file
                FileWriter newfile = new FileWriter(files, false);
                for(Race specie : ControllerRace.species){
                    newfile.write(specie.getName() + "\t\t");
                    if(specie instanceof Andorian){
                        Andorian x = ((Andorian) specie);
                        newfile.write(x.getRange() + "\t\t"+ x.isAenar());
                    }else if(specie instanceof Ferengian){
                        Ferengian x = ((Ferengian) specie);
                        newfile.write("\t\t"+ x.getLatinum());
                    }else if(specie instanceof Human){
                        Human x = ((Human) specie);
                        newfile.write(x.getAge()+"\t\t"+ x.getGender());
                    }else if(specie instanceof Klingonian){
                        Klingonian x = ((Klingonian) specie);
                        newfile.write("\t\t"+ x.getStrengthLevel());
                    }else if(specie instanceof Nibirian){
                        Nibirian x = ((Nibirian) specie);
                        newfile.write(x.isFishFeed()+ "\t\t"+ x.isRedFloraFood());
                    }else if(specie instanceof Vulcanian){
                        Vulcanian x = ((Vulcanian) specie);
                        newfile.write("\t\t"+ x.getMeditationLevel());
                    }
                    newfile.write("\t\t" + specie.getCivilizationLevel());
                    // write over file
                    newfile.write("\n");
                }
                // close the file
                newfile.close();

            }else{
                System.out.println("cannot acces to write...");
            }
        }catch (java.io.IOException e){
            System.out.println("unable to save Planets.txt");
        }
    }
}
