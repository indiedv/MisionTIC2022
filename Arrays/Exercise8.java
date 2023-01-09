/*Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante teclado 8 números.
* Después se debe pedir un número y una posición insertarlo en la posición indicada, desplazando los que estén
* detrás*/
package Arrays;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int egiht[]=new int[10],num,position;
        System.out.println("\nCargando los datos");
        for (int i=0;i<8;i++){
            System.out.print("\nIngrese el dato: "+(i+1)+" :");
            egiht[i]=entry.nextInt();
        }
        System.out.println("\nIngrese un número para insertar: ");
        num=entry.nextInt();
        System.out.println("\nIngrese la posición: ");
        position=entry.nextInt();
        for(int i=7;i>=position;i--){
            egiht[i+1]=egiht[i];
        }
        egiht[position]=num;

        System.out.println("\nEl nuevo array es: ");
        for(int i=0;i<9;i++){
            System.out.println("Posición "+i+": "+egiht[i]);
        }
    }
}
