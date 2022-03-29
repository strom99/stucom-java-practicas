package CensoOrganizado.modelo;

import UF4.herencia_polimorfismo.modelo.Empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Planetas {

    private String nombre;
    private String galaxia;
    public List<Especies> poblacion = new ArrayList<>();
    private String clima;
    private boolean flora_roja;
    private boolean seres_acuaticos;

    public Planetas(){
    }

    public Planetas(String nombre, String galaxia, String clima, boolean flora_roja, boolean seres_acuaticos) {
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

    public List<Especies> getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(List<Especies> poblacion) {
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
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            System.out.println("diferentes especies");
            return false;
        }
        Planetas planetas = (Planetas) o;
        return nombre.equalsIgnoreCase(planetas.nombre);
    }

}
