//Sobrecarga de constructores
public class Main {
    public static void main (String[]args) {
        Informador informador = new Informador();
        informador.mostrarporPantalla(3);
        byte unByte = 2;
        informador.mostrarporPantalla(unByte);//Promocionado
        informador.mostrarporPantalla(5.3);
        informador.mostrarporPantalla("Hola", Informador.COLOR_ROJO);
        informador.mostrarporPantalla("Hola", Informador.COLOR_VERDE);
        informador.mostrarporPantalla("Hola", Informador.COLOR_NEGRO);
        informador.mostrarporPantalla("Hola", Informador.COLOR_AMARILLO);
        informador.mostrarporPantalla("Hola", Informador.COLOR_AZUL);
        informador.mostrarporPantalla("Hola");
    }

}