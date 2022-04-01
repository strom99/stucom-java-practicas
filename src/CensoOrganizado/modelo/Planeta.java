package CensoOrganizado.modelo;

import java.util.ArrayList;
import java.util.List;

public class Planeta {

    private String nombre;
    private String galaxia;
    public List<Especie> poblacion = new ArrayList<>();
    private String clima;
    private boolean flora_roja;
    private boolean seres_acuaticos;

    public Planeta(String nombre){
        this.nombre = nombre;
    }

    public Planeta(String nombre, String galaxia, String clima, boolean flora_roja, boolean seres_acuaticos) {
        this.nombre = nombre;
        this.galaxia=galaxia;
        this.clima = clima;
        this.flora_roja=flora_roja;
        this.seres_acuaticos =seres_acuaticos;
    }


    public String getNombre () {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGalaxia() {
        return galaxia;
    }

    public void setGalaxia(String galaxia) {
        this.galaxia = galaxia;
    }

    public List<Especie> getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(List<Especie> poblacion) {
        this.poblacion = poblacion;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public boolean isFlora_roja() {
        return flora_roja;
    }

    public void setFlora_roja(boolean flora_roja) {
        this.flora_roja = flora_roja;
    }

    public boolean isSeres_acuaticos() {
        return seres_acuaticos;
    }

    public void setSeres_acuaticos(boolean seres_acuaticos) {
        this.seres_acuaticos = seres_acuaticos;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Planeta other = (Planeta) obj;

        return this.getNombre().equalsIgnoreCase(other.getNombre());
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", galaxia='" + galaxia + '\'' +
                ", poblacion=" + poblacion +
                ", clima='" + clima + '\'' +
                ", flora_roja=" + flora_roja +
                ", seres_acuaticos=" + seres_acuaticos +
                '}';
    }
}
