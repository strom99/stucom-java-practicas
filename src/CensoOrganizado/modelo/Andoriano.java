package CensoOrganizado.modelo;

public class Andoriano extends Especie {
    // son guerreros y fervientes defensores de su familia
    private String rango;
    //Algunos andorianos habitan bajo el hielo de los polos.(aenar)
    private boolean Aenar;

    public Andoriano(String nombre , String rango , boolean aenar){
        super(nombre, 2);
        this.rango = rango;
        this.Aenar = aenar;
    }
    public Andoriano(String nombre){
        super(nombre , 2);
    }

    public String getRango() {
        return rango;
    }
    public void setRango(String rango) {
        this.rango = rango;
    }

    public boolean isAenar() {
        return Aenar;
    }

    public void setAenar(boolean aenar) {
        Aenar = aenar;
    }

    @Override
    public String toString() {
        return "Andoriano{" +
                "nombre = "+ getNombre()+
                ", rango='" + rango + '\'' +
                ", Aenar=" + Aenar +
                ", nivelCivilizacion=" + nivelCivilizacion +
                '}';
    }
}
