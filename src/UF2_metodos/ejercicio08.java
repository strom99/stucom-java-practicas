package UF2_metodos;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio08 {
    /* 7,8,9,10,13,18,21,22,23,24,25,29,33
        Ideamos que devuelva una tabla con el área y el volumen.
        tabla == vector;
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double []vector;
        double radio , altura ;

        System.out.println("Ingresa el radio y el volumen , para calcular tu area y volumen");
        System.out.println("Ingresa el radio : ");
        radio = sc.nextDouble();
        System.out.println("Ingresa la altura :");
        altura = sc.nextDouble();

        vector = tabla(radio , altura);
        System.out.println(Arrays.toString(vector));
    }

    public static double []tabla(double radio , double altura){

        double []vector = new double[2];
        double area , volumen;
        area = 2 * Math.PI * radio * (radio + altura);
        volumen = Math.PI * altura * (radio * radio) ;

        vector[0]= area;
        vector[1] = volumen;

        return(vector);

    }
}
