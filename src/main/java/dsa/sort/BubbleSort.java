package dsa.sort;

import java.util.Arrays;

public class BubbleSort {
    // compare 2 element side by side
    // in the next loop, needs to remove in sorted element j < a.length - i - 1
    public static int[] bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1, 0, 11, 7, 3, 4};
        System.out.println(Arrays.toString(a));
        int[] b = bubbleSort(a);
        System.out.println(Arrays.toString(b));
    }
}
