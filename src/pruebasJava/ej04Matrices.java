package pruebasJava;

import java.util.Scanner;

public class ej04Matrices {
    public static void main(String[] args) {
        int[][] matriz = new int[3][5];
        int col = 0;
        int fila = 0;
        int columna = 0;
        int numAl1 = 0;
        int numAl2 = 0;
        boolean salida = true;
        boolean salidaLab = true ;
        Scanner sc = new Scanner(System.in);
        char tecla = 0;
        boolean teclaPre = true ;

        System.out.print(" ");

        for (int row = 0; row < matriz.length; row++) {
            for(col = 0 ; col < matriz[row].length; col++){
                System.out.print("  " + col);

            }
            if( col >= matriz[row].length){
                break;
            }
        }
        System.out.println();
        for (int row = 0; row < matriz.length; row++) {
            for ( col = 0; col < matriz[row].length; col++) {
                if (col < 1) {
                    System.out.print(row);
                    System.out.print("  " + "·");
                } else {
                    System.out.print("  " + "·");
                }
            }
            System.out.println();
        }
        // impresion salida del laberinto
        // posicion aleatoria de fila
        do{
            numAl1 = (int) (Math.random()* 3 );
            numAl2 = (int) (Math.random()* 5 );

            if(numAl1 != 0 && numAl2 != 0){
                fila = numAl1 ;
                columna = numAl2;
                salida = false;
            }
        }while(salida);
        System.out.println(fila +"," +columna);


        // impresion con la puerta de salida
        System.out.print(" ");
        for (int row = 0; row < matriz.length; row++) {
            for(col = 0 ; col < matriz[row].length; col++){
                System.out.print("  " + col);

            }
            if( col >= matriz[row].length){
                break;
            }
        }

        System.out.println();
        for (int row = 0; row < matriz.length; row++) {
            for ( col = 0; col < matriz[row].length; col++) {
                if( row == fila && col== columna){
                    System.out.print("  " + "S");
                }else{
                    if (col < 1) {
                        System.out.print(row);
                        System.out.print("  " + "·");
                    } else {
                        System.out.print("  " + "·");
                    }
                }

            }
            System.out.println();
        }

        // impresion con la puerta de salida ,  mas personaje
        System.out.println(" ");
        for (int row = 0; row < matriz.length; row++) {
            for(col = 0 ; col < matriz[row].length; col++){
                if(col < 1){
                    System.out.print("   " + col);
                }else{
                    System.out.print("  " + col);
                }
            }
            if( col >= matriz[row].length){
                break;
            }
        }

        System.out.println();
        for (int row = 0; row < matriz.length; row++) {
            for ( col = 0; col < matriz[row].length; col++) {

                if(row == 0 && col == 0){
                    System.out.print(row);
                    System.out.print("  "+"P");
                }else{
                    if( row == fila && col== columna){
                        System.out.print("  " + "S");
                    }else{
                        if (col < 1) {
                            System.out.print(row);
                            System.out.print("  " + "·");
                        } else {
                            System.out.print("  " + "·");
                        }
                    }

                }


            }
            System.out.println();
        }

        System.out.println("mapa del juego , tu posicion es P , y la salida es S");
        do{

            do{

                System.out.println("Teclas con las que te pueds mover :");
                System.out.println("a --> arriba");
                System.out.println("b --> abajo");
                System.out.println("d --> dereecha");
                System.out.println("i --> izquierda");

                tecla = sc.next().charAt(0);
                if(tecla == 0){
                    System.out.println(tecla);
                    teclaPre = false;
                }

            }while(teclaPre);


            System.out.println(" ");
            for (int row = 0; row < matriz.length; row++) {
                for(col = 0 ; col < matriz[row].length; col++){
                    if(col < 1){
                        System.out.print("   " + col);
                    }else{
                        System.out.print("  " + col);
                    }
                }
                if( col >= matriz[row].length){
                    break;
                }
            }

            System.out.println();
            for (int row = 0; row < matriz.length; row++) {
                for ( col = 0; col < matriz[row].length; col++) {

                    if(row == 0 && col == 0){
                        System.out.print(row);
                        System.out.print("  "+"P");
                    }else{
                        if( row == fila && col== columna){
                            System.out.print("  " + "S");
                        }else{
                            if (col < 1) {
                                System.out.print(row);
                                System.out.print("  " + "·");
                            } else {
                                System.out.print("  " + "·");
                            }
                        }

                    }


                }
                System.out.println();
            }
        }while(salidaLab);
    }
}
