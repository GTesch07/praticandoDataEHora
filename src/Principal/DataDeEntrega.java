package Principal;

import java.lang.classfile.constantpool.LoadableConstantEntry;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataDeEntrega {
    public static void main(String[]args){
        LocalDate dataInicio = LocalDate.of(2025,3,15);

        int prazoDias = 15;
        LocalDate dataEntrega = dataInicio.plusDays(prazoDias);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataEntrega.format(formatter);

        System.out.println("Data de entrega: " + dataFormatada);

    }
}
