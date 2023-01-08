/*Leer los datos correspondientes a dos tablas de 12 elementos numéricos y mezclarlos en una tercera
* de la forma: 3 elementos tabla A, 3 de la tabla B otros 3 de A y otros 3 de B*/
package Arrays;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int TA[] = new int[12], TB[] = new int[12], TC[] = new int[24];
        System.out.println("\nGuardando los datos Tabla A");

        for (int i = 0; i < 12; i++) {
            System.out.print("A" + (i + 1) + ". Ingrese un número: ");
            TA[i] = entry.nextInt();
        }

        System.out.println("\nGuardando los datos Tabla B");
        for (int i = 0; i < 12; i++) {
            System.out.print("B" + (i + 1) + ". Ingrese un número: ");
            TB[i] = entry.nextInt();
        }
        int i = 0, j = 0;
        while (i < 12) {
            for (int k = 0; k < 3; k++) {
                TC[j] = TA[i + k];
                j++;
            }
            for (int k = 0; k < 3; k++) {
                TC[j] = TB[i + k];
                j++;
            }
            i+=3;
        }
        System.out.println("\nLa Tabla C es: ");
        for( i=0;i<24;i++){
            System.out.print(TC[i]+" ");
        }
    }
}
