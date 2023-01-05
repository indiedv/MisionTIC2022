/**/
package Loops;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[]args){
        Scanner entry=new Scanner(System.in);
        int i=10,counter;
        System.out.println("Ingrese hasta qué número quiere ver: ");
        counter=entry.nextInt();
        do {
            System.out.println(i);
            i++;
        }while (i<=counter);

    }
}
