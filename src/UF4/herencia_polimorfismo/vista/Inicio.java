package UF4.herencia_polimorfismo.vista;

import UF4.herencia_polimorfismo.modelo.Cliente;
import UF4.herencia_polimorfismo.modelo.Empleado;
import UF4.herencia_polimorfismo.modelo.Persona;

import java.util.ArrayList;

public class Inicio {
    public static void main(String[] args) {
        // herencia-> todo lo que puede ser comun entre varias clases
        Persona persona1 = new Persona("frank");
        Empleado emp1 = new Empleado("frank",89);
        Empleado emp2 = new Empleado("luisa", "sd",'F',23,1,2333.200);
        Cliente cli1 = new Cliente("tomas","rosas",'F',32,01,true);

        // mostrara el nuevo to string generado en persona
        //System.out.println(emp1.toString());
        //new = objetos diferentes , pero el contenido puede ser el mismo
        // equals compara la direccion
        //emp1.equals(emp2);
        //new String("luis").equals(new String("luis"));

        //polimorfismo -> es la manera de acceder a la informacionc se pierde rigides en el tipado de java,
        //Persona per1 = emp1; // per1 apunta a la misma direccion de emp1
        //System.out.println(emp1);

        var personas = new ArrayList<Persona>();
        personas.add(emp1);
        personas.add(cli1);

        // desde el que se heredan los datos , no se puede ver los datos independinetes de los hijos
        //System.out.println(personas.get(0).getNombre());
        //System.out.println(personas.get(0).getEdad());

        Object ob1 = emp1;

        // averiguar si es un empleado o cliente recorriendo el array persona
        for(Persona p :personas){
            if(p instanceof  Empleado){
                Empleado e = (Empleado) p;
                System.out.println("Empleado: " + e);
            }
            // intan
            if (p instanceof Cliente) {
                Cliente c = (Cliente) p;
                System.out.println("Cliente: " + c);
            }
        }
        //METODO EQUALS ( comparar valor de atletas con equals)
        Empleado emp3 = new Empleado("frank",49);
        Empleado emp4 = new Empleado("frank",49);
        //emp3.equals(emp4);

        System.out.println(emp3.equals(emp4));

        // protected permite accedera los datos del padre
        // comparar con metodo equals sobreescrito la comparacion entre nombre y id


        //
/*        String nombrep = "frank";
        int f= 23;
        boolean rep = false;
        personas.add(persona1);

        for(int i = 0; i < personas.size() ; i++){
            if(personas.get(i) instanceof Empleado){
                Empleado e = (Empleado) personas.get(i);
                if( e.devolverNombre().equals(nombrep)){
                    rep = true;
                }

            }
        }
        System.out.println("esta repetido ? "+ rep);
        System.out.println(personas.contains(new Empleado("frank", 45)));*/

    }
}
