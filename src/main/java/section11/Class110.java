package section11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Instanciação
public class Class110 {
    public static void main(String[] args) {
        // costumizar formatações
        DateTimeFormatter dateformatter01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateformatter02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // data
        LocalDate date01 = LocalDate.now();
        // data local
        LocalDateTime date02 = LocalDateTime.now();
        // data global (londres)
        Instant date03 = Instant.now();
        // String to LocalDate
        LocalDate date04 = LocalDate.parse("2024-01-05");
        LocalDateTime date05 = LocalDateTime.parse("2024-01-05T01:30:26");
        Instant date06 = Instant.parse("2024-01-05T01:30:26Z");
        Instant date07 = Instant.parse("2024-01-05T01:30:26-03:00");

        LocalDate date08 = LocalDate.parse("04/10/2003", dateformatter01);
        LocalDateTime date09 = LocalDateTime.parse("04/10/2003 16:24", dateformatter02);

        LocalDate date10 = LocalDate.of(2023, 1, 5);
        LocalDateTime date11 = LocalDateTime.of(2023, 1, 5, 20, 30);
        System.out.println("Date 01 " + date01);
        System.out.println("Date 02 " + date02);
        System.out.println("Date 03 " + date03);
        System.out.println("Date 04 " + date04);
        System.out.println("Date 05 " + date05);
        System.out.println("Date 06 " + date06);
        System.out.println("Date 07 " + date07);
        System.out.println("Date 08 " + date08);
        System.out.println("Date 09 " + date09);
        System.out.println("Date 10 " + date10);
        System.out.println("Date 11 " + date11);


    }
}
