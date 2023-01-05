/*Pedir 10 números, y mostrar al final si se ha introducido alguno negativo*/
package Loops;

import javax.swing.*;

public class Exercise21 {
    public static void main(String[] args) {
        int num;
        boolean negatives=false;

        for(int i=1;i<=10;i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

            if(num<0){
                negatives=true;
            }
        }
        if(negatives==true){
            System.out.println("Existe al menos un número negativo");
        }
        else{
            System.out.println("No hay números negativos");
        }
    }
}
