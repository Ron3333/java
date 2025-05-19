import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
       // Menu interactivo
        System.out.println("*** Sistema de Administracion de Cuentas");
        var salir = false;
        while(!salir){
            System.out.print("""
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir del Sistema
                    Escoge una opcion:\s""");
            var opcion = Integer.parseInt(new Scanner(System.in).nextLine());
            switch(opcion){
                case 1 -> System.out.println("Creando tu cuenta...");
                case 2 -> System.out.println("Eliminado tu cuenta...");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto...");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida: " + opcion);
            }
            System.out.println();
        }
    }
}
