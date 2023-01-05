/*Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados(con nota =4) y suspensos (0-3)*/
package Loops;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Exercise19 {
    public static void main(String[] args) {
        float note = 0;
        int aprobe = 0, conditiona = 0, suspense = 0;
        for (int i = 1; i <= 6; i++) {
            do {
                note = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del estudiante entre 0 y 10: "));
            } while (note < 0 || note > 10);
            if(note==4){
                conditiona++;
            }
            else if (note>5){
                aprobe++;
            }
            else{
                suspense++;
            }
        }
        System.out.println("La cantidad de alummnos aprobados son: "+aprobe);
        System.out.println("La cantidad de alummnos suspensos son: "+suspense);
        System.out.println("La cantidad de alummnos condicionados son: "+conditiona);
    }
}
