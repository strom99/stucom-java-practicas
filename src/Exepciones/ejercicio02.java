package Exepciones;

public class ejercicio02 {
    public static void main(String[] args) {
        System.out.println("Esto se muestra");
//         TIPO UNCHECKED. EL PROGRAMAM NO TE OBLIGA
        try {
            int num = (int) (Math.random() * 3);
            System.out.println(num);
            if(num == 0 ){
                throw new ArrayIndexOutOfBoundsException();
            }else{
                throw new ArithmeticException();
            }
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e ){
            System.out.println("Recogo el objeto IOUE "+ e);
        }
    }
}
