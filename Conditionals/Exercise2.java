/*Pedir dos números y decir cuál es mayor o si son iguales*/
package Conditionals;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[]args){
        int num1,num2;
        Scanner entry = new Scanner(System.in);
        System.out.println("Ingrese dos números: ");
        num1=entry.nextInt();
        num2=entry.nextInt();
        if(num1>num2){
            System.out.println("El múmero: "+num1 +" es mayor" );
        }else if (num2>num1){
            System.out.println("el número: "+num2+" es mayor");
        }
        else {
            System.out.println("Los números son iguales");
        }
    }
}
