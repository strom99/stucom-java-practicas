package CensoOrganizado.modelo;

public class Nibiriano extends Especie{
    // son seres espirituales y expertos conductores de naves
    private boolean alimentacionFloraRoja;
    private boolean alimentacionPeces;

    public Nibiriano(String nombre){
        super(nombre);
    }

    public Nibiriano(String nombre , boolean alimentacionFloraRoja ,boolean alimentacionPeces){
        super(nombre);
        this.alimentacionFloraRoja = alimentacionFloraRoja;
        this.alimentacionPeces = alimentacionPeces;
    }

    public boolean isAlimentacionFloraRoja() {
        return alimentacionFloraRoja;
    }

    public void setAlimentacionFloraRoja(boolean alimentacionFloraRoja) {
        this.alimentacionFloraRoja = alimentacionFloraRoja;
    }

    public boolean isAlimentacionPeces() {
        return alimentacionPeces;
    }

    public void setAlimentacionPeces(boolean alimentacionPeces) {
        this.alimentacionPeces = alimentacionPeces;
    }

    @Override
    public String toString() {
        return "Nibiriano{" +
                "nombre =" + getNombre()+
                ", alimentacionFloraRoja=" + alimentacionFloraRoja +
                ", alimentacionPeces=" + alimentacionPeces +
                '}';
    }
}
