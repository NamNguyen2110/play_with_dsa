package leetcode.recursion;

public class FibonacciNumber {
    public int fib(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        FibonacciNumber number = new FibonacciNumber();
        System.out.println(number.fib(4));
    }
}
