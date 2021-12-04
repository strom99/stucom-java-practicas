
package UF1N1;

public class Exercise06 {

    public static void main(String[] args) {
        //Variables numeros aleatorios
        int hour = (int)(Math.random()* 24);
        int minuts = (int)(Math.random()* 60);
        int seconds = (int)(Math.random()* 60);
        
        System.out.println("hour = "+hour +"\n minuts = "+ minuts +" \n seconds =  "+ seconds);
        
        //Transformacion a segundos
        int totalSeconds = (hour * 3600)+(minuts*60)+ seconds;
        System.out.println("The generated time is: "+hour+ ":"+minuts+":"+seconds+" corresponding to "+ totalSeconds+"seconds.");
        
        //
    }
    
}
