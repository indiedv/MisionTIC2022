/*Crear y cargar una matriz de tamaño 3 x 3,transponerla y mostrarla*/
package Matrices;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int matrixN[][], matrixT[][];
        matrixN = new int[3][3];
        matrixT = new int[3][3];
        System.out.println("\nIngrese los datos de la matriz...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz [" + i + "] [" + j + "]: ");
                matrixN[i][j] = entry.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixT[i][j] = matrixN[j][i];
            }

        }
        System.out.println("La matrix transpuesta es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixT[i][j] + " ");
            }
            System.out.println();
        }
    }
}