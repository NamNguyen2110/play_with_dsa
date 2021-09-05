package ptit;

import java.util.Arrays;
import java.util.Scanner;

public class sxdoichotructiep {
    public static Scanner scanner = new Scanner(System.in);

    static void insert(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
    }


    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        insert(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println("Buoc " + (i + 1) + ": " + Arrays.toString(a)
                    .replace("[","")
                    .replace("]","")
                    .replace(",","")
            );
        }

    }
}
