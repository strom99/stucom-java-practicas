package Cafeteria.Maquinaria;

public class Cafetera {
    private int identificador;
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera(){
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(int capacidadMaxima){
        this.cantidadActual = capacidadMaxima;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual){
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;

        if(this.cantidadActual > this.capacidadMaxima){
            this.cantidadActual = this.capacidadMaxima;
        }
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera () {
        this.cantidadActual = this.capacidadMaxima;
    }

    public void agregarCafe (int cantidad) {
        this.cantidadActual = this.cantidadActual + cantidad;
    }

    public void vaciarCafetera () {
        this.cantidadActual = 0;
    }

    public void servirTaza (int cantidad) {
        // cantidad 5
        // cliente pide cantidad 8
        if (cantidad > this.cantidadActual) {
            this.cantidadActual = 0;
        } else {
            this.cantidadActual = this.cantidadActual - cantidad;
        }
    }

}
