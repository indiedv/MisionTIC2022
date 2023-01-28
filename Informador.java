//Sobrecarga de constructores
public class Informador {
    public static final String COLOR_POR_DEFECTO = "\u001B[0m";
    public static final String COLOR_NEGRO = "\u001B[30m";
    public static final String COLOR_ROJO = "\u001B[31m";
    public static final String COLOR_VERDE = "\u001B[32m";
    public static final String COLOR_AMARILLO = "\u001B[33m";
    public static final String COLOR_AZUL = "\u001B[34m";
    void mostrarporPantalla(int entero) {
        System.out.println("Mostrando el entero: " +entero);
    }
    void mostrarporPantalla(double decimal) {
        System.out.println("Mostrando el decimal: " +decimal);
    }
    void mostrarporPantalla(String texto) {
        System.out.println("Mostrando el string: " +texto);
    }
    void mostrarporPantalla(String texto,String color) {
        System.out.println(color + "Mostrando el Texto con color: " +texto +COLOR_POR_DEFECTO);
    }

}
