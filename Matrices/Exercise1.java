/*Crear y cargar una matriz de tamaño n x m y decir si es simétrica o no*/
package Matrices;

import javax.swing.*;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int[][] matrix;
        int nRows;
        int nColumns;
        boolean symmetric=true;
        nRows=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de Filas de la Matrix: "));
        nColumns=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de Columnas de la Matrix: "));
        matrix=new int[nRows][nColumns];
        System.out.println("\nIngresando la Matrix...");
        for(int i=0;i<nRows;i++){
            for(int j=0;j<nColumns;j++){
                System.out.print("Matriz ["+i+"] ["+j+"]: ");
                matrix[i][j]=entry.nextInt();
            }
        }
        if(nRows==nColumns){
            int i,j;
            i=0;
            while (i<nRows && symmetric){
                j=0;
                while(j<i && symmetric){
                    if(matrix[i][j] != matrix[j][i]){
                        symmetric=false;
                    }
                    j++;
                }
                i++;
            }
            if(symmetric){
                JOptionPane.showMessageDialog(null,"La matriz es Simétrica");
            }
            else{
                JOptionPane.showMessageDialog(null,"La Matriz no es Simétrica");
            }

        }else {
            JOptionPane.showMessageDialog(null,"La Matrix no es simétrica");
        }

    }
}
