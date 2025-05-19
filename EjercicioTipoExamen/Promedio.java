import java.util.Scanner;
/*
Desarrollar un programa en Java que:

1- Permita al usuario especificar dinámicamente la cantidad de notas a evaluar

2- Solicite el ingreso de cada una de las notas (valores entre 0 y 20)

3- Implemente validación robusta que:

    Asegure que solo se acepten valores numéricos

    Verifique que las notas estén dentro del rango permitido (0-20)

    No avance a la siguiente nota hasta que la actual sea válida

4- Calcule y muestre:

    El promedio aritmético con 2 decimales de precisión

    La nota máxima obtenida
*/

public class Promedio {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        System.out.println("PROMEDIO DE NOTAS");
        System.out.println("---------------------------------");

        System.out.print("Proporciona la cantidad de notas: ");
        int cantidadNotas = Integer.parseInt(consola.nextLine());
        int[] enteros = new int[cantidadNotas];
        
        // Ingreso dinámico de notas
        System.out.println("Ingrese las notas (0-20):");

        for(int i = 0; i < cantidadNotas; ) { 
            System.out.print("Proporciona valores enteros[" + i + "] = ");
     
            String numeroStr = consola.nextLine();
            int nota = Integer.parseInt(numeroStr);

            if (nota >= 0 && nota <= 20) {
                enteros[i] = nota;
                i++; // Solo incrementamos cuando la nota es válida
            } else {
                System.out.println("Error: La nota debe estar entre 0 y 20");
            }
           
        }

        double suma = 0;
        double notaMaxima = enteros[0]; 

        for (int i = 0; i < cantidadNotas; i++) {
            suma += enteros[i]; 
            if (enteros[i] > notaMaxima) { 
                notaMaxima = enteros[i];
            }
        }

        double promedio = suma / cantidadNotas;

        System.out.println("Promedio: "+ promedio); 
        System.out.println("Nota mas alta: " + notaMaxima);

        consola.close();
    }
}