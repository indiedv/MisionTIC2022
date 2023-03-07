package TJAVA.POO.Operation3;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        Operation op=new Operation();        
        System.out.println("La suma es: "+op.add(num1, num2));
        System.out.println("La resta es: "+op.substract(num1, num2));
        System.out.println("La multiplicación es: "+ op.multiply(num1, num2));
        System.out.println("La división es: "+op.divide(num1, num2));
        
    }
}