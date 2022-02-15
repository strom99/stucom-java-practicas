package sistemaSolar;

public class Planeta {
    int numIdentificador;
    String nombre;
    int masa;
    int densidad;
    int diametro;
    int distanciaSol;

    // metodo constructor
    public Planeta(String nombre ){

    }

    //constructor que inicializa las variables de instancias
   //objeto de cada planeta
    public Planeta(int numIdentificador , String nombre , int masa , int densidad , int diametro , int distanciaSol){
        this.numIdentificador = numIdentificador;
        this.nombre = nombre;
        this.masa = masa;
        this.densidad = densidad;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
    }

    public Planeta( String nombre , int masa , int densidad , int diametro , int distanciaSol){
        //concatena el numiden de otro constructor
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
