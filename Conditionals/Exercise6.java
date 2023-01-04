/*Hacer un programa que tome dos números y diga si ambos son pares o impares*/
package Conditionals;

import javax.swing.*;

public class Exercise6 {
    public static void main(String[]args){
        int num1,num2;

        num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer número: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo número: "));

        if((num1%2==0)&&(num2%2==0)){
            JOptionPane.showMessageDialog(null,"Ambos números son pares");
        }
        else if ((num1%2 !=0) &&(num2%2 !=0)){
            JOptionPane.showMessageDialog(null,"Los números son impares");
        }
        else {
            JOptionPane.showMessageDialog(null,"Un número es impar y el otro par");
        }
    }
}
