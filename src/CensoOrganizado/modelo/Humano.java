package CensoOrganizado.modelo;

public class Humano extends Especie {
    // os humanos regulan muchos factores de su vida en las vueltas que da su
    //planeta entorno a su estrella principal (el Sol)
    private int edad;
    private char genero;

    public Humano(String nombre){
        super(nombre);
    }
    public Humano(String nombre , int edad ,char genero){
        super(nombre, 1);
        this.edad = edad;
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public static int correctaEdad(int edad){
        if(edad < 0 || edad > 130){
            System.out.println("la edad es incorrecta");
        }
        return edad;
    }
    @Override
    public String toString() {
        return "Humano{" +
                "nombre= "+ getNombre()+
                ", nivelCivilizacion=" + nivelCivilizacion +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }
}
