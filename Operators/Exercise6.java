/*Hacer un programa que calcule el cuadrado de una suma
* (a+b)^2=a^2+b^2+2ab*/
package Operators;

import java.util.Scanner;

public class Exercise6 {
    public static void main (String[]args){
        Scanner entry=new Scanner(System.in);
        double numberA, numberB, result;
        System.out.println("Ingresa los números para a y b: ");
        numberA=entry.nextFloat();
        numberB=entry.nextFloat();
        result=Math.pow(numberA,2)+Math.pow(numberB,2)+(2*numberA*numberB);
        System.out.println("(a+b)^2 = a^2+b^2+2ab = " + result);
    }

}
