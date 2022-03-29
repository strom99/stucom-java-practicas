package CensoOrganizado.modelo;

public class Ferengianos extends Especies {
    // su principal característica es el afán de riqueza y se guían por las Reglas de
    //Adquisición (“Un Ferengi sin riqueza no es un Ferengi”, entre otras…). Atesoran el Latinum.
    private int oro;

    public Ferengianos(String nombre) {
        super(nombre, 1);
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }
}
