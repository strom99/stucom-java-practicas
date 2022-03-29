package CensoOrganizado.modelo;

public class Especies {

    private String nombre;
    public int nivelCivilizacion;
    // agregacion planeta

    public Especies(String nombre, int nivelCivilizacion) {
        this.nombre = nombre;
        this.nivelCivilizacion = nivelCivilizacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelCivilizacion() {
        return nivelCivilizacion;
    }

    public void setNivelCivilizacion(int nivelCivilizacion) {
        this.nivelCivilizacion = nivelCivilizacion;
    }
}
