package CensoOrganizado.modelo;

import java.util.Scanner;

public class Ferengiano extends Especie {
    // su principal característica es el afán de riqueza y se guían por las Reglas de
    //Adquisición (“Un Ferengi sin riqueza no es un Ferengi”, entre otras…). Atesoran el Latinum.
    private int oro;

    public Ferengiano(String nombre){
        super(nombre);
    }
    public Ferengiano(String nombre , int oro) {
        super(nombre, 1);
        this.oro = oro;
    }

    public int getOro() {
        return oro;
    }
    public void setOro(int oro) {
        this.oro = oro;
    }

    public static int dineroC(int dinero){
        if(dinero <= 0 ){
            System.out.println("la cantidad que quieres ingresar es baja");
        }
        return dinero;
    }
    @Override
    public String toString() {
        return "Ferengiano{" +
                "nombre= "+ getNombre()+
                ", nivelCivilizacion=" + nivelCivilizacion +
                ", oro=" + oro +
                '}';
    }
}
