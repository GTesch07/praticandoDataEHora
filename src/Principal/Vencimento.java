package Principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vencimento {
    public static void main(String[]args){
        LocalDate dataVencimento = LocalDate.of(2025,03,20);
        int adiantamentoMeses = 1;
        LocalDate adiantamento = dataVencimento.plusMonths(adiantamentoMeses);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String dataFormatada = adiantamento.format(formatter);

        System.out.println("Nova data formatada: " + dataFormatada);
    }
}
