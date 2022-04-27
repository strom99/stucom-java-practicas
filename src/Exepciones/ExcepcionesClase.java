package Exepciones;

public class ExcepcionesClase extends Exception {
    static int intentos;

    public ExcepcionesClase(){

    }
    public ExcepcionesClase(String message){
        super(message);
        intentos++;
    }

    public static int getIntentos() {
        return intentos;
    }

    public static void setIntentos(int intentos) {
        ExcepcionesClase.intentos = intentos;
    }
}
