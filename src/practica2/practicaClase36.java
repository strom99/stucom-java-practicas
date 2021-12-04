
package practica2;

import java.util.Scanner;

public class practicaClase36 {

    /**
     *  Demanar 10 sous, Mostrar la seva suma i quants hi ha majors de 1000€.
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int salario , sumaSalario , Comparacion1000;
        sumaSalario = 0;
        Comparacion1000 = 0;
        
        System.out.println("Introduce 10 salarios:");
        
        for(int i = 1 ; i <= 10 ; i++){
            
            salario = sc.nextInt();
            
            if ( salario > 1000){
                Comparacion1000++;
            }
            
            
            sumaSalario = sumaSalario + salario; 
        }
        
        System.out.println("hay mayor que 1000 : "+ Comparacion1000+" sueldos");
        System.out.println("La suma de los 10 sueldos introducidos es  : "+ sumaSalario+" euros");
    }
    
}
