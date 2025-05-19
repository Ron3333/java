import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
       // Calculo area de un rectangulo
        var consola = new Scanner(System.in);
        System.out.print("Proporciona la base: ");
        var base = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona la altura: ");
        var altura = Integer.parseInt(consola.nextLine());
        // Realizamos el calculo del area
        var areaRectangulo = base * altura;
        System.out.println("Area rectangulo: " + areaRectangulo);
        // Calculo perimetro de un rectangulo
        var perimetroRectangulo = (base + altura) * 2;
        System.out.println("Perimetro rectangulo: " + perimetroRectangulo);

    }
}
