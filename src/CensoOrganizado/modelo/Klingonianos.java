package CensoOrganizado.modelo;

public class Klingonianos extends Especies {
    //son excelentes guerreros y les gusta evaluar su nivel de fuerza.
    private int nivelFuerza ;

    public Klingonianos(String nombre){
        super(nombre , 3);
    }

    public int getNivelFuerza() {
        return nivelFuerza;
    }

    public void setNivelFuerza(int nivelFuerza) {
        this.nivelFuerza = nivelFuerza;
    }
}
