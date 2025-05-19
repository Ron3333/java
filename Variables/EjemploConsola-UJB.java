import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        // Introducir valores por Consola
        var consola = new Scanner(System.in);//in - input - entrada de datos
        System.out.println("Escribe tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
    }
}
