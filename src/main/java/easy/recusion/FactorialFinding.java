package easy.recusion;

public class FactorialFinding {
    static int fac(int n) {
        if (n <= 2) return n;
        else return n*fac(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fac(3));
    }
}
