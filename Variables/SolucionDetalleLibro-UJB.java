import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
      // Ejemplo Detalle de un Libro
        var consola = new Scanner(System.in);
        // solicitamos el titulo
        System.out.print("Proporciona el titulo: ");
        var titulo = consola.nextLine();
        System.out.print("Proporciona el autor: ");
        var autor = consola.nextLine();
        // Concatenacion
        //var resultado = titulo + " fue escrito por " + autor;
        System.out.println(titulo + " fue escrito por " + autor);

    }
}
