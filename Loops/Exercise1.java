/*Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo*/
package Loops;

import javax.swing.*;

public class Exercise1 {
    public static void main(String[]args){
        int num,npow;
        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));
        while (num>=0){
            npow=(int) Math.pow(num,2);
            JOptionPane.showMessageDialog(null,"El número "+num+" al cuadrado es: "+npow);
            num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese otro número: "));
        }
    }
}
