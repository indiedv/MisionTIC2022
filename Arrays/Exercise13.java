/*Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares de la primera
* y a continuación los elementos impares*/
package Arrays;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int nums1[]=new int[10], counteven=0,countodd=0;
        System.out.println("Guardando datos...");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+". Digite un número: ");
            nums1[i]=entry.nextInt();

            if(nums1[i]%2==0){
                counteven++;
            }
            else {
                countodd++;
            }
        }
        int even[]=new int[counteven];
        int odd[]=new  int[countodd];
        counteven=0; countodd=0;
        for(int i=0;i<10;i++){
            if(nums1[i]%2==0){
                even[counteven]=nums1[i];
                counteven++;
            }
            else{
                odd[countodd]=nums1[i];
                countodd++;
            }
        }
        System.out.println("\nEl arreglo de los pares es: ");
        for(int i=0;i<counteven;i++){
            System.out.print(even[i]+" ");
        }
        System.out.println("\nEl arreglo de los impares es: ");
        for(int i=0;i<countodd;i++) {
            System.out.print(odd[i] + " ");
        }
    }
}
