/*Pedir una nota de 0 a 10 y mostrarla de la forma Insuficiente, Suficiente, Bien, Notable y Sobresaliente*/
package Conditionals;

import javax.swing.*;

public class Exercise12 {
    public static void main(String [] args){
        int note;
        note=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la nota: "));

        switch (note){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: JOptionPane.showMessageDialog(null, "Insuficiente"); break;
            case 5: JOptionPane.showMessageDialog(null, "Suficiente"); break;
            case 6: JOptionPane.showMessageDialog(null, "Bien"); break;
            case 7:
            case 8: JOptionPane.showMessageDialog(null, "Notable"); break;
            case 9:
            case 10:JOptionPane.showMessageDialog(null, "Sobresaliente"); break;
            default:JOptionPane.showMessageDialog(null, "Error"); break;
        }
    }
}
