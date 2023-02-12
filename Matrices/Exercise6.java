/*Utilizando dos matrices de tamaño 5*9 y 9*5, cargar la primera y trasponerla en la segunda*/
package Matrices;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int matrixA[][] = new int[5][9], matrixB[][] = new int[9][5];
        System.out.println("\nIngresando Matrix...");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("Matriz [" + i + "] [" + j + "]: ");
                matrixA[i][j] = entry.nextInt();
            }
        }
        System.out.println("\nLa matriz indicada es: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matrixB[j][i]=matrixA[i][j];
            }
        }
        System.out.println("\nMatriz traspuesta...");
        for (int i=0;i<9;i++){
            for(int j=0;j<5;j++){
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
