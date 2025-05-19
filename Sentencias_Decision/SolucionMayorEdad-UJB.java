import java.sql.SQLOutput;
import java.util.Scanner;

public class SentenciasDecision {
    public static void main(String[] args) {
        final var MAYOR_EDAD = 18;
        System.out.print("Ingresa tu edad: ");
        var edad = Integer.parseInt(new Scanner(System.in).nextLine());
        // Validamos la edad
        if(edad >= MAYOR_EDAD){
            System.out.println("La persona con edad " + edad + " es mayor de edad");
        }
        else{
            System.out.println("La persona con edad " + edad + " es menor de edad");
        }
    }
}
