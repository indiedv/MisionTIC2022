package Operators;

import java.util.Scanner;

public class Aritmethics {
    public static void main(String [] args){
        Scanner entry=new Scanner(System.in);
        float num1,num2, addition, substraction, multiplication, division,residue;
        System.out.println("================Basics Operation===============");
        System.out.println("Input Two numbers:");
        num1=entry.nextFloat();
        num2=entry.nextFloat();
        addition=num1+num2;
        substraction=num1-num2;
        multiplication=num1*num2;
        division=num1/num2;
        residue=num1%num2;
        System.out.println("Adittion is = "+addition);
        System.out.println("Substraction is = "+substraction);
        System.out.println("Multiplication is = "+multiplication);
        System.out.println("Division is = "+division);
        System.out.println("Residue is = "+residue);

    }
}
