/*Crear una matriz "marco" de tamaño 5*5: Todos sus elementos deben ser 0 salvo los de los bordes
que deben 1. Mostrarla.*/
package Matrices;

public class Exercise7 {
    public static void main(String[] args) {
        int matrix[][]=new int[5][5];
        for(int i=0; i<5;i++){
            for (int j=0;j<5;j++){
                if (i==0 || i==4){
                    matrix[i][j]=1;
                } else if (j==0 || j==4) {
                    matrix[i][j]=1;
                }
            }
        }
        System.out.println("La matriz 'marco' es: ");
        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
