package Conditionals;

import javax.swing.*;

public class Introduction {
    public static void main(String[]args){
        int number, dato = 5;
        number=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        if (number==dato){
            JOptionPane.showMessageDialog(null,"El número es 5");
        }
        else {
            JOptionPane.showMessageDialog(null,"Es otro número");
        }
    }
}
