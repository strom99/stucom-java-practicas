package UF4.herencia_polimorfismo.modelo;

public class Empleado extends Persona {
    // variables de instancia, cuando ya no sigamos heredando ponemos private en las variables de iniciacion
    int idEmpleado;
    double sueldo;

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

    // protected -> puedo llamar desde la clase hijo el valor de un padre , por ser hrencia sin getter

}
