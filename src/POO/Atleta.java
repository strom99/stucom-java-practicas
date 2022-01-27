package POO;

public class Atleta {
    // ponerlo en private
     int dorsal;
     int edad;
    String nombre;
    char genero;

    // constructor
    public Atleta(int edad, String nombre, char genero){
        //private - modificador de acceeso
    }

    public Atleta(int edad ,int dorsal, String nombre , char genero){
        this.dorsal = dorsal;
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
    }

    // dar vida al objeto
    public Atleta(int edad ,int dorsal, String nombre){
        this.dorsal = dorsal;
        this.edad = edad;
        this.nombre = nombre;
    }
}
