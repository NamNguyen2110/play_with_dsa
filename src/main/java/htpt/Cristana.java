package htpt;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Cristana {
    public static void main(String[] args) {
        String date1 = "2018-09-27 07:58:12.624";
        String date2 = "2018-09-27 08:00:08.218";
        String date3 = "2018-09-27 08:00:08.722";
        String date4 = "2018-09-27 07:58:17.402";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        LocalDateTime T1 = LocalDateTime.parse(date1, formatter);
        LocalDateTime T2 = LocalDateTime.parse(date2, formatter);
        LocalDateTime T3 = LocalDateTime.parse(date3, formatter);
        LocalDateTime T4 = LocalDateTime.parse(date4, formatter);
        double between1 = ChronoUnit.MILLIS.between(T1, T2);
        double between2 = ChronoUnit.MILLIS.between(T4, T3);
        double average = (between1 + between2) / 2;
        System.out.println(average);
        LocalDateTime result = T4.plusNanos((long) (Math.floor(average) * 10 * 10 * 10 * 10 * 10 * 10));
        System.out.println("Thời gian máy khách ngay sau khi đồng bộ: " + result.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
    }
}
