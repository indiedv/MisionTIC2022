/*Pedir día, mes y año de una fecha e indicar si la fecha es correcta.
* Con meses de 28, 30 y 31 días. Sin años bisiestos*/
package Conditionals;

import javax.swing.*;

public class Exercise10 {
    public static void main(String[]args){
        int day,month,year;
        day=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el día:"));
        month=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el mes:"));
        year=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el año:"));

        if (year==0){
            JOptionPane.showMessageDialog(null,"Fecha incorrecta");
        }
        if((month==2)&&(day>=1 && day<=28)){
            JOptionPane.showMessageDialog(null,"Fecha correcta");
        }
        else if((month==4 || month==6 || month==9 || month==11)&&(day>=1 && day<=30)){
            JOptionPane.showMessageDialog(null,"Fecha correcta");
        }
        else if((month==1 || month==3 || month==5 || month==7 || month==8 || month==12)&&(day>=1 && day<=31)){
            JOptionPane.showMessageDialog(null,"Fecha correcta");
        }
        else {
            JOptionPane.showMessageDialog(null,"Fecha incorrecta");
        }
    }
}
