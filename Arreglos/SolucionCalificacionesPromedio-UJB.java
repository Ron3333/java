import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        System.out.println("*** Promedio de Calificaciones ***");
        var consola = new Scanner(System.in);
        System.out.print("Cuantas Calificaciones deseas agregar? ");
        var totalCalificaciones = Integer.parseInt(consola.nextLine());
        // Creamos el arreglo
        int[] calificaciones = new int[totalCalificaciones];
        // Solicitamos los valores del arreglo
        for(int i=0; i < totalCalificaciones; i++){
            System.out.print("Calificacion[" + i + "] = ");
            calificaciones[i] = Integer.parseInt(consola.nextLine());
        }
        // Obtener el promedio de calificaciones
        var sumaPromedios = 0;
        for(int i=0; i < totalCalificaciones; i++){
            sumaPromedios += calificaciones[i];
        }
        var promedio = sumaPromedios / totalCalificaciones;
        System.out.println("\nPromedio de las Calificaciones: " + promedio);
    }
}
