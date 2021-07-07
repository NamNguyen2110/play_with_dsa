package interview;

import java.util.Arrays;
import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - i - 2; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.println("Buoc " + (i + 1) + ": " + Arrays.toString(a)
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", ""));
        }
    }
}

