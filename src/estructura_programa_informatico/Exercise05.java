
package estructura_programa_informatico;

public class Exercise05 {

    public static void main(String[] args) {
        
        int note1 = (int) (Math.random()*11);
        int note2 = (int) (Math.random()*11);
        int note3 = (int) (Math.random()*11);
        int note4 = (int) (Math.random()*11);
        int note5 = (int) (Math.random()*11);
        int note6 = (int) (Math.random()*11);
        int note7 = (int) (Math.random()*11);
        int note8 = (int) (Math.random()*11);
        int note9 = (int) (Math.random()*11); // sum =+ qual10
        int note10 = (int) (Math.random()*11);
        
        System.out.println("Notes:\n"+note1);
        System.out.println(note2);
        System.out.println(note3);
        System.out.println(note4);
        System.out.println(note5);
        System.out.println(note6);
        System.out.println(note7);
        System.out.println(note8);
        System.out.println(note9);
        System.out.println(note10);
        
        //resultado de todas las notas
        int note_totel = note1 + note2 + note3 + note4 + note5 + note6 + note7+ note8 + note9 + note10;
        int note_medium = note_totel / 10;
        System.out.println("Medium Note:"+note_medium); // avarage = (sum)/10    avarage= >= 5.0
        
        //bucle para comparar el resultado de la nota total con la media para pasar
        if (note_medium >= 5){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
    }
    
 }
}
