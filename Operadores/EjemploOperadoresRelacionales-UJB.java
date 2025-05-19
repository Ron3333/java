public class Operadores {
    public static void main(String[] args) {
        // Operadores Relacionales (Comparacion)
        int a = 3, b = 2;
        // Igualdad ==
        var resultado = a == b;
        System.out.println("Resultado a == b : " + resultado);
        // Distinto !=
        resultado = a != b;
        System.out.println("Resultado a != b : " + resultado);
        // Mayor que
        resultado = a > b;
        System.out.println("Resultado a > b : " + resultado);
        // Mayor o igual que
        resultado = a >= b;
        System.out.println("Resultado a >= b : " + resultado);
        // Menor que
        resultado = a < b;
        System.out.println("Resultado a < b : " + resultado);
        // Menor o igual que
        resultado = a <= b;
        System.out.println("Resultado a <= b : " + resultado);
    }
}
