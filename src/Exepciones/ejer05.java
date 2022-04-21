package Exepciones;

public class ejer05 {
    public static void exception() {
        try {
            System.out.println("Esto se muestra");
            //         TIPO UNCHECKED. EL PROGRAMAM NO TE OBLIGA

            int num = (int) (Math.random() * 3);
            System.out.println(num);
            if (num == 0) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                throw new ArithmeticException();
            }
        }catch (Exception e ){
            System.out.println("recogo el objeto "+ e);
        }
    }

    public static void main(String[] args){
        exception();
        System.out.println("hemos gestionado la ejecucion");
    }
}
