import java.util.Scanner;

public class SentenciasDecision {
    public static void main(String[] args) {
       // Identificar el mayor de 2 numeros
        var consola = new Scanner(System.in);
        System.out.print("Proporciona el numero1: ");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona el numero2: ");
        var numero2 = Integer.parseInt(consola.nextLine());
        // El mayor de dos numeros
        if(numero1 > numero2){
            System.out.println("El numero mayor es: " + numero1);
        }
        else{
            System.out.println("El numero mayor es: " + numero2);
        }
    }
}
