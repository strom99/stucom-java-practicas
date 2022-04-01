package CensoOrganizado.modelo;

public class Especie {

    private String nombre;
    public int nivelCivilizacion;
    // agregacion planeta

    public Especie(String nombre){
        this.nombre = nombre;
    }
    public Especie(String nombre, int nivelCivilizacion) {
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        // obj instance especies(obj) == null) ||getClass != obj.getclass() ----------error
        // !(instance of especies)
        if (this == obj|| !(obj instanceof Especie)) {
            return false;
        }
        final Especie other = (Especie) obj;

        return this.getNombre().equalsIgnoreCase(other.getNombre());
    }

    @Override
    public String toString() {
        return "Especie{" +
                "nombre='" + nombre + '\'' +
                ", nivelCivilizacion=" + nivelCivilizacion +
                '}';
    }
}
