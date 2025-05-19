public class Operadores {
    public static void main(String[] args) {
        // Operadores logicos
        boolean a = true, b = false;
        // and (regresar true si ambos valores son true)
        var resultado = a && b;
        System.out.println("Resultado: a && b = " + resultado);
        // or (regresa true si cualquier valor es true)
        resultado = a || b;
        System.out.println("Resultado: a || b = " + resultado);
        // ! (not) (invierte el valor logico)
        resultado = !a;
        System.out.println("Resultado: !a = " + resultado);
    }
}
