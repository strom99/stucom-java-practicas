package CensoOrganizado.GlobalMethods;

import java.util.Scanner;

public class Methods {
    public static int readInBetweenMinAndMax(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean exit = false;
        do {
            System.out.println("Enter a number between " + min + " and " + max);
            num = sc.nextInt();
            if (min <= num && num <= max)
                exit = true;
            else
                System.out.println("put a value between "+ min +"  and " + max);
        } while (!exit);

        return num;
    }

    public static void messagePresentation(String message){
        System.out.println("***************************************************************************");
        System.out.println("**************************** "+ message +" ****************************");
        System.out.println("***************************************************************************");
    }
}
