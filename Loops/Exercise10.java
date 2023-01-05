/*Pedir 10 números y escribir la suma total*/
package Loops;

import javax.swing.*;

public class Exercise10 {
    public static void main(String[]args){
        int num,i,sum=0;
        for(i=0;i<10;i++){
            num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número"));
            sum+=num;
        }
        System.out.println("La suma de los números es: "+sum);

    }
}
