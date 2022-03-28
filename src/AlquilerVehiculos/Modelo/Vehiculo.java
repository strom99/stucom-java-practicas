package AlquilerVehiculos.Modelo;

public class Vehiculo {
    private String matricula;
    private String fabricante;
    private String color;
    private final int BASE = 50;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public Vehiculo(String matricula, String fabricante, String color) {
        this.matricula = matricula;
        this.fabricante = fabricante;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Vehiculo) {
            Vehiculo v = (Vehiculo) o;
            return this.matricula.equalsIgnoreCase(v.getMatricula());
        }
        return false;
    }

    @Override
    public String toString() {
        return matricula + " - " + fabricante + " - " + color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcularAlquiler(int dias) {
        return BASE * dias;
    }

}
