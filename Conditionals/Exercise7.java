/*Pedir tres números y mostrarlos ordenados de mayor a menor*/

package Conditionals;

import javax.swing.*;

public class Exercise7 {
    public static void main(String[] args) {
        int num1, num2, num3, a, b, c;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número:"));

        if ((num1 > num2) && (num2 > num3)) {
            JOptionPane.showMessageDialog(null, "Orden:" + num1 + " " + num2 + " " + num3);
        } else if ((num1 > num3) && (num3 > num2)) {
            JOptionPane.showMessageDialog(null, "Orden:" + num1 + " " + num3 + " " + num2);
        } else if ((num2 > num1) && (num1 > num3)) {
            JOptionPane.showMessageDialog(null, "Orden:" + num2 + " " + num1 + " " + num3);
        } else if ((num2 > num3) && (num3 > num1)) {
            JOptionPane.showMessageDialog(null, "Orden:" + num2 + " " + num3 + " " + num1);
        } else if ((num3 > num1) && (num1 > num2)) {
            JOptionPane.showMessageDialog(null, "Orden:" + num3 + " " + num1 + " " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "Orden:" + num3 + " " + num2 + " " + num1);
        }
    }
}
