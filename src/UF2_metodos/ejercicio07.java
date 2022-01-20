package UF2_metodos;

import java.util.Scanner;

public class ejercicio07 {
    /*
    Realizar una función que calcule (muestre en pantalla) el área o el volumen de un cilindro, según
    se especifique. Para distinguir un caso de otro se le pasará el carácter 'a' (para área) o 'v'
    (para el volumen). Además debemos pasarle a la función el radio y la altura.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //area  o volumen
        char dato;
        double  radio , altura;
        double area , volumen ;

        System.out.println("Que calculo deseas hacer?");
        System.out.println(" a  -- para calcular el area");
        System.out.println(" v  -- para calcular el volumen");
        dato = sc.next().charAt(0);



        if(dato == 'a'){
            System.out.println("Ingresa el radio :");
            radio = sc.nextDouble();
            System.out.println("Ingresa la altura :");
            altura = sc.nextDouble();

            area = Calculo(dato ,radio , altura);
            System.out.println(area);
        }else if (dato == 'v'){
            System.out.println("Ingresa el radio :");
            radio = sc.nextDouble();
            System.out.println("Ingresa la altura :");
            altura = sc.nextDouble();

            volumen = Calculo(dato , radio , altura);
            System.out.println(volumen);
        }


    }


    public static double Calculo(char opcion , double radio , double altura){

        double resultado =0 ;

        switch (opcion){
            case 'a' :
                resultado = 2 * Math.PI * radio * (radio + altura);
                break;
            case 'v' :
                resultado = Math.PI * altura * (radio * radio) ;
                break;
            default:
                System.out.println("nothing");
        }
        return(resultado);
    }
}
