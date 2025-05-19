import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("*** Presentate ***");
        System.out.print("Nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.print("Hijo unico? ");
        var hijoUnico = Boolean.parseBoolean(consola.nextLine());
        System.out.print("Bebida Favorita: ");
        var bebida = consola.nextLine();
        System.out.print("Precio Bebida Favorita: ");
        var precioBebida = Float.parseFloat(consola.nextLine());
        // Imprimir los valores
        System.out.println("Valores recibidos: ");
        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + edad);
        System.out.println("hijoUnico = " + hijoUnico);
        System.out.println("bebida = " + bebida);
        System.out.println("precioBebida = " + precioBebida);

    }
}
