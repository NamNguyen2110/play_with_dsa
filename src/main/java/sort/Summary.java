package sort;

import java.util.Arrays;

public class Summary {
    public static int[] mergeSort(int[] a, int l, int r) {
        if (l > r) {
            return new int[0];
        }
        if (l == r) {
            return new int[]{a[l]};
        }
        int m = (l + r) / 2;
        int[] a1 = mergeSort(a, l, m);
        int[] a2 = mergeSort(a, m + 1, r);

        int n = a1.length + a2.length;
        int[] a3 = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) {
                if (a1[i1] < a2[i2]) {
                    a3[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    a3[i] = a2[i2];
                    i++;
                    i2++;
                }
            } else {
                if (i1 < a1.length) {
                    a3[i] = a1[i1];
                    i++;
                    i1++;
                } else if (i2 < a2.length) {
                    a3[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return a3;
    }

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

    public static int[] bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
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
        int[] a = {9, 3, 4, 6, 2, 6, 4};
        System.out.println(Arrays.toString(mergeSort(a, 0, a.length - 1)));
        System.out.println(Arrays.toString(insertSort(a)));
        System.out.println(Arrays.toString(bubbleSort(a)));
    }
}
