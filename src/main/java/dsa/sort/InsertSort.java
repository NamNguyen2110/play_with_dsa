package dsa.sort;

import java.util.Arrays;

public class InsertSort {
    // choose current and compare to current
    public static int[] insertSort(int[] a) {
        for (var i = 0; i < a.length; i++) {
            // Choose current element
            var currentElement = a[i];
            int j = i - 1;
            // j must be better than 0 avoid negative case
            // compare current between a[j] ( order by ascending )
            while (j >= 0 && a[j] > currentElement) {
                a[j + 1] = a[j];
                // decrease 1 unit
                j = j - 1;
            }
            // assign a[j+1] for current and loop again
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
