/*Crear y cargar dos matrices de tamaño 3 x 3, sumarlas y mostrar su suma*/
package Matrices;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner entry;
        entry = new Scanner(System.in);
        int matrix1[][], matrix2[][], sum[][];
        matrix1 = new int[3][3];
        matrix2 = new int[3][3];
        System.out.println("\nIngrese datos de la Matrix 1...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz [" + i + "] [" + j + "]: ");
                matrix1[i][j] = entry.nextInt();
            }
        }
        System.out.println("Ingrese datos de la Matrix 2...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz [" + i + "] [" + j + "]: ");
                matrix2[i][j] = entry.nextInt();

            }
        }
        sum = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("La suma de las matrices es:" );
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}