/*Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe mostrar
* la posición en que se encuentra. Si no está, indicarlo en un mensaje*/
package Arrays;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int nums[]=new int[10],n;
        boolean increasing=true;

        do {
            System.out.println("Guardando el array...");
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + ". Ingrese un número: ");
                nums[i] = entry.nextInt();
            }
            for (int i = 0; i < 9; i++) {
                if (nums[i] > nums[i + 1]) {
                    increasing = false;
                    break;
                }
                if (nums[i] < nums[i + 1]) {
                    increasing = true;
                }
            }
            if(!increasing){
                System.out.println("\nEl array está desordenado, ingrese los números nuevamente.");
            }
        }while (!increasing);
        System.out.print("\nIngrese el número a buscar: ");
        n=entry.nextInt();
        int i=0;
        while (i<10&&nums[i]<n){
            i++;
        }
        if(i==10){
            System.out.println("\nNúmero no encontrado");
        }
        else{
            if (nums[i]==n){
                System.out.println("\nNúmero encontrado, en la posición"+i);
            }
            else{
                System.out.println("\nNúmero no encontrado");
            }
        }
    }
}