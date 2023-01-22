/*Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
* Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer
* trimestre de un grupo. Debemos mostrar al final: la nota media del grupo en cada trimestre y la media
* del alumno que se encuentra en la posición N (N se lee por teclado)*/
package Arrays;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int students[]=new int[5],position;
        float nFirst[]=new float[5],nSecond[]=new float[5],nThird[]=new float[5];
        float sumFirst=0,sumSecond=0,sumThird=0,averageS,averageF,averageT,sumStudent=0,averageSt;

        System.out.println("\nIngrese las notas del primer trimestre");
        for(int i=0;i<5;i++){
            System.out.print("Alumno ["+i+"] ");
            nFirst[i]=entry.nextFloat();
            sumFirst+=nFirst[i];
        }
        System.out.println("\nIngrese las notas del segundo trimestre");
        for(int i=0;i<5;i++) {
            System.out.print("Alumno [" + i + "]: ");
            nSecond[i] = entry.nextFloat();
            sumSecond+=nSecond[i];
        }
        System.out.println("\nIngrese las notas del tercer trimestre");
        for(int i=0;i<5;i++) {
            System.out.print("Alumno [" + i + "]: ");
            nThird[i] = entry.nextFloat();
            sumThird+=nThird[i];
        }
        averageF = sumFirst / 5;
        averageS = sumSecond/5;
        averageT = sumThird/5;
        do {
            System.out.print("\nIngrese el número del alumno que quiere conocer el promedio entre 0 y 4");
            position=entry.nextInt();
        }while (position<0||position>4);

        sumStudent=nFirst[position]+nSecond[position]+nThird[position];
        averageSt=sumStudent/3;

        System.out.print("\nLa nota media del Grupo en el primer trimestre es: "+averageF);
        System.out.print("\nLa nota media del Grupo en el segundo trimestre es: "+averageS);
        System.out.print("\nLa nota media del Grupo en el tercer trimestre es: "+averageF);
        System.out.print("\nLa nota del alumno: "+position+" es: "+averageSt);
    }
}
