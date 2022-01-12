package pruebasJava;

import java.util.Scanner;

public class ej04Matrices_martin {

    public static void main(String[] args) {
        char PLACEHOLDER_CHAR = '·';
        char PLAYER_CHAR = 'P';
        char EXIT_CHAR = 'S';

        int randomRows;
        int randomCols;
        int horizontalAxis = 0;
        int verticalAxis = 0;
        int ROWS = 5;
        int COLS = 5;
        Scanner sc = new Scanner(System.in);
        char[][] matrix = new char[ROWS][COLS];


        // generate random num between 0 and 3
        matrix[horizontalAxis][verticalAxis] = PLAYER_CHAR;

        do {
            randomRows = (int) (Math.random() * ROWS);
            randomCols = (int) (Math.random() * COLS);
        } while (randomRows == 0 && randomCols == 0);


        matrix[randomRows][randomCols] = EXIT_CHAR;

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

        boolean out = false;

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
                    }
                    break;
                case "d":
                    if (horizontalAxis < matrix[0].length - 1) {
                        horizontalAxis++;
                        matrix[verticalAxis][horizontalAxis-1] = PLACEHOLDER_CHAR;
                    }
                    break;
                case "a":
                    if (verticalAxis > 0) {
                        verticalAxis--;
                        matrix[verticalAxis+1][horizontalAxis] = PLACEHOLDER_CHAR;
                    }
                    break;
                case "b":
                    if (verticalAxis < matrix.length - 1) {
                        verticalAxis++;
                        matrix[verticalAxis-1][horizontalAxis] = PLACEHOLDER_CHAR;
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            // delete prev one
            matrix[verticalAxis][horizontalAxis] = PLAYER_CHAR;

            if (matrix[randomRows][randomCols] == PLAYER_CHAR) {
                System.out.println("Has ganado");
                out = true;
            }
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
        }
    }
}
