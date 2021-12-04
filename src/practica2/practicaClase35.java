
package practica2;

import java.util.Scanner;

public class practicaClase35 {

    /**
     * Demanar 10 números Mostrar la mitjana dels números positius, la mitjana dels números negatius i
    la quantitat de zeros.
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int numero, contPositivo,contNegativo, contZero,sumaPos, sumaNeg, contcero, contTotal;
        boolean salida = true;
        contPositivo = 0;
        contNegativo = 0 ;
        contZero = 0;
        sumaPos = 0 ;
        sumaNeg = 0;
        contcero = 0;
        
        
        contTotal = 0;
        
        System.out.println("Introduce 10 numeros :");
        
        while(salida){
 
            numero = sc.nextInt();
            contTotal++;
            
                if( numero > 0 ){
                    contPositivo++;
                    sumaPos += numero;
                    
                }
                if (numero < 0 ){
                    contNegativo++;
                    sumaNeg += numero;
                          
                }
                if(numero == 0 ){
                    contcero++;    
                }
            
                if(contTotal ==10){
                    
                    if (contPositivo != 0){
                        System.out.println("Total numeros positivos : " + contPositivo);
                        System.out.println("Suma total positivos : " + sumaPos);
                        System.out.println("media :"+ (sumaPos / contPositivo));
                    }
                    if ( contNegativo != 0){
                        System.out.println("\n------");
                        System.out.println("Total numeros negativos" + contNegativo);
                        System.out.println("Suma total negativos : " + sumaNeg);
                        System.out.println("media :"+ (sumaNeg / contNegativo));
                    }
                    
                    if(contcero != 0){
                        System.out.println("\n------");
                        System.out.println("total ceros: "+ contcero);
                    }
                    
                    salida = false;
                }
        }
        
    }
    
}
