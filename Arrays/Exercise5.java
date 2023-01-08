/*Leer por teclado dos tablas de 10 números enteros y mezclarlas un una tercera de la forma
*el 1° del A, el 1° del B, el 2° del A, el 2° del B etc*/
package Arrays;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int A[]=new int[10],B[]=new int[10],C[]=new int[20];
        System.out.println("\nGuardando los datos A");

        for(int i=0;i<10;i++) {
            System.out.print("A" + (i + 1) + ". Ingrese un número: ");
            A[i] = entry.nextInt();
        }

        System.out.println("\nGuardando los datos B");
        for(int i=0;i<10;i++){
            System.out.print("B"+(i+1)+". Ingrese un número: ");
            B[i]=entry.nextInt();
        }
        int j=0;
        for(int i=0;i<10;i++){
            C[j]=A[i];
            j++;
            C[j]=B[i];
            j++;
        }
        System.out.println("\nEl Arreglo C es: ");
        for(int i=0;i<20;i++){
            System.out.print(C[i]+" ");
        }

    }
}
