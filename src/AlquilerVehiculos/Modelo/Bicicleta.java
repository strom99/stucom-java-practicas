package AlquilerVehiculos.Modelo;

public class Bicicleta extends Vehiculo{
    protected boolean electric;

    public Bicicleta(String matricula,String fabricante, String color ,boolean electric) {
        super(matricula, fabricante, color);
        this.electric = electric;
    }

    @Override
    public double calcularAlquiler(int dias) {
        /*En el caso de las bicicletas se les suma un extra de 10€ independientemente de los
        números de días. En el caso de las bicicletas eléctricas este extra es de 15€,*/
        double valor = electric? 15 : 10;
        return super.calcularAlquiler(dias) + valor;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    @Override
    public String toString() {
        return "BICICLETA: " + super.toString() + (electric?" - Eléctrica":"");
    }

}
