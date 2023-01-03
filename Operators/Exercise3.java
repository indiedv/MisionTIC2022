/*Guillermo Tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad
* de lo que poseen Luis y Guillermo juntos. Hacer un programa que calcule e imprima la cantidad de dinero
* que tienen entre los tres*/
package Operators;

import java.util.Scanner;

public class Exercise3 {
    public static void main (String[]args){
        float Guille, Luis, Juan, Total;
        Scanner entry=new Scanner(System.in);

        System.out.println("Ingresa el dinero que tiene Guillermo: $");
        Guille= entry.nextFloat();
        Luis = Guille/2;
        Juan = (Guille+Luis)/2;
        Total = Guille+Luis+Juan;
        System.out.println("Guillermo tiene: $ "+Guille);
        System.out.println("Luis tiene: $ "+Luis);
        System.out.println("Juan tiene: $ "+Juan);
        System.out.println("Los tres tienen: $ "+Total);

    }
}
