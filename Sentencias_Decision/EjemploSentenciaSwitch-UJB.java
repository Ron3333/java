import java.util.Scanner;

public class SentenciasDecision {
    public static void main(String[] args) {
        // Identificar la estacion segun el mes (1-12)
        var consola = new Scanner(System.in);
        System.out.print("Proporciona un mes (1-12): ");
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estacion desconocida";
        // Revision del mes proporcionado
        switch(mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Estacion desconocida...";
        }
        System.out.println("La estacion para el mes " + mes + " es " + estacion);

//        if(mes == 1 || mes == 2 || mes == 12)
//            estacion = "Invierno";
//        else if(mes == 3 || mes == 4 || mes == 5)
//            estacion = "Primavera";
//        else if(mes == 6 || mes == 7 || mes == 8)
//            estacion = "Verano";
//        else if(mes == 9 || mes == 10 || mes == 11)
//            estacion = "Otoño";
        // Imprimimos el resultado
    }
}
