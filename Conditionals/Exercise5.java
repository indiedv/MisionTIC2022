/*Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
* - Si trabaja 40 horas o menos se le paga $16 por hora
* - Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra*/
package Conditionals;

import javax.swing.*;

public class Exercise5 {
    public static void main(String[] args){
        float hours, totalpay;

        hours=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese las horas trabajadas:")) ;
        if(hours <= 40){
            totalpay=16*hours;
            JOptionPane.showMessageDialog(null,"El salario a pagar es: $" +totalpay);
        }
        else{
            totalpay=(16*40)+((hours-40)*20);
            JOptionPane.showMessageDialog(null,"El salario a pagar es: $" +totalpay);
        }
    }
}
