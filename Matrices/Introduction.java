package Matrices;

import javax.swing.*;
import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int matrix[][],nRows,nColumn;
        nRows=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas"));
        nColumn=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de Columnas"));
        matrix=new int [nRows][nColumn];
        System.out.println("Digite la Matrix");
        for(int i=0;i<nRows;i++){
            for (int j=0;j<nColumn;j++){
                System.out.print("Matriz ["+ i +"] ["+j+" ]: ");
                matrix[i][j]=entry.nextInt();
            }

        }
        System.out.println("\nLa Matrix es: ");
        for (int i=0;i<nRows;i++){
            for(int j=0;j<nColumn;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
