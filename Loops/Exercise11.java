/*Diseñar un programa que muestre el producto de los 10 primeros números impares*/
package Loops;

public class Exercise11 {
    public static void main(String[]args){
        long times=1;
        for(int i=1;i<=20;i+=2){
            times*=i;
        }
        System.out.println("El producto de los números es: "+times);


    }
}
