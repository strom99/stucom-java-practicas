package CensoOrganizado.modelo;

public class Klingoniano extends Especie {
    //son excelentes guerreros y les gusta evaluar su nivel de fuerza.
    private int nivelFuerza ;

    public Klingoniano(String nombre){
        super(nombre);
    }
    public Klingoniano(String nombre , int nivelFuerza){
        super(nombre , 3);
        this.nivelFuerza = nivelFuerza;
    }

    public int getNivelFuerza() {
        return nivelFuerza;
    }

    public void setNivelFuerza(int nivelFuerza) {
        this.nivelFuerza = nivelFuerza;
    }

    @Override
    public String toString() {
        return "Klingoniano{" +
                "nombre = "+ getNombre()+
                ", nivelCivilizacion=" + nivelCivilizacion +
                ", nivelFuerza=" + nivelFuerza +
                '}';
    }
}
