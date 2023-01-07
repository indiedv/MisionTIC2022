/*Leer 10 números enteros, guardarlos en un arreglo. Debemos mostrarlo en el siguiente orden:
* el primero, el último, el segundo, el penúltimo, el tercero, etc*/
package Arrays;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int numbers[]=new int[10];
        System.out.println("Guardando los números");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+" Ingrese un número: ");
            numbers[i]=entry.nextInt();
        }
        System.out.println("El resultado es: ");
        for (int i=0;i<5;i++){
            System.out.print(numbers[i]+" ");
            System.out.print(numbers[9-i]+" ");
        }
        System.out.println();
    }
}
