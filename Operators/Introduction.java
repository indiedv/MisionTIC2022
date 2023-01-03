package Operators;

import javax.swing.*;

//program to input and output in JOptionPane
public class Introduction {
    public static void main(String [] args){
        String string;
        int integer;
        char chart;
        double decimal;

        string = JOptionPane.showInputDialog("Digite un texto: ");
        integer = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        chart =  JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));

        JOptionPane.showMessageDialog(null,"la cadena es: "+string);
        JOptionPane.showMessageDialog(null,"El entero es: "+integer);
        JOptionPane.showMessageDialog(null,"la letra es: "+chart);
        JOptionPane.showMessageDialog(null,"El decimal es: "+decimal);



    }
}
