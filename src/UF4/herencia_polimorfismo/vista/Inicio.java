package UF4.herencia_polimorfismo.vista;

import UF4.herencia_polimorfismo.modelo.Cliente;
import UF4.herencia_polimorfismo.modelo.Empleado;
import UF4.herencia_polimorfismo.modelo.Persona;

public class Inicio {
    public static void main(String[] args) {
        // herencia->  y polimorfismo ->
        Persona persona1 = new Persona("maria");
        Empleado emp1 = new Empleado("frank",89);
        Empleado emp2 = new Empleado("luisa", "sd",'F',23,1,2333.200);
        Cliente cli1 = new Cliente("tomas","rosas",'F',32,01,true);

        // mostrara el nuevo to string generado en persona
        System.out.println(emp1.toString());

    }
}
