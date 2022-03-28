package AlquilerVehiculos.Modelo;

public class Moto extends Vehiculo {
    private int cilindrada;
    private final double BASE_MOTO = 0.05;

    public Moto(int cilindrada, String matricula, String fabricante, String color) {
        super(matricula, fabricante, color);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularAlquiler(int dias) {
        /*En el caso del alquiler de motos, al precio base se le suma un 5% de la cilindrada de
        la moto por día, ya que las motos de mayor cilindrada tienen un seguro más caro. La
        cilindrada de la moto se registra en cc.*/
        return super.calcularAlquiler(dias) + (cilindrada * BASE_MOTO * dias);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "MOTO: " + super.toString() + " - Cilindrada: " + cilindrada;
    }
}
