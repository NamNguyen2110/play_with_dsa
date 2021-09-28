package htpt;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Code2 {
    public static void main(String[] args) {
        long sss = 1000 * 60 * 60 * 24 * 25567L;
        // 16 -> 23  , 32 -> 39,  40 -> 47
        String[] array = {"E1", "47", "F8", "82", "CE", "8E", "9E", "93", "E1", "47", "F8", "82", "CE", "8E", "9E", "93", "E1", "47", "F8", "82", "CE", "8E", "9E", "93"};
        List<String> arr = new ArrayList<>();
        for (int pos = 0; pos < 3; pos++) {
            long intpart = 0;
            long fractpart = 0;
            for (int i = pos * 8; i < pos * 8 + 4; i++) {
                intpart = intpart * 256 + Long.parseLong(array[i], 16);
                fractpart = fractpart * 256 + Long.parseLong(array[i + 4], 16);
            }
            long milliseconds = intpart * 1000 + ((fractpart * 1000) / 0x100000000L);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            Date date = new Date(milliseconds - sss);
            arr.add(sdf.format(date));
            System.out.println("Thời gian " + pos + ": " + sdf.format(date));
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        LocalDateTime T1 = LocalDateTime.parse(arr.get(0), formatter);
        LocalDateTime T2 = LocalDateTime.parse(arr.get(1), formatter);
        LocalDateTime T3 = LocalDateTime.parse(arr.get(2), formatter);
        // thời gian nhận bản tin là T4
        String date4 = "2019-10-09 16:37:29.229";
        LocalDateTime T4 = LocalDateTime.parse(date4, formatter);
        double between1 = ChronoUnit.MILLIS.between(T1, T2);
        double between2 = ChronoUnit.MILLIS.between(T4, T3);
        double average = (between1 + between2) / 2;
        LocalDateTime result = T4.plusNanos(Math.round(average) * 10 * 10 * 10 * 10 * 10 * 10);
        System.out.println("Thời gian máy khách ngay sau khi đồng bộ: " + result.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
        long doLech = Math.round(average * 10000);
        System.out.println("Độ lệch thời gian: " + doLech);
    }
}
