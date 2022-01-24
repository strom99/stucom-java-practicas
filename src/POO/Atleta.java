package POO;

public class Atleta {
    int dorsal, edad;
    String nombre;
    char genero;

    // constructor
    public Atleta(int edad, String nombre, char genero){

    }

    public Atleta(int edad ,int dorsal, String nombre , char genero){
        this.dorsal = dorsal;
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
    }
}
