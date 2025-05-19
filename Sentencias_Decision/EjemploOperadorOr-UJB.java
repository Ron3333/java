public class SentenciasDecision {
    public static void main(String[] args) {
        // Sentencia if y operador logico or
        // Sergio quiere asistir al juego de su hijo
        // pero solo puede asistir si tiene vacaciones O es un dia de descanso
        var diaDescanso = true;
        var vacaciones = true;
        if(diaDescanso || vacaciones){
            System.out.println("Sergio puede asistir al juego de Mateo...");
        }
        else{
            System.out.println("Sergio esta ocupado, no puede ir al juego...");
        }
    }
}
