/*Imprimir los números del 1 al número que indique el usuario*/
package Loops;

import java.util.Scanner;

public class While {
    public static void main(String[]args){
        Scanner Entry=new Scanner(System.in);
        int i=1,counter;
        System.out.println("Digite hasta qué número quiere ver: ");
        counter=Entry.nextInt();

        while (i<=counter){
            System.out.println(i);
            i++;
        }
    }
}
