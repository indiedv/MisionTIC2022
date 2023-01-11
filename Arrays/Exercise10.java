/*Crear un programa que lea por teclado una tabla de 10 números enteros y desplace N
* posiciones en el arreglo (N es digitado por el usuario)*/
package Arrays;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int table[]=new int[10],position,last;
        System.out.println("\nCargando los datos");
        for (int i=0;i<10;i++){
            System.out.print("\nIngrese el número "+(i+1)+": ");
            table[i]=entry.nextInt();
        }
        System.out.print("\nIngrese el número de posiciones para desplazar: ");
        position=entry.nextInt();
        for (int j=1;j<=position;j++){
            last=table[9];
            for(int i=8;i>=0;i--){
                table[i+1]=table[i];
            }
            table[0]=last;
        }
        System.out.println("\nEl nuevo array es: ");
        for(int i=0;i<10;i++){
            System.out.println((i+1)+". Elemento: "+table[i]);
        }
    }
}
