/*Hacer un programa que lea un numero entero y muestre si el número es múltiplo de 10*/
package Conditionals;

import javax.swing.*;

public class Exercise1 {
    public static void main(String[]args){
        int number;
        String msj;
        number= Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número: "));
        msj=(number%10==0)?"Es múltiplo de 10":"No es múltiplo de 10";
        JOptionPane.showMessageDialog(null,msj);
    }
}
