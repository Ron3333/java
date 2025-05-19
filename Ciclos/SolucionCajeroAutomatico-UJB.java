import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        System.out.println("*** Cajero Automatico ***");
        var salir = false;
        var saldo = 1000.00; // saldo inicial
        var consola = new Scanner(System.in);
        while(!salir){
            System.out.print("""
                    Menu:
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opcion:\s""");
            var opcion = Integer.parseInt(consola.nextLine());
            switch(opcion){
                case 1 -> System.out.println("Tu saldo actual es: $" + saldo);
                case 2 -> {
                    System.out.print("Ingresa el monto a retirar: ");
                    var retiro = Double.parseDouble(consola.nextLine());
                    if(retiro <= saldo){
                        saldo -= retiro; //saldo = saldo - retiro
                        System.out.println("Tu nuevo saldo es: $" + saldo);
                    }
                }
                case 3 -> {
                    System.out.print("Ingresa el monto a depositar: ");
                    var deposito = Double.parseDouble(consola.nextLine());
                    saldo += deposito; // saldo = saldo + deposito
                    System.out.println("Tu nuevo saldo es: $" + saldo);
                }
                case 4 -> {
                    System.out.println("Saliendo del Cajero. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida: " + opcion);
            }
            System.out.println();
        }
    }
}
