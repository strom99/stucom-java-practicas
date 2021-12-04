
package practicasPersonales;

public class borradorEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i = 1 ;
        int j =0;
        int suma = 0;
        int contadorNumerosPerfectos = 0;
        boolean salida = true;
        int resto ;
        int div;
       
        // usamos un bucle while para imprimir los numeros a analisar si son perfectos, incrementandolos siempre en uno
        while(salida){
            i++;
            // para reiniciar el valor a cero, para calcular otro numero
            suma = 0;
            
            //y otro bucle para calcular el primer numero con todos los divisores posibles
            // se pone que j sea menor a i para que el divisor j no llegue a contar el ultimo valor, ya que este no se cuenta
            for(j = 1 ; j < i ; j++){
                
                resto = i % j;
                div = i / j;
                //calculamos si es un divisor del numeroperfecto
                if(resto == 0){
                    // sumamos los numeros divisores
                    suma = suma + j;
                    System.out.println("j:"+j);
                    
                }
                
                
            }
            
            // comparamos si la suma acumulada es igual al primer numero a calcular, si es igual la suma de sus divisores , es perfecto
            if(suma == i){
                System.out.println("es perfecto : "+ i);
                contadorNumerosPerfectos++;
                
            }
            //calcular cuando tengamos los cuatro primeros numeros perfectos para salir
            
            if(contadorNumerosPerfectos == 1){
                salida= false;
                
                
            }
           
        }
    }
    
}
