/*Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas
semanales trabajadas y de su salario por hora*/
package Operators;

import java.util.Scanner;

public class Exercise2 {
    public static void main (String[]args){
        float salaries,hours,salaryh;
        String name;
        Scanner entry=new Scanner(System.in);
        System.out.println("Ingrese el nombre, horas trabajadas, Valor Hora: ");
        name=entry.next();
        hours=entry.nextFloat();
        salaryh=entry.nextFloat();
        salaries=salaryh*hours;
        System.out.println("\nLIQUIDACIÓN HORAS TRABAJADAS EN LA SEMANA");
        System.out.println("\nNOMBRE: "+name);
        System.out.println("\nHORAS TRABAJADAS: "+hours);
        System.out.println("\nVALOR HORA: $"+salaryh);
        System.out.println("\n******************************");
        System.out.println("\nTOTAL A PAGAR: $"+salaries);
    }
}
