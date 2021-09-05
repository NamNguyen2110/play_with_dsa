package easy.recusion;

public class FibonacciSeries {
    // The fibonacci series is a series in which each number is the sum of the previous two numbers
    static int fib(int n) {
        if (n <= 1) return n;
        else return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
        // 0 1 1 2 3 5 8 13
    }
}
