package sort.insertSort;

import java.util.Arrays;

public class Code {
    public static int[] insertSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > current) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = current;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1, 0, 11, 7, 3, 4};
        System.out.println(Arrays.toString(a));
        int[] b = insertSort(a);
        System.out.println(Arrays.toString(b));
    }
}
