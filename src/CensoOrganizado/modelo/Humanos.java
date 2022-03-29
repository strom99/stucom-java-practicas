package CensoOrganizado.modelo;

public class Humanos extends Especies {
    // os humanos regulan muchos factores de su vida en las vueltas que da su
    //planeta entorno a su estrella principal (el Sol)
    private int edad;
    private String genero;

    public Humanos(String nombre , int edad){
        super(nombre, 1);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
