public class SentenciasDecision {
    public static void main(String[] args) {
        // Setencias de decision y operador !
        System.out.println("*** Bienvenidos al Sistema Bancario ***");
        var salirSistema = false;
        if(!salirSistema){
            System.out.println("Continuamos dentro del Sistema...");
        }
        else{
            System.out.println("Saliendo del Sistema. Saludos!");
        }
        // Otra logica aplicada sin el operador not !
        if(salirSistema){
            System.out.println("Saliendo del Sistema. Saludos!");
        }
        else{
            System.out.println("Continuamos dentro del Sistema...");
        }
    }
}
