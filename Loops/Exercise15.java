/*Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
la cantidad de alumnos mayores de 18 años y la cantidad de alumnos que miden más de 1.75*/
package Loops;

import javax.swing.*;

public class Exercise15 {
    public static void main(String[] args) {
        int years,count_year=0,sum_year=0,count_height=0;
        float height,sum_height=0,average_years,average_height;

        for(int i=1;i<=5;i++){
            years=Integer.parseInt(JOptionPane.showInputDialog("Alumno: " + i +" Ingrese su edad: "));
            height=Float.parseFloat(JOptionPane.showInputDialog("Alumno: "+ i +" Ingrese su altura: "));

            sum_year+=years;
            sum_height+=height;

            if(years>18){
                count_year++;
            }
            if(height>1.75){
                count_height++;
            }


        }
        average_years=(float)sum_year/5;
        average_height=(float)sum_height/5;

        System.out.println("La edad media de los estudiantes es: "+average_years+" años.");
        System.out.println("La estatura media de los estudiantes es: "+average_height+" metros.");
        System.out.println("La cantidad de estudiantes mayores de 18 años es: "+count_year);
        System.out.println("La cantidad de estudiantes que miden más de 1.75 mts es: "+count_height);

    }
}
