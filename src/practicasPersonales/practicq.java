
package practicasPersonales;

/**
 *
 * @author Storm
 */
public class practicq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int y = 435;
        int div = y / 10;
         int rest = y % 10;
         int mult = rest * 2;
         System.out.println(div + "--" + rest);
         int valor  = div - mult; 
         System.out.println(valor);
         
         /*
        for(int i = dividendo ; i >= divisor; i++){
            System.out.println(dividendo+" / "+ divisor);
            int cociente = dividendo / divisor;
            int resto = dividendo % divisor;
            System.out.println(dividendo +" - "+ divisor+ " = "+ cociente + " (resto = "+ resto+")");
           
        }*/
         /*if(dividendo > divisor){
            System.out.println("dividir "+ dividendo+ " entre "+ divisor+" : ");
            for(int e = dividendo ; e >= divisor; e-=divisor){
                System.out.println(e);
                contador++;
                
            }
        }*/
        
    }
    
    
}
