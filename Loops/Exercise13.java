/*Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos
* y la cantidad de ceros*/
package Loops;

import javax.swing.*;

public class Exercise13 {
    public static void main(String[]args){
        int num,plus_sum=0,plus_elements=0,minus_sum=0,minus_element=0,zeroscount=0;
        float plus_average,minus_average;

        for(int i=1;i<=10;i++){
            num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

            if(num==0){
                zeroscount++;
            }
            else if(num>0){
                plus_elements++;
                plus_sum+=num;
            }
            else{
                minus_element++;
                minus_sum+=num;
            }
        }
        if (plus_elements==0){
            System.out.println("No existen números positivos");
        }
        else{
            plus_average=(float)plus_sum/plus_elements;
            System.out.println("La media de los números positivos es: "+plus_average);
        }
        if(minus_element==0){
            System.out.println("No existen números negativos");
        }
        else{
            minus_average=(float)minus_sum/minus_element;
            System.out.println("La media de los números negativos es: "+minus_average);
        }
        System.out.println("La cantidad de ceros es: "+zeroscount);
    }
}
