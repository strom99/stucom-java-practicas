package CensoOrganizado.GlobalMethods;

import java.util.Scanner;

public class Methods {
    public static int readInBetweenMinAndMax(String message,int min, int max) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean exit = false;
        System.out.println(message);
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

    public static boolean trueOrFalse(String message){
        Scanner sc = new Scanner(System.in);
        //returns false by default , so it still counts as not
        String yesOrNo = " ";
        boolean isAcepted = false;
        do{
            System.out.println(message);
            yesOrNo = sc.nextLine();
            if(yesOrNo.equalsIgnoreCase("yes")){
                isAcepted = true;
            }
        }while (!yesOrNo.equalsIgnoreCase("yes") && !yesOrNo.equalsIgnoreCase("no"));
        return isAcepted;
    }
}
