
package examen;

public class Exercise04 {

    public static void main(String[] args) {
        int numAle = (int)((Math.random()* 99999 - 10000)) + 10000;
        int primerNum = numAle / 10000;
        int segunNum = (numAle / 1000)% 10;
        int tercerNum = (numAle / 100)% 10;
        int cuartNum = (numAle / 10)%10;
        int quintNum = numAle %10;
        System.out.println(quintNum);
        
        
        
        System.out.println("El numero generado es : "+numAle);
        System.out.println("decimo de mil :"+ primerNum);
        System.out.println("unidad de mil :"+ segunNum);
        System.out.println("cien :"+tercerNum);
        System.out.println("diez :"+ cuartNum);
        System.out.println("uno :"+ quintNum);

    }
    
}
