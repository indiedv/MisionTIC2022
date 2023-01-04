/*Pedir un número entre 0 y 99999 y decir cuántas cifras tiene*/
package Conditionals;

import javax.swing.*;

public class Exercise8 {
    public static void main(String[]args){
        int num;
        num= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));

        if (num<10){
            JOptionPane.showMessageDialog(null, "El número tiene una cifra");
        }
        else if (num<100){
            JOptionPane.showMessageDialog(null,"El número contiene dos cifras");
        }
        else if (num<1000){
            JOptionPane.showMessageDialog(null,"El número contiene tres cifras");
        }
        else if (num<10000){
            JOptionPane.showMessageDialog(null,"El número contiene cuatro cifras");
        }
        else if (num<100000){
            JOptionPane.showMessageDialog(null,"El número contiene cinco cifras");
        }
        else{
            JOptionPane.showMessageDialog(null,"Número fuera de rango, Ingrese un número de 0 a 99.999");
        }

    }
}
