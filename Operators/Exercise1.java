/*Hacer un programa que calcule e imprima la suma de tres calificaciones*/
package Operators;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[]args){
        float note1,note2,note3,sum;{
            Scanner entry=new Scanner(System.in);
            System.out.println("Ingrese tres calificaciones: ");

            note1=entry.nextFloat();
            note2=entry.nextFloat();
            note3=entry.nextFloat();
            sum=note1+note2+note3;
            System.out.println("\nThe Sum is: "+sum);
        }
    }
}
