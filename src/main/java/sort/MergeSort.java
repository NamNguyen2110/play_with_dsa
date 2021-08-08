package sort;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] arr, int left, int right) {
        // break point and limit
        if (left > right) {
            return new int[0];
        }
        if (left == right) {
            return new int[]{arr[left]};

        }
        // divide
        System.out.println("DIVIDE INTO AT: " + left + " - " + right);
        int middle = (left + right) / 2;
        int[] leftArr = mergeSort(arr, left, middle);
        System.out.println("LEFT ARRAY: " + Arrays.toString(leftArr));
        int[] rightArr = mergeSort(arr, middle + 1, right);
        System.out.println("RIGHT ARRAY: " + Arrays.toString(rightArr));
        // merge
        System.out.println("=====> MERGE ARRAY RESULT: " + Arrays.toString(mergeLeftAndRightArray(leftArr, rightArr)));
        return mergeLeftAndRightArray(leftArr, rightArr);
    }

    private static int[] mergeLeftAndRightArray(int[] leftArr, int[] rightArr) {
        int lengthResult = leftArr.length + rightArr.length;
        int[] resultArr = new int[lengthResult];

        int resultIndex = 0, leftIndex = 0, rightIndex = 0;
        while (resultIndex < lengthResult) {
            if (leftIndex < leftArr.length && rightIndex < rightArr.length) {
                if (leftArr[leftIndex] < rightArr[rightIndex]) {
                    resultArr[resultIndex] = leftArr[leftIndex];
                    resultIndex++;
                    leftIndex++;
                } else {
                    resultArr[resultIndex] = rightArr[rightIndex];
                    resultIndex++;
                    rightIndex++;
                }
            } else {
                if (leftIndex < leftArr.length) {
                    resultArr[resultIndex] = leftArr[leftIndex];
                    resultIndex++;
                    leftIndex++;
                } else if (rightIndex < rightArr.length) {
                    resultArr[resultIndex] = rightArr[rightIndex];
                    resultIndex++;
                    rightIndex++;
                }
            }
        }
        return resultArr;
    }

    public static int[] sortArray(int[] arr, int leftIndex, int rightIndex) {
        return mergeSort(arr, leftIndex, rightIndex);
    }

    public static void main(String[] args) {
        int[] leftArr = {1, 2, 4, 3};
        int[] rightArr = {6, 9, 7, 8};
        int[] resultArr = {9,3,8,1,5,3,7};
//        System.out.println(Arrays.toString(mergeLeftAndRightArray(leftArr, rightArr)));
        System.out.println(Arrays.toString(sortArray(resultArr, 0, resultArr.length - 1)));
    }


}
