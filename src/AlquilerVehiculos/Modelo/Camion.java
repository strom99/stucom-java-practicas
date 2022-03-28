package AlquilerVehiculos.Modelo;

public class Camion extends Vehiculo {
    // base camion variable
    protected int pma;
    private final int base_camion = 20;


    public Camion(int pma, String matricula, String fabricante, String color) {
        super(matricula, fabricante, color);
        this.pma = pma;
    }

    @Override
    public double calcularAlquiler(int dias) {
        return super.calcularAlquiler(dias) + ( base_camion * pma);
    }

    public int getPma() {
        return pma;
    }

    public void setPma(int pma) {
        this.pma = pma;
    }

    @Override
    public String toString() {
        return "CAMION: " + super.toString() + " - PMA: " + pma;
    }

}
