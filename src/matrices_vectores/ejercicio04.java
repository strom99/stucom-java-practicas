package matrices_vectores;

import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) {

        char PLACEHOLDER_CHAR = '·';
        //jugador
        char PLAYER_CHAR = 'P';
        //salida
        char EXIT_CHAR = 'S';

        int randomRows;
        int randomCols;
        int horizontalAxis = 0;
        int verticalAxis = 0;
        int fila = 5;
        int columna = 5;
        Scanner sc = new Scanner(System.in);
        char[][] matrix = new char[fila][columna];


        // asignacion posicion jugador "P"
        matrix[horizontalAxis][verticalAxis] = PLAYER_CHAR;

        // numeros aleatorios para la salida del laberinto
        do {
            randomRows = (int) (Math.random() * fila);
            randomCols = (int) (Math.random() * columna);
        } while (randomRows == 0 && randomCols == 0);

        //asignacion posicion salida laberinto
        matrix[randomRows][randomCols] = EXIT_CHAR;

        //impresion laberinto con coordenadas
        System.out.print(" ");
        for (int row = 0; row < matrix.length; row++) {
            System.out.print("  " + row);
        }
        System.out.println();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] != EXIT_CHAR && matrix[row][col] != PLAYER_CHAR) {
                    matrix[row][col] = PLACEHOLDER_CHAR;
                }
                if (col < 1) {
                    System.out.print(row);
                    System.out.print("  " + matrix[row][col]);
                } else {
                    System.out.print("  " + matrix[row][col]);
                }
            }
            System.out.println();
        }

        // booleano para salida del laberinto, terminado el juego
        boolean out = false;
        // bucle laberinto
        while (!out) {
            System.out.println("--- MENU ---");
            System.out.println("I. Mover izquierda");
            System.out.println("D. Mover derecha");
            System.out.println("A. Mover arriba");
            System.out.println("B. Mover abajo");
            System.out.println("--- MENU ---");

            String input = sc.nextLine();

            switch (input.toLowerCase()) {
                case "i":
                    if (horizontalAxis > 0) {
                        horizontalAxis--;
                        matrix[verticalAxis][horizontalAxis+1] = PLACEHOLDER_CHAR;
                    }else{
                        System.out.println("movimiento invalido");
                    }
                    break;
                case "d":
                    if (horizontalAxis < matrix[0].length - 1) {
                        horizontalAxis++;
                        matrix[verticalAxis][horizontalAxis-1] = PLACEHOLDER_CHAR;
                    }else{
                        System.out.println("movimiento invalido");
                    }
                    break;
                case "a":
                    if (verticalAxis > 0) {
                        verticalAxis--;
                        matrix[verticalAxis+1][horizontalAxis] = PLACEHOLDER_CHAR;
                    }else{
                        System.out.println("movimiento invalido");
                    }
                    break;
                case "b":
                    if (verticalAxis < matrix.length - 1) {
                        verticalAxis++;
                        matrix[verticalAxis-1][horizontalAxis] = PLACEHOLDER_CHAR;
                    }else{
                        System.out.println("movimiento invalido");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida, ingresa otro movimiento");
            }
            // reasignacion posicion "P", de acuerdo al valor insertado
            matrix[verticalAxis][horizontalAxis] = PLAYER_CHAR;
            // comprobacion de la posicion "P" en la salida "S", para determinar si gano
            if (matrix[randomRows][randomCols] == PLAYER_CHAR) {
                System.out.println("Has ganado!!");
                out = true;
            }
            //impresion coordenadas horizontales
            System.out.print(" ");
            for (int row = 0; row < matrix.length; row++) {
                System.out.print("  " + row);
            }
            System.out.println();
            //coordenadas verticales , con laberinto y sus modificaciones
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    //impresion punto vacio donde no se encuentre "P" y "S" , para no dejar espacios vacios
                    if (matrix[row][col] != EXIT_CHAR && matrix[row][col] != PLAYER_CHAR) {
                        matrix[row][col] = PLACEHOLDER_CHAR;
                    }
                    // impresion coordenadas y cambios efectuados
                    if (col < 1) {
                        System.out.print(row);
                        System.out.print("  " + matrix[row][col]);
                    } else {
                        System.out.print("  " + matrix[row][col]);
                    }
                }
                System.out.println();
            }
        }
    }
}
