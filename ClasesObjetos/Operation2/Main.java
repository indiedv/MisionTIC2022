package TJAVA.POO.Operation2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        Operation op=new Operation();        
        op.add(num1, num2);
        op.substract(num1, num2);
        op.multiply(num1, num2);
        op.divide(num1, num2);
        op.print();
        
    }
}
