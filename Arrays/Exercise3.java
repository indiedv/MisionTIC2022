/*Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar la media de los números
* positivos, la media de los números negativos y contar con el número de ceros*/
package Arrays;

import javax.swing.*;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        float negativeaverage,positiveaverage,sumnegatives=0,sumpositives=0,numbers[] =new float[5];
        int posotivelements=0,negativeelements=0,zeros=0;
        System.out.println("Guardando los números: ");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+" Ingrese un número: ");
            numbers[i]=entry.nextFloat();

            if (numbers[i]==0){
                zeros++;
            }
            else if(numbers[i]>0) {
                sumpositives+=numbers[i];
                posotivelements++;
            }
            else {
                sumnegatives+=numbers[i];
                negativeelements++;
            }
        }
        if (negativeelements==0){
            System.out.println("No se puede sacar la media de números negativos");
        }
        else {
            System.out.println("La media de los números negativos es: "+(negativeaverage=sumnegatives/negativeelements));
        }
        if (posotivelements==0){
            System.out.println("No se puede sacar la media de números positivos");
        }
        else {
            System.out.println("La media de los números positivos es: "+(positiveaverage=sumpositives/posotivelements));
        }

        System.out.println("El número de ceros es: "+zeros);
    }
}