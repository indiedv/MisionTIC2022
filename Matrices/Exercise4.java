/*Crear una matriz tamaño 7x7 rellenarla de forma que los elementos de la diagonal principal
* sean 1 y el resto 0*/
package Matrices;


public class Exercise4 {
    public static void main(String[] args) {
        int matrix[][]=new int[7][7];
        for(int i=0;i<7;i++){
            for (int j=0;j<7;j++){
                if(i==j){
                    matrix[i][j]=1;
                }
                else{
                    matrix[i][j]=0;
                }
            }
        }
        for (int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }


    }
}
