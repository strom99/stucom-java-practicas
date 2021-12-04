
package practica2;

public class practicaClase22 {

    public static void main(String[] args) {
        double i, j, d;
        i=5; 
        j=10;
        if(i !=0 ){
        System.out.println("i does not equal zero");
        d=j/i;
        System.out.print("j / i is " +d);
        double f = d;
        System.out.println(f);
        }
        // el error era que se estaba imprimiendo fuera la variable f, que habia sido declarada dentro de un condicional
    }
    
}
