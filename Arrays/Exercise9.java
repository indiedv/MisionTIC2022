/*Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición
* hacia abajo: el primero ´pasa a ser el segundo, el segundo pasa a ser tercero y así sucesivamente.
* El último pasa a ser el primero*/
package Arrays;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int down[]=new int[10],last;
        System.out.println("\nCargando los datos");
        for (int i=0;i<10;i++){
            System.out.print("\nIngrese el número "+(i+1)+": ");
            down[i]=entry.nextInt();
        }
        last=down[9];
        for(int i=8;i>=0;i--){
            down[i+1]=down[i];
        }
        down[0]=last;
        System.out.println("\nEl nuevo array es:");
        for (int i=0;i<10;i++){
            System.out.println((i+1)+". Número: "+down[i]);
        }
    }
}
