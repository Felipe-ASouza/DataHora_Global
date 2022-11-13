import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-12-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-12-20T01:30:22");
        Instant d03 = Instant.parse("2022-12-20T01:30:22Z");
        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("d03 dia = " + d02.getDayOfMonth());
        System.out.println("d03 mes = " + d02.getMonthValue());
        System.out.println("d03 mes = " + d02.getYear());
    }
}