
package practica2_1;

public class ejercicio04 {

    /**
     * Escribe el código necesario para calcular la división entre dos números enteros, utilizando el
    método de las restas sucesivas, Genera un número aleatorio entre 10 y 100 que será el dividendo
    y un número aleatorio entre 2 y 10 que será el divisor, Debes mostrarlos y mostrar el cociente y el
    resto, Ejemplo de cálculo de la división con restas sucesivas:.
     */
    public static void main(String[] args) {
        //numero aleatorio entre 100 y 10
        int dividendo = (int)(Math.random()* 91) + 10;
        //numero aleatorio entre 9 y 2, que la suma de un numero de mas (11) para que salga hasta 10
        int divisor = (int)(Math.random()* 9 )+2;
        // un contador en cero para ir sumando cada vuelta del bucle, para el valor del cociente
        int contador = 0 ;
        
        System.out.println("dividir "+ dividendo+ " entre "+ divisor+" : ");
        while(dividendo >= divisor){
            //creo una variable para darle el valor inicial de dividendo
            int dividendoOriginal = dividendo;
            // y dividendo lo voy restando con divisor, cambiando su valor en cada vuelta del bucle
            dividendo = dividendo - divisor;
            contador++;
            //Asi puedo imprimir el valor inicial , a medida que va mostrando mi resta
            // el divisor nunca cambia
            System.out.println(dividendoOriginal + " - "+ divisor + " = "+ dividendo);
        
        }
        System.out.println("divisor :"+ divisor);
        System.out.println("Numeros de restas efectuadas es igual al cociente = "+ contador);
        System.out.println("el resto de la division es = "+ dividendo);
    
}
}