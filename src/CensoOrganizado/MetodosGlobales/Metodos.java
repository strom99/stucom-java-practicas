package CensoOrganizado.MetodosGlobales;

import java.util.Scanner;

public class Metodos {
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
                System.out.println("put a value between 1 and 10");
        } while (!exit);

        return num;
    }
}
