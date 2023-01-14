/*Leer por teclado una tabla de 10 elementos numéricos enteros y una posición (entre 0 9)
* Eliminar el elemento situado en una posición dada sin dejar huecos*/
package Arrays;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int nums[]=new int[10],position;
        System.out.println("Guardando el array...");
        for(int i=0;i<10;i++){
            System.out.print(i+". Ingrese un elemento: ");
            nums[i]=entry.nextInt();
        }
        do{
            System.out.print("Digite una posición (Número entre 0 y 9): ");
            position=entry.nextInt();
        }while (position<0||position>9);
        for(int i=position;i<9;i++){
            nums[i]=nums[i+1];
        }
        System.out.println("\nEl array queda: ");
        for(int i=0; i<9;i++){
            System.out.println(i+". El elemento del array es: "+nums[i]);
        }
    }
}
