
package aula;

public class java01 {

    public static void main(String[] args) {
        
        /*
        for (int j = 0 ; j < 10 ;j++){
            int x = 20;
            System.out.println(x);
            x++;
        }
        */
        int x = 20;
        int [] arrayEjemplo = new int [10];
                
 
        
        /*for (int j = 0 ; j < 10 ;j++){
            System.out.println(x);
            x++;
        }
        */
        /*for(char a ='A'; 'A '<= a && a <='Z'; a++){
            System.out.println(a);
        }*/
        //rellenamos
        
        for (int i = 0; i < arrayEjemplo.length; i++){
            int nota = (int)(Math.random()*11);
            arrayEjemplo[i] = nota;
            System.out.println(nota);
            
        }
        
        //operamos
       double average = 0;
        for (int i = 0; i < arrayEjemplo.length; i++){
            average = average + arrayEjemplo[i];
           
        }
        System.out.println("avarage = " + average / arrayEjemplo.length);
        
        /*double average = 0;
        for (int i = arrayEjemplo.length -1; i >= 0; i--){
            average = average + arrayEjemplo[i];
           
        }*/
        // foreach       derecha a izquierda java
        for(int aux :arrayEjemplo){
            average += aux;
        }
        
}
}