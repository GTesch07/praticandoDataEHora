package Principal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SistemaLogFormatado {
    public static void main(String[] args){
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Data formatada: " + dataAtual.format(formatoData));
        System.out.println("Hora formatada: "+ horaAtual.format(formatoHora));

    }
}
