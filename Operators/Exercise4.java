/*Una compañía de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales, más
* una comisión de $150 por cada carro vendido, más el 5% del valor de la venta por carro. Cada mes el capturista
* de la empresa ingresa en la computadora los datos pertinentes. Hacer un programa que calcule e imprima el salario
* mensual de un vendedor dado*/
package Operators;

import java.util.Scanner;

public class Exercise4 {
    public static void main (String[]args){
        final int salBasic=1000;
        int undCar;
        float totalSal,vrVtaCar;
        String name;
        Scanner entry = new Scanner(System.in);

        System.out.println("Ingrese el nombre del vendedor: ");
        name=entry.next();
        System.out.println("Ingrese la cantidad de autos vendidos por :" +name);
        undCar=entry.nextInt();
        System.out.println("Ingrese el valor de venta de cada carro: ");

        vrVtaCar=entry.nextFloat();

        totalSal=salBasic+(150*undCar)+(0.05f*vrVtaCar*undCar);
        System.out.println("El salario del vendedor " + name + " es: ");
        System.out.println("\n Básico: $ "+salBasic);
        System.out.println("\n Carros vendidos:  "+undCar);
        System.out.println("\n Precio venta por carro: $ "+vrVtaCar);
        System.out.println("\n TOTAL DEVENGADO: $ "+totalSal);
    }
}
