import java.util.Scanner;

public class SentenciasDecision {
    public static void main(String[] args) {
        // Dia de la semana (1 - 7)
        System.out.print("Proporciona el dia de la semana: ");
        var diaSemana = Integer.parseInt(new Scanner(System.in).nextLine());
        // switch mejorada
        switch(diaSemana){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Valor de dia erroneo: " + diaSemana);
        }
    }
}
