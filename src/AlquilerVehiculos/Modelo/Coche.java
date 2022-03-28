package AlquilerVehiculos.Modelo;

public class Coche extends Vehiculo{
    private int plazas;
    private final double BASE_COCHE = 1.5;

    public Coche(int plazas, String matricula, String fabricante, String color) {
        super(matricula, fabricante, color);
        this.plazas = plazas;
    }

    @Override
    public double calcularAlquiler(int dias) {
        return super.calcularAlquiler(dias) + (plazas * BASE_COCHE * dias);
    }

    @Override
    public String toString() {
        return "COCHE: " + super.toString() + " - Plazas: " + plazas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
}
