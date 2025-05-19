import java.util.Scanner;

public class SentenciasDecision {
    public static void main(String[] args) {
       // Revisar si un numero es positivo / negativo / cero
        var consola = new Scanner(System.in);
        System.out.print("Proporciona un numero: ");
        var numero = Integer.parseInt(consola.nextLine());
        if(numero > 0){
            System.out.println("Es positivo: " + numero);
        }
        else if(numero < 0){
            System.out.println("Es negativo: " + numero);
        }
        else{
            System.out.println("Es cero: " + numero);
        }
    }
}
