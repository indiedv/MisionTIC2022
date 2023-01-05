package Loops;

import java.util.Scanner;

public class For {
    public static void main (String[]args){
        Scanner entry=new Scanner(System.in);
        int counter;
        System.out.println("Ingrese hasta qué número quiere visualizar:");
        counter=entry.nextInt();
        for(int i=1;i<=counter;i++){
            System.out.println(i);
        }
    }
}
