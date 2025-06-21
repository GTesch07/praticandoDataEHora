package Principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Lembrete {
    public static void main(String[]args){
        LocalDate dataVencimento = LocalDate.of(2025,3,30);

        int antecedendcia = 5;

        LocalDate dataAntecedente = dataVencimento.minusDays(antecedendcia);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data do lembrete: " + dataAntecedente.format(formatter));

    }
}
