package htpt;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Berkeley {
    public static void main(String[] args) {
        String date1 = "2018-09-27 07:12:53.072";
        String date2 = "2018-09-27 07:12:52.366";
        String date3 = "2018-09-27 07:12:53.804";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        LocalDateTime P1 = LocalDateTime.parse(date1, formatter);
        LocalDateTime P2 = LocalDateTime.parse(date2, formatter);
        LocalDateTime P3 = LocalDateTime.parse(date3, formatter);
        double between0 = 0;
        double between1 = ChronoUnit.MILLIS.between(P1, P2);
        double between2 = ChronoUnit.MILLIS.between(P1, P3);
        double result = (between0 + between1 + between2) / 3;
        double a0 = result - between0;
        double a1 = result - between1;
        double a2 = result - between2;
        System.out.println(result);
        System.out.println("Điều chỉnh (ms)");
        System.out.println((int) Math.round(a0));
        System.out.println((int) Math.round(a1));
        System.out.println((int) Math.round(a2));
        LocalDateTime a = P1.plusNanos(Math.round(result)* 10 * 10 * 10 * 10 * 10 * 10);
        System.out.println("Thời gian sau đồng bộ: " + a.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
    }
}
