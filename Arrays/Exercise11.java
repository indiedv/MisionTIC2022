/*Leer 5 elementos numéricos que se introducirán ordenados de forma creciente.
* Éstos los guardaremos en una tabla de tamaño 10. Leer un número N, e insertarlo en
* el lugar adecuado para que la tabla continúe ordenada*/
package Arrays;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int array[]=new int[10],num,position=0,j=0;
        boolean growing=true;
        System.out.println("Guardando el array...");
        do{
            for(int i=0; i<5;i++){
                System.out.print((i+1)+". Ingrese un elemento: ");
                array[i]=entry.nextInt();
            }
            for (int i=0;i<4;i++){
                if(array[i]<array[i+1]){
                    growing=true;
                }
                if(array[i]>array[i+1]){
                    growing=false;
                    break;
                }
            }
            if(growing==false){
                System.out.println("\nEl array no está ordenado de forma creciente, vuelva a ingresarlo\n");

            }
        }while (growing==false);
        System.out.print("\nIngrese un elemento a insertar en el array: ");
        num=entry.nextInt();
        while (array[j]<num && j<5){
            position++;
            j++;
        }
        for(int i=4;i>=position;i--){
            array[i+1]=array[i];
        }
        array[position]=num;
        System.out.print("\nEl nuevo array es: ");
        for(int i=0;i<6;i++){
            System.out.print(array[i]+" - ");
        }
        System.out.println();
    }
}
