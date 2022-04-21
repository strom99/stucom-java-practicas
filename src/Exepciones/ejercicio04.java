package Exepciones;

public class ejercicio04 {
    public static void exception() {
        System.out.println("Esto se muestra");
//         TIPO UNCHECKED. EL PROGRAMAM NO TE OBLIGA

            int num = (int) (Math.random() * 3);
            System.out.println(num);
            if(num == 0 ){
                throw new ArrayIndexOutOfBoundsException();
            }else{
                throw new ArithmeticException();
            }
    }

    public static void main(String[] args){
            exception();
    }
}
