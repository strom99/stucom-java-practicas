
package practica2;

import java.util.Scanner;

public class practicaClase15 {

    public static void main(String[] args) {
        /*  Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.
            Sin años bisiestos.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un dia : ");
        int dia = sc.nextInt();
        
        // dia
        /*while( dia < 0 || dia > 31 ){
            System.out.println("dia incorrecto. Ingrese otro dia : ");
            dia = sc.nextInt();
        }
        // mes
        do{
            System.out.println("Introduce un mes : ");
            mes = sc.nextInt();
            if (mes <= 0 || mes > 12 ){
                System.out.println("el mes es incorrecto , introduce otro");
                
            }else{
                System.out.println("Valor corecto");
                exit = true;
            }
            
           
            switch(mes){
                case 1 : 
                    nombreMes = " enero ";
                    break;
                case 2 : 
                    nombreMes = " febrero ";
                    break;
                case 3 :
                    nombreMes = " marzo ";
                    break;
                case 4 :
                    nombreMes = " abril ";
                    break;
                case 5 : 
                    nombreMes = " mayo ";
                    break;
                case 6:
                    nombreMes = " junio";
                    break;
                case 7:
                    nombreMes = " julio";
                    break;
                case 8:
                    nombreMes = " agosto";
                    break;
                case 9:
                    nombreMes = " septiembre";
                    break;
                case 10:
                    nombreMes = " octubre";
                    break;
                case 11:
                    nombreMes = " noviembre";
                    break;
                case 12:
                    nombreMes = " diciembre";
                    break;
                    
            }
            
        }while(!exit);
        // año
        do{
            System.out.println("Introduce un año : ");
            año = sc.nextInt();
            if (año <= 0 || año > 2021 ){
                System.out.println("el año es incorrecto , introduce otro");
                
            }else{
                System.out.println("Valor corecto");
                exit = true;
            }
        }while(!exit);
        
        
        
        System.out.println("el dia es : "+ dia);
        System.out.println("el mes es : "+ nombreMes);
       System.out.println("el año es : "+ año);
       */
        
        


        }

}
