package Searches;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int array[],nElements,num;
        boolean flag=false;
        System.out.print("\nIngrese el número de elementos del array: ");
        nElements=entry.nextInt();
        array=new int[nElements];
        System.out.println("Ingresando datos al array...");
        for(int i=0;i<nElements;i++){
            System.out.print(i+". Ingrese un número: ");
            array[i]=entry.nextInt();
        }
        System.out.println("Ingrese el dato que desea buscar: ");
        num=entry.nextInt();
        int i=0;
        while (i<nElements && !flag){
            if(array[i]==num){
                flag=true;
            }
            i++;
        }
        if (!flag){
            System.out.println("No se ha encontrado el número en el array");
        }
        else{
            System.out.println("Se ha encontrado el número en la posición: "+(i-1));
        }
    }
}
