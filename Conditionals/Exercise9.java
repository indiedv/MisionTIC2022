/*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta o incorrecta.
Suponiendo que todos los meses son de 30 días*/
package Conditionals;

import javax.swing.*;

public class Exercise9 {
    public static void main(String[]args){
        int day,month,year;

        day=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el día:"));
        month=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el mes:"));
        year=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el año:"));

        if ((day>=1)&&(day<=30)){
            if((month>=1)&&(month<=12)){
                if(year!=0){
                    JOptionPane.showMessageDialog(null,"Fecha correcta");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Fecha incorrecta, año incorrecto");
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"Fecha incorrecta, mes incorrecto");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Fecha incorrecta, día incorrecto");
        }
    }
}
