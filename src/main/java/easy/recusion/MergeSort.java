package easy.recusion;

import java.util.Arrays;

public class MergeSort {
    static int[] mergeSort(int[] a, int left, int right) {
        return sort(a, left, right);
    }

    static int[] sort(int[] a, int left, int right) {
        if (left > right) {
            return new int[0];
        }
        if (left == right) {
            return new int[]{a[left]};
        }

        int middle = (left + right) / 2;
        int[] a1 = sort(a, left, middle);
        System.out.println(Arrays.toString(a1));
        int[] a2 = sort(a, middle + 1, right);
        System.out.println(Arrays.toString(a2));

        int[] a3 = new int[a1.length + a2.length];
        int i1 = 0, i2 = 0, i3 = 0;
        while (i3 < a3.length) {
            if (i1 < a1.length && i2 < a2.length) {
                if (a1[i1] < a2[i2]) {
                    a3[i3] = a1[i1];
                    i3++;
                    i1++;
                } else {
                    a3[i3] = a2[i2];
                    i3++;
                    i2++;
                }
            } else { // i1 > a1.length && i2 > a2.length
                if (i1 < a1.length) {
                    a3[i3] = a1[i1];
                    i3++;
                    i1++;
                } else if (i2 < a2.length) {
                    a3[i3] = a2[i2];
                    i3++;
                    i2++;
                }
            }
        }
        return a3;
    }

    public static void main(String[] args) {
        int[] a = {8, 3, 1, 4, 5};
        System.out.println(Arrays.toString(mergeSort(a, 0, a.length - 1)));
    }
}
