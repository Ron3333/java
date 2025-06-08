package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creacion de Objetos de la Clase Persona ***");
        System.out.println("Variable estatica: " + Persona.contadorPersonas);
        var objeto1 = new Persona("Layla", "Acosta");
        System.out.println(objeto1);//De manera automatica se llama .toString()
        System.out.println("Variable estatica despues del objecto "
                + Persona.contadorPersonas);
        var objeto2 = new Persona("Ian", "Gomez");
        System.out.println("Variable estatica despues del objecto "
                + Persona.contadorPersonas);


    }
}
