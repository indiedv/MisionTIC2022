/*Leer dos series de 10 enteros que estarán ordenados crecientemente
* Copiar, fusionar las dos tablas en una tercera, de forma que sigan ordenados*/
package Arrays;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int[] numsa =new int[10],numsb =new int[10],numsc =new int[20];
        boolean increasing = true;

        System.out.println("Ingrese el primer array: ");
        do {
            for(int i=0;i<10;i++){
                System.out.print((i+1)+". Ingrese un número: ");
                numsa[i]=entry.nextInt();
            }
            for (int i=0;i<9;i++){
                if(numsa[i]<numsa[i+1]){
                    increasing=true;
                }
                if(numsa[i]>numsa[i+1]){
                    increasing=false;
                    break;
                }
            }
            if(!increasing){
                System.out.println("\nEl array está desordenado, vuelva a ingresar los datos");
            }
        }while (!increasing);

        System.out.println("Ingrese el segundo array: ");
        do {
            for(int i=0;i<10;i++){
                System.out.print((i+1)+". Ingrese un número: ");
                numsb[i]=entry.nextInt();
            }
            for (int i=0;i<9;i++){
                if(numsb[i]<numsa[i+1]){
                    increasing=true;
                }
                if(numsb[i]>numsb[i+1]){
                    increasing=false;
                    break;
                }
            }
            if(!increasing){
                System.out.println("\nEl array está desordenado, vuelva a ingresar los datos");
            }
        }while (!increasing);

        int countnuma=0,countnumb=0,countnumc=0;

        while (countnuma<10 && countnumb<10){
            if(numsa[countnuma]<numsb[countnumb]){
                numsc[countnumc]=numsa[countnuma];
                countnuma++;
            }
            else {
                numsc[countnumc]=numsb[countnumb];
                countnumb++;
            }
            countnumc++;
        }
        if(countnuma==10){
            while(countnumb<10){
                numsc[countnumc]=numsb[countnumb];
                countnumb++;
                countnumc++;
            }
        }
        else{
            while (countnuma<10){
                numsc[countnumc]=numsa[countnuma];
                countnuma++;
                countnumc++;
            }
        }
        System.out.println("\nEl array completo es:");
        for (countnumc=0;countnumc<20;countnumc++){
            System.out.print(numsc[countnumc]+" ");
        }
        System.out.print(" ");
    }
}
