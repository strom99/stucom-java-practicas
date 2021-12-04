
package practica2;

import java.util.Scanner;

public class practicaClase21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("introduce un numero entre 0 a 99 : ");
        int numeroUnid = sc.nextInt();
        String entero = "";
        String decimas = "";
        String restant = "";
        String resto_restant = "";
        
        // inicion comparando del 0 al 10 con un stiwch
        if(numeroUnid >= 0 && numeroUnid < 10){
            switch(numeroUnid){
                case 0 :
                    entero = "zero";
                    break;
                case 1 :
                    entero = "uno ";
                    break;
                case 2: 
                    entero = "dos";
                    break;
                case 3 : 
                    entero = "tres";
                    break;
                case 4 : 
                    entero = "cuatro";
                    break;
                case 5 : 
                    entero = "cinco";
                    break;
                case 6 : 
                    entero = "seis";
                    break;
                case 7 : 
                    entero = "siete";
                    break;
                case 8 : 
                    entero = "ocho";
                    break;
                case 9 : 
                    entero = "nueve";
                    break;
              
            }
            System.out.println("el numero introducido es correcto" + " Tu valor es : "+ entero);
            //y continuo del 10 hasta el 19
        }else if(numeroUnid >= 10 && numeroUnid <= 19){
                
                //int div = numeroUnid / 10;
                //int resto = numeroUnid % 10;
                
                switch(numeroUnid){
                case 10 :
                    decimas = "dies ";
                    break;
                case 11: 
                    decimas = "once";
                    break;
                case 12 : 
                    decimas = "doce";
                    break;
                case 13 : 
                    decimas = "trece";
                    break;
                case 14 : 
                    decimas = "catorce";
                    break;
                case 15 : 
                    decimas = "quince";
                    break;
                case 16 : 
                    decimas = "dieciseis";
                    break;
                case 17 : 
                    decimas = "diecisiete";
                    break;
                case 18 : 
                    decimas = "dieciocho";
                    break;
                case 19 : 
                    decimas = "diecinueve";
                    break;
                }
                System.out.println("el numero introducido es correcto. es : "+ decimas);
                // y otro del 20 al 99 con dos switch para los numero delantero y el otro
                }else if(numeroUnid >= 20 && numeroUnid <= 99){
                    
                    int div = numeroUnid / 10;
                    int resto = numeroUnid % 10;
                    
                switch(div){
  
                case 2: 
                    restant = "veinte";
                    break;
                case 3 : 
                    restant = "treinta";
                    break;
                case 4 : 
                    restant = "cuarenta";
                    break;
                case 5 : 
                    restant = "cinquenta";
                    break;
                case 6 : 
                    restant = "sesenta";
                    break;
                case 7 : 
                    restant = "setenta";
                    break;
                case 8 : 
                    restant = "ochenta";
                    break;
                case 9 : 
                    restant = "noventa";
                    break;
                 }
                
                switch(resto){
                
                case 1 :
                    resto_restant = "y uno ";
                    break;
                case 2: 
                    resto_restant = "y dos";
                    break;
                case 3 : 
                    resto_restant = "y tres";
                    break;
                case 4 : 
                    resto_restant = "y cuatro";
                    break;
                case 5 : 
                    resto_restant = "y cinco";
                    break;
                case 6 : 
                    resto_restant = "y seis";
                    break;
                case 7 : 
                    resto_restant = "y siete";
                    break;
                case 8 : 
                    resto_restant = "y ocho";
                    break;
                case 9 : 
                    resto_restant = "y nueve";
                    break;
              
            }
       
            System.out.println("El numero introducido es correcto. Es : "+ restant +" "+ resto_restant);
            // si ninguna de mis ocndiciones se cumple , le sale error y que empieze de nuevo
            }else{
                System.out.println("El numero introducido es incorrectio , empieza de nuevo");
            }
        }
   }
        
        
        
        // si el numero es num <= 10 || num >=20
   
       
    
    

// 16 17(no se hace)18 19 asumir que la fecha introducida ya es correcta