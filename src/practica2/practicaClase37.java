
package practica2;

import java.util.Scanner;


public class practicaClase37 {

    /**
     * Dadas las edades y alturas de 5 alumnos, mostrar la edad y la altura media, la cantidad de alumnos
    mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int edades = 0;
        int mediaEdad = 0;
        int suma = 0;
        int contador18 = 0;
        
        float alturas = 0;
        float alturaMedia = 0;
        float sumaAltura = 0;
        int contador175 = 0;
        
        
        System.out.println("introduce 5 edades :");
        
       for(int i = 1 ; i <= 5 ; i++){
           edades = sc.nextInt();
           suma += edades;
           mediaEdad = suma / 5;
           
            if(edades >= 18){
                   contador18++;   
           }
            
           }
       
        System.out.println("introduce 5 alturas : ");
       for(int e = 1 ; e <= 5 ; e++){
           alturas = sc.nextInt();
           sumaAltura += edades;
           alturaMedia = sumaAltura / 5;
           
            if(alturas > 1.75){
                   contador175++;   
           }
            
           }
       
       
      
        System.out.println("la edad media de estas edades es : "+ mediaEdad);
        System.out.println("+18 :"+ contador18);
        System.out.println("la altura media de estas medidas son : "+ alturaMedia);
        System.out.println("+175 :"+ alturaMedia);
        
}
}