/*Pedir números hasta que se introduzca uno negativo, y calcular la media*/
package Loops;

import javax.swing.*;

public class Exercise7 {
    public static void main(String[]args){
        int num,elements=0,sum=0;
        float media;
        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número"));
        while (num>=0){
            sum+=num;
            elements++;
            num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número"));
        }
        if(elements==0){
            System.out.println("Error. La media entre cero no es posible");
        }
        else{
            media=(float) sum/elements;
            System.out.println("La media de los números es: "+media);
        }
    }
}
