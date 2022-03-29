package CensoOrganizado.modelo;

public class Andorianos extends Especies {
    // son guerreros y fervientes defensores de su familia
    private String rango;
    //Algunos andorianos habitan bajo el hielo de los polos.(aenar)
    private boolean Aenar;

    public Andorianos(String nombre){
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
}
