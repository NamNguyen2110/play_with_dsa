package leetcode.recursion;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n < 3) {
            return false;
        } else {
            if (n % 3 == 0) {
                return false;
            }
        }
        return isPowerOfThree(n / 3);
    }

    public static void main(String[] args) {
        System.out.println(new PowerOfThree().isPowerOfThree(27));
    }
}
