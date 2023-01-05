/*Pedir un número N, introducir N sueldos y mostrar el sueldo máximo*/
package Loops;

import javax.swing.*;

public class Exercise20 {
    public static void main(String[] args) {
        int numsalary;
        float salary,maxsalary=0;
        numsalary=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de salarios a ingresar:"));
        for(int i=1;i<=numsalary;i++){
            salary=Float.parseFloat(JOptionPane.showInputDialog("Ingrese salario "+i+" : "));

            if (salary>maxsalary){
                maxsalary=salary;
            }
        }
        System.out.println("El sueldo máximo es: "+maxsalary);

    }
}
