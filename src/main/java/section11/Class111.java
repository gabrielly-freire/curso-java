package section11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Class111 {
    public static void main(String[] args) {
        // declarações
        LocalDate data01 = LocalDate.parse("2022-07-20");
        LocalDateTime data02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant data03 = Instant.parse("2022-07-20T01:30:26Z");

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        // formatações
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("Data 01 = " + data01.format(fmt1));
        System.out.println("Data 01 = " + fmt1.format(data01));
        System.out.println("Data 01 = " + data01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("Data 02 = " + data02.format(fmt1));
        System.out.println("Data 02 = " + data02.format(fmt2));
        System.out.println("Data 02 = " + data02.format(fmt4));

        System.out.println("Data 03 = " + fmt3.format(data03));
        System.out.println("Data 03 = " + fmt5.format(data03));
        System.out.println("Data 03 = " + data03.toString());
    }
}
