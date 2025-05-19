public class Ciclos {
    public static void main(String[] args) {
        // Imprimir del 1 al 5
        // Ciclos do while
        var contador = 1;
        final var VALOR_MAXIMO = 5;
        do{
            System.out.println("Valor: " + contador++);
        } while(contador <= VALOR_MAXIMO);

    }
}
