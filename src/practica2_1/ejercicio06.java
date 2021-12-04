
package practica2_1;

public class ejercicio06 {

    /**
     * Crea un programa que tenga definida una variable count iniciada a 10 (la podéis
        hacer variar), Ahora genera un programa que muestre tantos números como la
        variable count de la secuencia de Fibonacci (investiga un poco cómo funciona
        esta secuencia).
     */
    public static void main(String[] args) {
        
        // variables iniciales de la secuencia fibonacci
        int numero1 = 1;
        int numero2 = 1;
        // la variable vacia que servira para intercambiar valores
        int numeroV = 0;
        // el numero de veces que se repetira
        int count = 10;
        // contador de cada iteraccion
        int contador = 0;
        // salida de bucle
        boolean salida = true;
        
        System.out.print(numero1+ " ");
        System.out.print(numero2+ " ");
        
        //bucle
        while(salida){
            
            //hago una resta inicialmente para, y solo ingresara una vez , por que el valor lo recibe desde fuera del bucle
            int re = count - 2;
            if(count == 10){
                count -=2;

            }
            // esto se repetira 
                numeroV = numero1;
                numero1 = numero2;
                numero2 = numeroV + numero1;
                contador++;
                //System.out.println("num1: "+numeroV);
                //System.out.println("num2: "+ numero1);
                System.out.print(numero2+" ");
            
            // y aqui me calculara cuando el contador sea igual al count, para salir del bucle
            if(contador == count){
                    salida = false;
                
            }
        }
        
    }
    
}
