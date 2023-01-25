package Searches;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int array[], nElements, num, inf,sup,mid;
        boolean increasing = true, flag=false;
        System.out.println("Ingrese el número de elementos del array: ");
        nElements = entry.nextInt();
        array = new int[nElements];
        System.out.println("Ingresando los datos del array...");
        do {
            for (int i = 0; i < nElements; i++) {
                array[i] = entry.nextInt();
            }
            for (int i = 0; i < nElements - 1; i++) {
                if (array[i] < array[i + 1]) {
                    increasing = true;
                }
                if (array[i] > array[i + 1]) {
                    increasing = false;
                    break;
                }
            }
            if (!increasing) {
                System.out.println("\nEl array está desordenado, vuelva a ingresar los datos");
            }
        } while (!increasing);
        System.out.println("Ingrese el número a buscar: ");
        num=entry.nextInt();
        inf=0;
        sup=nElements;
        int i=0;
        mid=(inf+sup)/2;
        while(inf<=sup && i<nElements){
            if(array[mid]==num){
                flag=true;
                break;
            }
            if(array[mid]>num){
                sup=mid;
                mid=(inf+sup)/2;
            }
            if(array[mid]<num){
                inf=mid;
                mid=(inf+sup)/2;
            }
            i++;
        }
        if(flag==true){
            System.out.println("El número ha sido encontrado en la posición"+mid);
        }
        else{
            System.out.println("No se ha encontrado el número");
        }
    }
}