package TJAVA.POO.Operation;

import javax.swing.JOptionPane;

public class Operation {
    int num1, num2, addition, substraction, times, divided;

    public void readNumbers(){
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
    }
    public void add(){
        addition=num1+num2;
    }
    public void substract(){
            substraction=num1-num2;
    }
    public void multiply(){
        times=num1*num2;
    }
    public void divide(){
        divided=num1/num2;
    }
    public void print(){
        System.out.println("La suma es: "+addition);
        System.out.println("La resta es: "+substraction);
        System.out.println("La multiplicación es: "+times);
        System.out.println("La división es: "+divided);

    }
    
}
