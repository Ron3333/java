import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Calculadora");
        System.out.println("--------------------------------");
        System.out.println("Operaciones disponibles:");
        System.out.println("1. Suma (+)");
        System.out.println("2. Resta (-)");
        System.out.println("3. Multiplicacion (*)");
        System.out.println("4. Division (/)");
  
        // Solicitar operación
        System.out.print("Elige una operacion (1-4): ");
        String operacion = consola.nextLine();
        
        // Solicitar números como String
        System.out.print("Introduce el primer numero: ");
        String num1Str = consola.nextLine();
        double num1 = Double.parseDouble(num1Str);
        
        System.out.print("Introduce el segundo numero: ");
        String num2Str = consola.nextLine();
        double num2 = Double.parseDouble(num2Str);
        
        double resultado = 0;
        boolean operacionValida = true;
        
        // Realizar operación seleccionada
        switch(operacion) {
            case "1":
                resultado = num1 + num2;
                operacion = "+";
                break;
            case "2":
                resultado = num1 - num2;
                operacion = "-";
                break;
            case "3":
                resultado = num1 * num2;
                operacion = "*";
                break;
            case "4":
                if(num2 != 0) {
                    resultado = num1 / num2;
                     operacion = "/";
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Operacion no valida.");
                operacionValida = false;
        }
        
        // Mostrar resultado si la operación fue válida
        if(operacionValida) {
            System.out.printf("Resultado: "+ num1 + " "+ operacion +" "+ num2 + " = "+ resultado);
        }
        
        //consola.close();
    }
}