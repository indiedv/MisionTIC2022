package TJAVA.POO.Operation3;

public class Operation {
    int addition, substraction, times, divided;

    public int add(int num1, int num2){
        addition=num1+num2;
        return addition;        
    }
    public int substract(int num1, int num2){
        substraction=num1-num2;
        return addition;
    }
    public int multiply(int num1, int num2){
        times=num1*num2;    
        return addition;    
    }
    public int divide(int num1, int num2){
        divided=num1/num2;   
        return addition;     
    }
    public void print(){
        System.out.println("La suma es: "+addition);
        System.out.println("La resta es: "+substraction);
        System.out.println("La multiplicación es: "+times);
        System.out.println("La división es: "+divided);
    }    
}

