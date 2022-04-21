package Exepciones;

public class ejercicio03 {
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
            // runtime exepction es el padre de las clases de arriba  , polimorfismo
        }catch (RuntimeException e ){
            System.out.println("Recogo el objeto IOUE "+ e);
            // el finally se ejecutara siempre , si hay error o no
        }finally {
            System.out.println("se ejecuta el finaly");
        }
    }
}
