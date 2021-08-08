package sort;

import java.util.Arrays;

public class InsertSort {
    public static int[] insertSort(int[] a) {
        for (var i = 0; i < a.length; i++) {
            var currentElement = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > currentElement) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = currentElement;
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
