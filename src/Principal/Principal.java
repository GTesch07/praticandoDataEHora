package Principal;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args){
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2025, 10, 19);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        if (dataPrimeiraParcela.isEqual(LocalDate.now())){
            System.out.println("Hoje é o dia do vencimento");
        }else if (dataPrimeiraParcela.isAfter(LocalDate.now())) {
            System.out.println("Ainda não está no dia do vencimento");
        }else {
            System.out.println("Parcela vencida!!!");
        }

        System.out.println("Data compra: " + dataCompra);
        System.out.println("Data primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data segunda parcela: " + dataSegundaParcela);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data compra formatada: " + dataCompra.format((formato)));
        System.out.println("Data primeira parcela formatada: " + dataPrimeiraParcela.format(formato));
        System.out.println("Data segunda parcela formatada: " + dataSegundaParcela.format(formato));

        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data conclusão compra: " + dataConclusaoCompra);
        ZonedDateTime dataCompraNy = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Data conclusão compra NY: " + dataCompraNy);

        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17,30);

        Duration duracao = Duration.between(inicio, fim);

        System.out.println("Duração do expediente: " + duracao.toHours()+ " horas e "+ duracao.toMinutesPart() + " minutos.");

        LocalDate dataPagamento =LocalDate.parse("2025-10-30");
        Period periodo = Period.between(dataCompra, dataPagamento);

        System.out.println("Diferença em dias: " + periodo.getDays());
    }

}
