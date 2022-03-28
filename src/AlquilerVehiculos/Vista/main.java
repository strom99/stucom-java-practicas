package AlquilerVehiculos.Vista;


import AlquilerVehiculos.Modelo.Moto;
import AlquilerVehiculos.Modelo.Vehiculo;

public class main {
    //Una empresa de alquiler de vehículos requiere una aplicación para poder gestionar su flota
    //de vehículos y facilitar el cálculo de los alquileres a sus trabajadores.

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("123","dedo","rojo");
        System.out.println(v1);
        System.out.println(v1.calcularAlquiler(2));
        Moto mot1 = new Moto(2,"3232","rec","azul");
        System.out.println(mot1);
        System.out.println(mot1.calcularAlquiler(5));
    }

}
