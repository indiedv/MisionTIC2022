/*Leer números hasta que se introduzca un 0. Indicar si es par o impar*/
package Loops;

import javax.swing.*;

public class Exercise3 {
    public static void main(String[]args){
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número:"));
        while (num!=0){
            if(num%2==0){
                System.out.println("El número "+num+" es par");
            }else {
                System.out.println("El número "+num+" es impar");
            }
            num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese otro número:"));
        }
    }
}
