package Principal;

import java.sql.SQLOutput;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FusoSydney {
    public static void main(String[]args){
        ZonedDateTime horaAtual = ZonedDateTime.now();
        ZonedDateTime horaSydney = horaAtual.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Horário atual do sistema: " + horaAtual.format(formatter));
        System.out.println("Horário atual em Sydney: " + horaSydney.format(formatter));
    }
}
