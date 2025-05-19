import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
       // Introducir valores a un arreglo
        var consola = new Scanner(System.in);
        // Declarar el arreglo
        System.out.print("Proporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        // Creamos de manera dinamica el arreglo
        int[] enteros = new int[largoArreglo];
        //Solicitamos los valores del arreglo
        for(int i=0; i < largoArreglo; i++){
            System.out.print("Proporciona enteros[" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }
        // Imprimir los valores del arreglo
        System.out.println("\nImpresion del Arreglo: ");
        for(int i=0; i < largoArreglo; i++){
            System.out.println("enteros[" + i + "] = " + enteros[i]);
        }
    }
}
