package pruebasJava;

public class ejercicio05 {
    /**
     *Un número se dice que es perfecto si la suma de sus divisores excepto él mismo es igual a dicho
     número. Ejemplo: 6 es un número perfecto ya que sus divisores: 1 + 2 + 3 suman seis. Haz un
     programa que muestre los 3 primeros números perfectos.
     */
    public static void main(String[] args) {
        int i = 1 ;
        int suma = 0;
        int contadorNumerosPerfectos = 0;
        boolean salida = true;

        // usamos un bucle while para imprimir los numeros a analisar si son perfectos, incrementandolos siempre en uno
        while(salida){
            i++;
            // para reiniciar el valor a cero, para calcular otro numero
            suma = 0;

            //y otro bucle para calcular el primer numero con todos los divisores posibles
            // se pone que j sea menor a i para que el divisor j no llegue a contar el ultimo valor, ya que este no se cuenta
            for(int j = 1 ; j < i ; j++){

                //calculamos si es un divisor del numeroperfecto
                if(i % j == 0){
                    // sumamos los numeros divisores
                    suma = suma + j ;
                }
            }
            // comparamos si la suma acumulada es igual al primer numero a calcular, si es igual la suma de sus divisores , es perfecto
            if(suma == i){
                System.out.println("es perfecto : "+ i);
                contadorNumerosPerfectos++;
            }
            //calcular cuando tengamos los cuatro primeros numeros perfectos para salir
            if(contadorNumerosPerfectos == 4){
                salida= false;
            }

        }
    }
}
