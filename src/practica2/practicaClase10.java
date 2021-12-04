
package practica2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class practicaClase10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int a ,b ,c;
        
        System.out.println("Introduce 3 números.");
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println("Números ordenados");
        
        Integer[] numeros = {a, b, c};
        
        Arrays.sort(numeros, Collections.reverseOrder());
        
        System.out.println(Arrays.toString(numeros));
        
        
    }
    
}
