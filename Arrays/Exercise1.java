/*leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden introducido*/
package Arrays;

import javax.swing.*;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        float numbers[]=new float[5];
        System.out.println("Guardando los datos del arreglo");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+". Digite un número: ");
            numbers[i]=entry.nextFloat();
        }
        System.out.println("Imprimir los elementos del arreglo");
        for(float i:numbers){
            System.out.println(i);
        }
    }
}
