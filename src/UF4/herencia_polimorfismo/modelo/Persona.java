package UF4.herencia_polimorfismo.modelo;

public class Persona extends Object {
    // variables de instancia comunes para empleados y clientes
    protected String nombre;
    protected String direccion;
    protected char genero;
    protected int edad;

    //constructor todos los datos
    public Persona(String nombre, String direccion, char genero, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.genero = genero;
        this.edad = edad;
    }

    //constructor datos de un solo valor
    public Persona(String nombre){
        this.nombre = nombre;

    }

    // getter  y setters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", genero=" + genero +
                ", edad=" + edad;
    }
// super.toString te trae las cosas  heredadas de un padre
    /*public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("persona{nombre : ").append(nombre);
        return sb.toString();
    }*/

}
