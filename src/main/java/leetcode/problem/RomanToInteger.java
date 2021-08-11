package leetcode.problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        String[] symbol = new String[]{"I", "V", "X", "L", "C", "D", "M"};
        Integer[] value = new Integer[]{1, 5, 10, 50, 100, 500, 1000};
        Map<String, Integer> map = new HashMap<>();
        for (String s1 : symbol) {
            for (Integer v : value) {
                map.put(s1, v);
            }
        }
        String[] singleChar = s.split("");
        System.out.println(Arrays.toString(Arrays.stream(singleChar).toArray()));
        return 1;
    }

    public static void main(String[] args) {
        new RomanToInteger().romanToInt("III");
    }
}
