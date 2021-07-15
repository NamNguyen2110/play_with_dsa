package dsa;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generation {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("2021-07-13 13:45:31.153", "2021-07-13 13:42:56.544", "2021-07-13 11:31:38.988");
        List<LocalDateTime> dateTimes = Stream
                .of(strings)
                .map(dateTime -> LocalDateTime.parse((CharSequence) dateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")))
                .collect(Collectors.toList());
        for (int i = 0; i < dateTimes.size(); ++i) {
            for (int j = i + 1; j < dateTimes.size(); ++j) {
                Duration duration = Duration.between(dateTimes.get(i), dateTimes.get(j));
                long resultTimes = duration.getSeconds() - duration.toMinutes() * 60;
            }
        }
    }
}
