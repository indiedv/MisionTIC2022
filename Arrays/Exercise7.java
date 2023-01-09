/*Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están
* ordenados de forma creciente o decreciente o si están ordenados*/
package Arrays;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int arrayn[]=new int[10];
        boolean decresing=false,increasing=false;
        System.out.println("\nGuardando los datos del array...");
        for (int i=0; i<10;i++){
            System.out.print((i+1)+". Ingrese un número: ");
            arrayn[i]=entry.nextInt();
        }
            for(int i=0;i<9;i++){
                if(arrayn[i]<arrayn[i+1]){
                    increasing=true;
                }
                if (arrayn[i]>arrayn[i+1]){
                    decresing=true;
                }
            }
            if(increasing==true && decresing==false){
                System.out.println("\nEl array es Creciente");
            }
            else if(decresing==true && increasing==false){
                System.out.println(" \nEl array es Decreciente");
            }
            else if(increasing==true && decresing==true) {
                System.out.println("\nLos números están desordenados");
            }
            else if(increasing==false && decresing==false){
                System.out.println("\n Los números son iguales");
            }
    }
}
