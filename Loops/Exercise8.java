/*Pedir un número N y mostrar todos los números del 1 al N*/
package Loops;

import javax.swing.*;

public class Exercise8 {
    public static void main(String[]args){
        int num,i=1;
        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número"));
        while (i<=num){
            System.out.println(i);
            i++;
        }

    }
}
