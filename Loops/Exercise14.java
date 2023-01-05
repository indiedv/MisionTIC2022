/*Pedir 10 sueldos. Mostrar su suma y cuántos hay mayores de $1000*/
package Loops;

import javax.swing.*;

public class Exercise14 {
    public static void main(String[]args) {
       float salary=0, sumsalary=0;
       int onethousand=0;

        for (int i = 1; i <= 10; i++) {
            salary=Float.parseFloat (JOptionPane.showInputDialog("Ingrese un salario: "));

            if(salary>1000){
                onethousand++;
            }
            sumsalary+=salary;
        }
        System.out.println("La suma de salarios es: "+sumsalary);
        System.out.println("Los salarios mayores a $1000 son: "+onethousand);
        }
    }
