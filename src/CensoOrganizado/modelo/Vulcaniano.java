package CensoOrganizado.modelo;

public class Vulcaniano extends Especie {
    //  es una especie que basa su estilo de vida en la razón y la lógica
    private int nivelMeditacion;

    public Vulcaniano(String nombre){
        super(nombre, 3);
    }
    public Vulcaniano(String nombre , int nivelMeditacion){
        super(nombre, 3);
        this.nivelMeditacion = nivelMeditacion;
    }

    public int getNivelMeditacion() {
        return nivelMeditacion;
    }

    public void setNivelMeditacion(int nivelMeditacion) {
        this.nivelMeditacion = nivelMeditacion;
    }

    @Override
    public String toString() {
        return "Vulcaniano{" +
                "nombre = "+ getNombre()+
                ", nivelCivilizacion=" + nivelCivilizacion +
                ", nivelMeditacion=" + nivelMeditacion +
                '}';
    }
}
