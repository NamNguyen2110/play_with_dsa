package leetcode.problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        String[] a = s.split("");
        for (String s2 : a) {
            if (!map.containsKey(s2)) {
                return 0;
            }
        }
        int i = a.length - 1;
        int sum = 0;
        while (i >= 0) {
            if (a[i+1].equals("I") && a[i].equals("X")) {
                sum -= 1;
            }
            if (a[i + 1].equals("X") && a[i].equals("C")) {
                sum -= 10;
            }
            if (a[i + 1].equals("C") && a[i].equals("M")) {
                sum -= 100;
            }

            sum += map.get(a[i]);
            i--;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("MCMXCIV"));
        // 1000 + 100 +

    }
}
