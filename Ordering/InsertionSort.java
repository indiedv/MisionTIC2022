package Ordering;

import javax.swing.*;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner entry= new Scanner(System.in);
        int array[],nElementos,position,aux;
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos del Array"));
        array=new int[nElementos];
        System.out.println("Ingrese los datos para el array...");
        for (int i=0;i<nElementos;i++){
            System.out.print((i+1)+". Ingrese un número: ");
            array[i]=entry.nextInt();
        }
        for(int i=0;i<nElementos;i++){
            position=i;
            aux=array[i];
            while ((position>0) && (array[position-1])>aux){
                array[position]=array[position-1];
                position--;
            }
            array[position]=aux;
        }
        System.out.println("Array en orden ascendente...");
        for(int i=0;i<nElementos;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\nArray en orden descendente... ");
        for (int i=(nElementos-1);i>=0;i--){
            System.out.print(array[i]+" ");

        }
    }
}
