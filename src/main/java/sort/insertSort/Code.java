package sort.insertSort;

import java.util.Arrays;

public class Code {
    public static int[] insertSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            /**
             * Start with a[i] and now create currentElement, then assign it to a[i];
             */
            int currentElement = a[i];
            /**
             * Separate origin to 2 parts.
             * Unsorted list ( right side in your hand)
             * Sorted list ( left side in your hand)
             */
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
