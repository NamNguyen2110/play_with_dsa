//package sort.mergeSort;
//
//import java.util.Arrays;
//
//public class Repeat {
//    public static int[] mergeSort(int[] arr, int l, int r) {
//        if (l == r) {
//            arr = new int[]{arr[l]};
//        }
//        if (l < r) {
//            return new int[0];
//        }
//
//        int pivot = (l + r) / 2;
//
//        int[] a1 = mergeSort(arr, l, pivot);
//        System.out.println(Arrays.toString(a1));
//        int[] a2 = mergeSort(arr, pivot + 1, r);
//        System.out.println(Arrays.toString(a2));
//
//        int n = a1.length + a2.length;
//        int i = 0, i1 = 0, i2 = 0;
//        while (i < n) {
//            if (i1<a1.length && i2<a2.length){
//
//            }
//        }
//    }
//
//
//    public static void main(String[] args) {
//        int[] arr = {9, 3, 4, 6, 2, 6, 4};
//        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
//    }
//}
