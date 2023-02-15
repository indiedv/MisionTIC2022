package ClasesObjetos;

public class Car {
    String color,marca;
    int km;

    public static void main(String[] args) {
        Car car1=new Car();
        car1.color="Black";
        car1.marca="Audi";
        car1.km=0;

        System.out.println("\nEl primer carro disponible es...");
        System.out.println("El color del carro es: "+car1.color);
        System.out.println("La marca es: "+car1.marca);
        System.out.println("El kilometraje es: "+car1.km+ "km");

        Car car2=new Car();
        car2.color="Red";
        car2.marca="Ferrari";
        car2.km=0;

        System.out.println("\nEl segundo carro disponible es...");
        System.out.println("El color del carro es: "+car2.color);
        System.out.println("La marca es: "+car2.marca);
        System.out.println("El kilometraje es: "+car2.km+ "km");
    }
}
