package Principal;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FusoHorario {
    public static void main(String[]args){
        ZonedDateTime horaAtual = ZonedDateTime.now();
        ZonedDateTime horaToquio = horaAtual.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Horário atual em Tóquio: " + horaToquio.format(formatter));
    }
}
