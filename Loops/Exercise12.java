/*Pedir un número y calcular su factorial N!=1*2*3*N*/
package Loops;

import javax.swing.*;

public class Exercise12 {
    public static void main(String[]args){
        int num;
        long factorial=1;
        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese número: "));
        for(int i=1;i<=num;i++){
            factorial*=i;
        }
        System.out.println("El factorial del número: "+num+" es:  "+factorial);
    }
}
