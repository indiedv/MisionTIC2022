package Conditionals;

import javax.swing.*;

public class Ternario {
    public static void main(String[]args){
        int number;
        String msj;
        number=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        msj=(number%2==0)?"Es par" : "Es impar";
        JOptionPane.showMessageDialog(null,msj);

    }
}
