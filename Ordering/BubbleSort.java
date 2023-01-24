package Ordering;

import javax.swing.*;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int array[],nElements,aux;
        nElements=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del array: "));
        array= new int[nElements];
        for(int i=0;i<nElements;i++){
            System.out.print((i+1)+". Ingrese un elemento: ");
            array[i]=entry.nextInt();
        }
        for(int i=0;i<nElements-1;i++){
            for(int actual=0;actual<nElements-1;actual++){
                if(array[actual]>array[actual+1]){
                    aux=array[actual];
                    array[actual]=array[actual+1];
                    array[actual+1]=aux;
                }
            }
        }
        System.out.println("Array ordenado en forma Creciente...");
        for(int i=0;i<nElements;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\nArray ordenado en forma decreciente...");
        for (int i=(nElements-1);i>=0;i--){
            System.out.print(array[i]+" ");
        }


    }
}
