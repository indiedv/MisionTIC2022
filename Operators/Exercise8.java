/*Construir un programa que calcule y muestre por pantalla las raìces de la ecuación de segundo grado
* de coeficientes reales ax^2+bx+c=0*/
package Operators;

import java.util.Scanner;

public class Exercise8 {
    public static void main (String[]args){
        Scanner entry= new Scanner(System.in);
        double a,b,c, result1,result2;
        System.out.println("Ingresa los valores para a,b y c: ");
        a=entry.nextDouble();
        b=entry.nextDouble();
        c=entry.nextDouble();
        result1=(-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/2*a;
        result2=(-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/2*a;

        System.out.println("La raiz 1 es: " +result1);
        System.out.println("La raiz 2 es: " +result2);
    }
}
