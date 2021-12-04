
package practica2;

import java.util.Scanner;

public class practicaClase20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entre 0 y 10");
        int nota = sc.nextInt();
        String notaLiteral = "";
        
        if(nota >= 0 && nota <= 10){
            switch(nota){
                case 0 :
                    notaLiteral = "cero";
                    break;
                case 1 :
                    notaLiteral = "uno";
                    break;
                case 2 :
                    notaLiteral = "dos";
                    break;
                case 3 :
                    notaLiteral = "tres";
                    break;
                case 4 :
                    notaLiteral = "cuatro";
                    break;
                case 5 :
                    notaLiteral = "cinco";
                    break;
                case 6 :
                    notaLiteral = "seis";
                    break;
                case 7 :
                    notaLiteral = "siete";
                    break;
                case 8 :
                    notaLiteral = "ocho";
                    break;
                case 9 :
                    notaLiteral = "nueve";
                    break;
                case 10 :
                    notaLiteral = "diez";
                    break;
            }
            System.out.println("La nota introducida es : "+ notaLiteral);
        }else{
            System.out.println("El numero introducido es incorrecto, vuelve a intentarlo");
            
        }
        
        
    }
    
}
