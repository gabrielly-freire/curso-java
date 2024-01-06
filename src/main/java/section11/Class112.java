package section11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Class112 {
    public static void main(String[] args) {

        LocalDate data01 = LocalDate.parse("2022-07-20");
        LocalDateTime data02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant data03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(data03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(data03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(data03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(data03, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("Data 01 dia = " + data01.getDayOfMonth());
        System.out.println("Data 01 mês = " + data01.getMonthValue());
        System.out.println("Data 01 ano = " + data01.getYear());

        System.out.println("Data 02 hora = " + data02.getHour());
        System.out.println("Data 02 minutos = " + data02.getMinute());

        for (String s : ZoneId.getAvailableZoneIds())
            System.out.println(s);
    }
}
