package Ordering;

import javax.swing.*;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int array[],nElements,min,aux;
        nElements=Integer.parseInt(JOptionPane.showInputDialog("De cuántos elementos es el array?: "));
        array=new int[nElements];
        System.out.println("Ingresando datos al array...");
        for(int i=0;i<nElements;i++){
            System.out.print((i+1)+". Ingrese un número: ");
            array[i]=entry.nextInt();
        }
        for(int i=0;i<nElements;i++){
            min=i;
            for(int j=i+1;j<nElements;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
            aux=array[i];
            array[i]=array[min];
            array[min]=aux;
        }
        System.out.println("\nArray ordenado en forma creciente...");
        for(int i=0;i<nElements;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
        System.out.println("\nArray en orden decreciente...");
        for(int i=nElements-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
    }
}
