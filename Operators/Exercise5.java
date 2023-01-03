/*La calificación final de un estudiante de informática se calcula con base a las calificaciones
* de cuatro aspectos de su rendimiento académico: participación, primer examen parcial, segundo examen parcial
* y examen final. Sabiendo que las calificaciones anteriores entran en la calificación final con ponderaciones
* de 10%, 25%, 25% y 40%. Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante*/
package Operators;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[]args){
        float pmidtermexam, smidtermexam, finalexam,participation,finalnote;
        String name;
        Scanner entry = new Scanner(System.in);

        System.out.println("Ingrese el nombre del alumno: " );
        name=entry.next();
        System.out.println("Ingrese Nota primer parcial: ");
        pmidtermexam=entry.nextFloat();
        System.out.println("Ingrese Nota Segundo Parcial: ");
        smidtermexam= entry.nextFloat();
        System.out.println("Ingrese Nota Parcial Final: ");
        finalexam= entry.nextFloat();
        System.out.println("Ingrese Nota de Participación: ");
        participation= entry.nextFloat();
        finalnote=(participation*0.10f)+(pmidtermexam*0.25f)+(smidtermexam*0.25f)+(finalexam*0.40f);
        System.out.println("La nota final de: "+name + "es:" +finalnote);

    }
}
