package Exepciones;

import java.io.InterruptedIOException;

public class ejercicio01checked {
    public static void exception() throws InterruptedIOException {
        if(1 == 1){
            System.out.println("Ahora lanzaremos una excepcion");
            throw new InterruptedIOException();
        }
    }
    // si se quisiera que se pete , se le envia al main --->  throws InterruptedIOException , sino , poner el try/ cath en el main
    public static void main(String[] args){
        try {
            exception();
        }catch (InterruptedIOException e){
            
        }
    }
}
