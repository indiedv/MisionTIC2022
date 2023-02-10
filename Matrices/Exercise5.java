/*Crear y cargar una matriz de tamaño n*m, mostrar la suma de cada fila y de cada columna */
package Matrices;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int matrix[][],sum_col,sum_row, nRows,nColumns;
        System.out.print("Ingrese el número de Filas: ");
        nRows=entry.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        nColumns=entry.nextInt();
        matrix=new int[nRows][nColumns];
        System.out.println("Ingresando la Matrix... ");
        for(int i=0;i<nRows;i++){
            for (int j=0;j<nColumns;j++){
                System.out.print("Matriz ["+i+"] ["+j+"]: ");
                matrix[i][j]=entry.nextInt();
            }
        }
        System.out.println("La matriz indicada es: ");
        for (int i=0;i<nRows;i++){
            for(int j=0;j<nColumns;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Suma de las Filas");
        for (int i=0;i<nRows;i++) {
            sum_row = 0;
            for(int j=0; j<nColumns;j++){
                sum_row+=matrix[i][j];
            }
            System.out.print("\nLa suma de la fila: ["+i+"] es: "+sum_row);
        }
        System.out.println("");
        System.out.println("\nSuma de las Columnas");
        for(int j=0;j<nColumns;j++){
            sum_col=0;
            for (int i=0;i<nRows;i++){
                sum_col+=matrix[i][j];
            }
            System.out.print("\nLa suma de la columna: ["+j+"] es: "+sum_col);
        }
        System.out.println("");
    }
}
