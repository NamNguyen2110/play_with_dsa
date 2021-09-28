package leetcode.recursion;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        } else {
            if (n % 2 != 0 || n == 0) {
                return false;
            }
        }
        return isPowerOfTwo(n/2);
    }

    public static void main(String[] args) {
        System.out.println(new PowerOfTwo().isPowerOfTwo(Integer.MAX_VALUE));
    }
}
