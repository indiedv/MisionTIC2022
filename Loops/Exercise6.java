/*Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos*/
package Loops;

import javax.swing.*;

public class Exercise6 {
    public static void main(String[]args){
        int num,sum=0;

        do{
            num= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número"));
            sum+=num;
        }while (num!=0);
        System.out.println("La suma es: "+sum);
    }
}
