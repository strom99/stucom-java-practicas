
package practica2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class practicaClase10 {

    public static void main(String[] args) {
        //Demanar tres números i mostrar-los ordenats de major a menor.
        Scanner sc = new Scanner (System.in);
        System.out.println("introduce 3 numeros : ");
        int a ,b,c;
        int numMayor = 0;
        int numMenor = 0;
        int mayor = 0 ;
        int medio = 0;
        int menor = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        /*if( a > b ){
            numMayor = a ;
            numMenor = b ;
            if(numMayor > c){
                mayor = numMayor ;
                menor = c;
                        if( numMenor > c ){
                            medio = numMenor;
                            menor = c ;

                        }else{
                            medio = c;
                            menor = numMenor ;

                        }
            }else{
                mayor = c ;
                menor = numMenor;
                    if( numMenor > c ){
                        medio = numMenor;
                        menor = numMayor ;

                    }else{
                        medio = numMayor;
                        menor = numMenor ;

                    }

            }
        }else{
            numMayor = b ;
            numMenor = a ;
                if(numMayor > c){
                    mayor = numMayor ;
                    menor = c;
                    if( numMenor > c ){
                        medio = numMenor;
                        menor = c ;

                    }else{
                        medio = c;
                        menor = numMenor ;

                    }
                }else{
                    mayor = c ;
                    menor = numMayor;
                    if( numMenor > c ){
                        medio = numMenor;
                        menor = c ;

                    }else{
                        medio = numMayor;
                        menor = numMenor ;

                    }
                }
        }*/
        if( a > b ){
            if(a > c){
                mayor = a ;
                menor = c;
                if( b > c ){
                    medio = b;
                    menor = c ;

                }else{
                    medio = c;
                    menor = b ;

                }
            }else{
                mayor = c ;
                menor = a;
                if( numMenor > c ){
                    medio = numMenor;
                    menor = numMayor ;

                }else{
                    medio = numMayor;
                    menor = numMenor ;

                }

            }
        }else{
            if(b > c){
                mayor = b ;
                menor = c;
                if( numMenor > c ){
                    medio = numMenor;
                    menor = c ;

                }else{
                    medio = c;
                    menor = numMenor ;

                }
            }else{
                mayor = c ;
                menor = numMayor;
                if( numMenor > c ){
                    medio = numMenor;
                    menor = c ;

                }else{
                    medio = numMayor;
                    menor = numMenor ;

                }
            }
        }


        System.out.println(mayor);
        System.out.println(medio);
        System.out.println(menor);

    }
    
}
