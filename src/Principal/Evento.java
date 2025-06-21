package Principal;

import javax.swing.text.html.HTMLDocument;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
    public static void main(String[]args){
        LocalDate dataEvento = LocalDate.of(2025,3,10);

        LocalDate dataAtual = LocalDate.of(2025,3,15);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data do evento: "+ dataEvento.format(formatter));

        System.out.println("Data atual: "+ dataAtual.format(formatter));

        if(dataEvento.isEqual(dataAtual)){
            System.out.println("Dia do evento.");
        }else {
            System.out.println("O evento já ocorreu.");
        }
    }
}
