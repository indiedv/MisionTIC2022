/*Pedir números hasta que se teclee uno negativo, mostrar cuántos números se han introducido*/
package Loops;

import javax.swing.*;

public class Exercise4 {
    public static void main(String[]args){
        int num,counter=0;
        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número: "));
        while (num>=0){
            counter++  ;
            num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese otro número: "));
        }
        System.out.println("Ha ingresado "+counter+" números positivos");






    }
}
