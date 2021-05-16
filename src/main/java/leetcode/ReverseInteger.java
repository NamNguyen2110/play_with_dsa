package leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        String a = Integer.toString(x);
        if (a.length() == 1) {
            return Integer.parseInt(a);
        }
        if (a.length() > 1) {
            for (int i = 0; i < a.length(); i++) {

            }
        }
        return x;
    }
}
