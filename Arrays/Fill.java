package Arrays;

import javax.swing.*;
import java.util.Scanner;

public class Fill {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int elements;
        elements=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos del arreglo: "));

        char[] letters=new char[elements];

        System.out.println("Ingrese los elementos del arreglo");
        for(int i=0;i<elements;i++){
            System.out.println((i+1)+" Digite un caracter: ");
            letters[i]=entry.next().charAt(0);
        }
        System.out.println("Los caracteres del arreglo son: ");
        for (int i=0;i<elements;i++){
            System.out.print(letters[i]+" ");
        }
    }
}
