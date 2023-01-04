/*Construir un programa que simule el funcionamiento de una calculadora que puede realizar las
* cuatro operaciones aritméticas básicas (suma,resta, producto y división) con valores numéricos enteros.
* El usuario debe especificar la operación con el primer caracter del primer parámetro de la línea de comandos:
* S o s para suma, R o r resta, P o p o M o m para producto, y D o d para la división*/
package Conditionals;

import javax.swing.*;

public class Exercise11 {
    public static void main(String[]args){
        int num1,num2,plus,minus,times,divided;
        char operation;

        num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer número"));
        num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo número"));
        operation=JOptionPane.showInputDialog(null,"Ingrese la operación a realizar").charAt(0);


        switch (operation){
            case's':
            case'S':plus=num1+num2;
                    JOptionPane.showMessageDialog(null,"La suma de los números es: "+plus);
                    break;
            case'r':
            case 'R': minus=num1-num2;
                    JOptionPane.showMessageDialog(null,"La resta de los números es: "+minus);
                    break;
            case 'P':
            case 'p':
            case 'M':
            case 'm':times=num1*num2;
                    JOptionPane.showMessageDialog(null,"La multiplicación de los números es: "+times);
                    break;
            case 'd':
            case'D': divided=num1/num2;
                    JOptionPane.showMessageDialog(null,"La División de los números es: "+divided);
                    break;
            default:JOptionPane.showMessageDialog(null,"Error, operación seleccionada incorrecta");break;

        }

    }
}
