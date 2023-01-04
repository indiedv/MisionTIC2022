/*Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayúscula o minúscula*/
package Conditionals;

import javax.swing.*;

public class Exercise3 {
    public static void main(String[] args){
        char chart;

        chart= JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        if (Character.isUpperCase(chart)) {
            JOptionPane.showMessageDialog(null, "Esta letra es mayúscula");
        }
            else{
                JOptionPane.showMessageDialog(null,"Esta letra es minúscula.");
            }
        }

    }
