import java.util.Scanner;

public class SentenciasDecision {
    public static void main(String[] args) {
       // Comparacion de cadenas en Java
        var cadena1 = "juan";
        var cadena2 = "juan";
        var consola = new Scanner(System.in);
        System.out.print("Proporciona una cadena: ");
        var cadena3 = consola.nextLine();
        if(cadena1 == cadena3){
            System.out.println("Las cadenas son iguales (en referencia de memoria)");
        }
        else{
            System.out.println("Las cadenas son distintas (en referencia de memoria)");
        }
        // Comparacion usando el metodo equals
        if(cadena1.equalsIgnoreCase(cadena3)){
            System.out.println("Las cadenas son iguales (en contenido)");
        }
        else{
            System.out.println("Las cadenas son distintas (en contenido)");
        }
    }
}
