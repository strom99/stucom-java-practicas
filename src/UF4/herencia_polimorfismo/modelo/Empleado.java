package UF4.herencia_polimorfismo.modelo;

import java.util.Objects;

public class Empleado extends Persona {
    // variables de instancia, cuando ya no sigamos heredando ponemos private en las variables de iniciacion
    protected  int idEmpleado;
    protected  double sueldo;

    public Empleado(String nombre, String direccion , char genero , int edad ,int idEmpleado ,double sueldo){
        // invocamos las variables del constructor persona
        super(nombre, direccion, genero, edad);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    // constructor solo el sueldo de empleado
    public Empleado(String nombre , double sueldo){
        super(nombre);
        this.sueldo = sueldo;
    }

    // siempre se llama al padre del que se hereda con el super() , ya que siempre se hereda la persona aunque no se la ponga

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String devolverNombre(){
        return nombre;
    }

    // protected -> puedo llamar desde la clase hijo el valor de un padre , por ser herencia sin getter
    // @override sobreescribe el metodo que ya existe en el objeto padre , lo sobreescribe en el hijo , pero con un bloque diferente
    // el super to string te muestra la direccion

    public String toString(){
        return "nombre: " + nombre + " edad: " + edad + " idEmpleado:  "+ idEmpleado + " sueldo: "+ sueldo + "  "+ super.toString();
    }

    // sobreescribe el método equals para comparar diferentes valores y no el objeto completo (Todas las propiedades iguales)
    /*    @Override
    public boolean equals(Object o) {
        if (o instanceof Empleado) {
            if (this.nombre == ((Empleado) o).nombre) {
                return true;
            };
        }
        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if(getClass() != o.getClass())
            return false;
        final Empleado other = (Empleado) o;
        if(this.idEmpleado != other.idEmpleado){
            return false;
        }
        return true;
    }

}
