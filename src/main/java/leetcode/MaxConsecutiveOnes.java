package leetcode;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 0, 1};
        int result = findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) count = 0;
            else {
                count++;
                maxCount = (count > maxCount) ? count : maxCount;
            }
        }
        return maxCount;
    }
}
