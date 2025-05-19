import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        // definir las variables limites
        final int MINIMO = 0;
        final int MAXIMO = 5;
        // Solicitamos un valor entre 0 y 5
        var consola = new Scanner(System.in);
        System.out.print("Proporciona un dato entre 0 y 5: ");
        // Verificar si el dato esta dentro de rango
        var dato = Integer.parseInt(consola.nextLine());
        var dentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("Valor dentro rango? : " + dentroRango);
    }
}
