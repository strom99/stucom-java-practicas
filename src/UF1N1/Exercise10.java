
package UF1N1;

public class Exercise10 {
    public static void main(String[] args){
        //Variable de numeros aleatorios entre 100 y 999
        int numAle = (int) (Math.random()* 900 + 100);
        System.out.println("number: "+ numAle);
        
        //Cifras separadas del numero aleatorio
        int centenas = numAle / 10;
        System.out.println(centenas);
        int decenas = (numAle % 100) /10;
        System.out.println(decenas);

        int unidad = (numAle % 10);
        System.out.println(unidad);

        
        System.out.println("primera cifra: "+centenas);
        System.out.println("segunda cifra: "+decenas);
        System.out.println("tercera cifra: "+unidad);
    }
    
}
