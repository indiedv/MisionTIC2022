/*Ingresar un número e identificar si es positivo o negativo hasta que ingrese el 0*/
package Loops;

import javax.swing.*;

public class Exercise2 {
    public static void main(String[]args){
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número"));
        while (num!=0){
            if(num>0){
                JOptionPane.showMessageDialog(null,"EL número "+num+" es positivo");
            }
            else {
                JOptionPane.showMessageDialog(null,"EL número "+num+" es negativo");
            }
            num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número"));
        }

    }
}
