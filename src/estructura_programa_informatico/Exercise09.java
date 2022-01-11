
package estructura_programa_informatico;

public class Exercise09 {

    public static void main(String[] args) {
    
    double min = 0.1;
    double max = 4.9;
    double numAl = Math.random()* (max - min) + min; //* 490 + 10
    System.out.println("Money = "+numAl); // randome / 100.0
    
    //convierto el numero en entero para que me de solo el primer valor 
    int unit = (int) numAl;
    
    //cree una variable vacia para guardar los valores asignados en stwich y luego mostrarlo
    String unitImp = "";
    
    //use switch para llamar el valor de cada unidad que imprime el math random, basandome en las monedas que
    // se necesitan para cada unidad
    
   // final string_name
    switch(unit){
        case 0:
            unitImp = " 0 de 2\u20AC - 0 de 1\u20AC";
            break;
        case 1:
            unitImp = " 0 de 2\u20AC - 1 de 1\u20AC";
            break;
        case 2:
            unitImp = " 1 de 2\u20AC - 0 de 1\u20AC";
            break;
        case 3:
            unitImp = " 1 de 2\u20AC - 1 de 1\u20AC";
            break;
        case 4:
            unitImp = " 2 de 2\u20AC - 0 de 1\u20AC";
            break;
    }
    
    int tenMoney = (int) (numAl * 10);
    int ten = tenMoney % 10;
 
    String tenString = "";
    
    switch(ten){
        
        case 0:
            tenString = " 0 de 0.50\u20AC - 0 de 20\u20AC - 0 de 10\u20AC";
            break;
        case 1:
            tenString = " 0 de 0.50\u20AC - 0 de 20\u20AC - 1 de 10\u20AC";
            break;
        case 2:
            tenString = " 0 de 0.50\u20AC - 1 de 20\u20AC - 0 de 10\u20AC";
            break;
        case 3:
            tenString = " 0 de 0.50\u20AC - 1 de 20\u20AC - 1 de 10\u20AC";
            break;
        case 4:
            tenString = " 0 de 0.50\u20AC - 2 de 20\u20AC - 0 de 10\u20AC";
            break;
        case 5:
            tenString = " 1 de 0.50\u20AC - 0 de 20\u20AC - 0 de 10\u20AC";
            break;
        case 6:
            tenString = " 1 de 0.50\u20AC - 0 de 20\u20AC - 1 de 10\u20AC";
            break;
        case 7:
            tenString = " 1 de 0.50\u20AC - 1 de 20\u20AC - 0 de 10\u20AC";
            break;
        case 8:
            tenString = " 1 de 0.50\u20AC - 1 de 20\u20AC - 1 de 10\u20AC";
            break;
        case 9:
            tenString = " 1 de 0.50\u20AC - 1 de 20\u20AC - 2 de 10\u20AC";
            break;
    }
    
    int centMoney = (int) (numAl * 100);
    int cent = centMoney % 10;
    
    String centString = "";
    
    switch(cent){
        
        case 0: 
            centString = " 0 de 0.5\u20AC - 0 de 0.2\u20AC - 0 de 0.1\u20AC";
            break;
        case 1:
            centString = " 0 de 0.5\u20AC - 0 de 0.2\u20AC - 1 de 0.1\u20AC";
            break;
        case 2:
            centString = " 0 de 0.5\u20AC - 1 de 0.2\u20AC - 0 de 0.1\u20AC";
            break;
        case 3:
            centString = " 0 de 0.5\u20AC - 1 de 0.2\u20AC - 1 de 0.1\u20AC";
            break;
        case 4:
            centString = " 0 de 0.5\u20AC - 2 de 0.2\u20AC - 0 de 0.1\u20AC";
            break;
        case 5:
            centString = " 1 de 0.5\u20AC - 0 de 0.2\u20AC - 0 de 0.1\u20AC";
            break;
        case 6:
            centString = " 1 de 0.5\u20AC - 0 de 0.2\u20AC - 1 de 0.1\u20AC";
            break;
        case 7:
            centString = " 1 de 0.5\u20AC - 1 de 0.2\u20AC - 0 de 0.1\u20AC";
            break;
        case 8:
            centString = " 1 de 0.5\u20AC - 1 de 0.2\u20AC - 1 de 0.1\u20AC";
            break;
        case 9:
            centString = " 1 de 0.5\u20AC - 2 de 0.2\u20AC - 0 de 0.1\u20AC";
            break;
        }
           System.out.println(unit);
           System.out.println(ten);
           System.out.println(cent);
        System.out.println("coins needed = "+unitImp + " - "+ tenString+" - "+ centString);
    }
    
}
