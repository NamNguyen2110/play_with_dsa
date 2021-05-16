package leetcode;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int result = findNumbers(nums);
        System.out.println(result);
    }

    public static int checkNumber(int elementOfArray) {
        int count = 0;
        while (elementOfArray != 0) {
            elementOfArray = elementOfArray / 10;
            count++;
        }
        return count;
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (checkNumber(nums[i]) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
