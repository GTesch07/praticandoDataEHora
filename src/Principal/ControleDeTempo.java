package Principal;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class ControleDeTempo {
    public static void main(String[]args){
        LocalTime inicio = LocalTime.of(14,30);
        LocalTime fim = LocalTime.of(16,45);

        Duration duracao = Duration.between(inicio,fim);

        System.out.println("Diferença de tempo: "+ duracao.toHours() +" horas e "+ duracao.toMinutesPart() + " minutos.");
    }
}
