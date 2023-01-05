/*Realizar un juego para adivinar un número. Para ello generar un número aleatorio emtre 0-100,
luego ir pidiendo números indicando "es mayor" o "es menor" según sea mayor o menor con respecto a N. El proceso termina
 cuando el usuario acierta y mostrar el número de intentos*/
package Loops;

import javax.swing.*;

public class Exercise5 {
    public static void main (String[]args){
        int num,attempt=0,nrandom;
        nrandom=(int)(Math.random()*100);

        do{
            num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número"));
            if(nrandom>num){
                System.out.println("Ingrese un número mayor");
            }
            else {
                System.out.println("Digite un número menor");
            }
            attempt++;
        }while (num!=nrandom);
        System.out.println("Haz adivinado el número en: "+attempt+" intentos");
    }
}
