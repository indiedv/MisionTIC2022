/*Pedir 5 claificaciones de alumnos y decir si hay algún suspenso*/
package Loops;

import javax.swing.*;

public class Exercise22 {
    public static void main(String[] args) {
        float califica=0;
        boolean suspense=false;

        for(int i=1;i<=5;i++){
            do{
                califica=Float.parseFloat(JOptionPane.showInputDialog("Ingrese calificación de 0 a 10: "));
            }while(califica<0||califica>10);

            if (califica<5){
                suspense=true;
            }
        }
        if (suspense==true){
            System.out.println("Hay almenos un alumno suspenso");
        }
        else{
            System.out.println("No hay alumnos suspensos");
        }
    }
}
