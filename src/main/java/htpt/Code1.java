package htpt;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Code1 {
    private static final long SECS = 60 * 60 * 24 * 25567L;

    public static void main(String[] args) {
        String[] test1 = {"E1", "47", "F8", "82", "CE", "8E", "9E", "93"};
        String[] test2 = {"E1", "47", "F8", "82", "CE", "8E", "9E", "93"};
        String[] test3 = {"E1", "47", "F8", "82", "CE", "8E", "9E", "93"};
        calculate(test1);
        calculate(test2);
        calculate(test3);
    }

    private static void calculate(String[] test1) {
        int[] data = new int[8];
        for (int i = 0; i < 8; i++) {
            data[i] = Integer.parseInt(test1[i], 16);
        }
        double timestamp = 0.0;
        for (int i = 0; i < 8; i++) {
            timestamp += data[i] * Math.pow(2, (3 - i) * 8);
        }
        String result = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date((long) (1000.0 * (timestamp - SECS))));
        System.out.println(result);
    }
}
