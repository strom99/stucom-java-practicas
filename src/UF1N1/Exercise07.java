
package UF1N1;

public class Exercise07 {

    public static void main(String[] args) {
        //Numeros aleateorios
        int price = (int) (Math.random()* 101);
        int discount = (int) ((Math.random()* (21-10))+10);// 41 +10
        System.out.println(discount);
        
        // pasamos el descuento a decimal
        int userMoney = (int) (Math.random()* 150);
        double discontEu = (double)(discount * price ) / 100;
        
        //calculo de descuento y precio final
        double finalPrice = price - discontEu;
        double change = userMoney - finalPrice;
        

        System.out.println("Precio producto -> "+ price+"\u20AC");
        System.out.println("Descuento -> "+ discount+"%");
        System.out.println("Precio final con el descuento -> "+ finalPrice+"\u20AC");
        System.out.println("El usuario cuenta con -> "+ userMoney+"\u20AC para la compra");
        
        // solo imprimira el resultado si cuenta con 100 euros o mas
        if(userMoney >= 100){
            System.out.println("Despues de la compra le sobran "+ change+"\u20AC");
        }else{
            System.out.println("Tiene menos de 100\u20AC");
        }
    }
    
}
