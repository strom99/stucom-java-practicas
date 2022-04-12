package CensoOrganizado.Model;

import java.util.ArrayList;
import java.util.List;

public class Planet {

    private String name;
    private String galaxy;
    public List<Race> poblation = new ArrayList<>();
    private String climate;
    private boolean redFlora;
    private boolean aquaticsBeings;

    //this constructor is used to compare a planet name (new planet)
    public Planet(String name){
        this.name = name;
    }

    public Planet(String name, String galaxy, String clima, boolean flora_roja, boolean seres_acuaticos) {
        this.name = name;
        this.galaxy=galaxy;
        this.climate = clima;
        this.redFlora=flora_roja;
        this.aquaticsBeings =seres_acuaticos;
    }


    public String getName () {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGalaxy() {
        return galaxy;
    }

    public void setGalaxy(String galaxy) {
        this.galaxy = galaxy;
    }

    public List<Race> getPoblation() {
        return poblation;
    }

    public void setPoblation(List<Race> poblation) {
        this.poblation = poblation;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public boolean isRedFlora() {
        return redFlora;
    }

    public void setRedFlora(boolean redFlora) {
        this.redFlora = redFlora;
    }

    public boolean isAquaticsBeings() {
        return aquaticsBeings;
    }

    public void setAquaticsBeings(boolean aquaticsBeings) {
        this.aquaticsBeings = aquaticsBeings;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Planet other = (Planet) obj;

        return this.getName().equalsIgnoreCase(other.getName());
    }

    @Override
    public String toString() {
        return "Planet : "+ name + "\n" +
                "[galaxy: '" + galaxy + '\'' +
                " - poblation: " + poblation +
                " - climate: '" + climate + '\'' +
                " - Red flora: " + redFlora +
                " -  Aquatics Beings: " + aquaticsBeings +
                ']';
    }
}
