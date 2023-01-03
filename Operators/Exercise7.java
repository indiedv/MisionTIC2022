/*Construir un programa que, dado un número total de horas, devuelve el número de semanas,
 * días y horas equivalentes. Por ejemplo: dadas mil horas debe mostrar 5 semanas, 6 días y 10 horas*/
package Operators;

import java.util.Scanner;

public class Exercise7 {
    public static void main (String [] args){
        double hours, weeks, days, allhours;
        Scanner entry=new Scanner(System.in);
        System.out.println("Ingrese el numero de horas a calcular: ");
        hours=entry.nextFloat();
        weeks=hours/168;
        days=hours%168/24;
        allhours=hours%24;
        System.out.println("El número de semanas es: " +weeks);
        System.out.println("El número de días es: " +days);
        System.out.println("El número de horas es: " +allhours);
    }
}
