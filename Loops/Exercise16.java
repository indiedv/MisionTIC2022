/*Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número*/
package Loops;

import javax.swing.*;

public class Exercise16 {
    public static void main(String[] args) {
        int num;
        do {
            num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número del 0 al 10: "));
        }while(num<0||num>10);

        System.out.println("La tabla de multiplicar del número "+num+" es:");
        for(int i=0;i<=12;i++){
            System.out.println(num+" * "+i+" = "+num*i);

        }
        }
}
