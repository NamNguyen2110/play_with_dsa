package leetcode.problem;

public class ReverseInteger {
    public int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            x = -x;
            isNegative = true;
        }
        long reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        if (reverse > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (isNegative ? -reverse : reverse);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(-123));
    }
}
