package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creacion de Objetos de la Clase Persona ***");
        var objeto1 = new Persona("Layla", "Acosta");
        objeto1.mostrarPersona();

        var objeto2 = new Persona("Ian", "Gomez");
        System.out.println();
        objeto2.mostrarPersona();
    }
}
