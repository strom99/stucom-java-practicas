package sistemaSolar;

public class Planeta {
    int numIdentificador;
    String nombre;
    int masa;
    int densidad;
    int diametro;
    int distanciaSol;

    // metodo constructor
    public Planeta(int numIdentificador , String nombre ){

    }

    //constructor que inicializa las variables de instancias
    public Planeta(int numIdentificador , String nombre , int masa , int densidad , int diametro , int distanciaSol){
        this.numIdentificador = numIdentificador;
        this.nombre = nombre;
        this.masa = masa;
        this.densidad = densidad;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
    }

    //constructor inicializado
    public Planeta(int distanciaSol , int masa){

    }

}
