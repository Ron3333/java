import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        System.out.println("*** Calculadora en Java ***");
        var salir = false;
        double operando1 =0, operando2 = 0, resultado = 0;
        var consola = new Scanner(System.in);
        while(!salir){
            System.out.print("""
                    Menu:
                    1. Sumar
                    2. Restar
                    3. Multiplicar
                    4. Dividir
                    5. Salir
                    Escoge una opcion:\s""");
            var opcion = Integer.parseInt(consola.nextLine());
            // Solicitamos los valores
            if(opcion >= 1 && opcion <= 4){
                System.out.print("Dame el valor 1: ");
                operando1 = Double.parseDouble(consola.nextLine());
                System.out.print("Dame el valor 2: ");
                operando2 = Double.parseDouble(consola.nextLine());
            }
            // Revisamos el tipo de operacion a realizar
            switch(opcion){
                case 1 -> { // Sumar
                    resultado = operando1 + operando2;
                    System.out.println("Resultado sumar: " + resultado);
                }
                case 2 -> { // Restar
                    resultado = operando1 - operando2;
                    System.out.println("Resultado restar: " + resultado);
                }
                case 3 -> { // Multiplicar
                    resultado = operando1 * operando2;
                    System.out.println("Resultado multiplicar: " + resultado);
                }
                case 4 -> { // Dividir
                    if(operando2 >0){
                        resultado = operando1 / operando2;
                        System.out.println("Resultado restar: " + resultado);
                    }
                    else
                        System.out.println("No se permite division entre cero");
                }
                case 5 -> {
                    System.out.println("Saliendo del programa. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida: " + opcion);
            }
            System.out.println();
        }
    }
}
