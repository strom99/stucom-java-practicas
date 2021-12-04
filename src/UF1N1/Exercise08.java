
package UF1N1;

public class Exercise08 {

    public static void main(String[] args) {
        
        int time = (int) (Math.random() * 2000001);
        int seconds = time % 60;  //  % 3600---- %60
        int minuts = (time / 60) % 60; // % -- / 60
        int hour = (time / 60) / 60;  // /60
    
        
        String equivalentHour = hour + ":" + minuts + ":" + seconds;
       
        System.out.println("Generated time: " + time + ". The equivalent hour is: " + equivalentHour);

    }
    
}
