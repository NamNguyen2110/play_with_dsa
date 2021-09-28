package leetcode.problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    nums = new int[]{i, j};
                }
            }
        }
        return nums;
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int number = target - nums[i];
            if (map.containsKey(number)) {
                nums = new int[]{map.get(number), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 7};
        int target = 10;
        System.out.println(Arrays.toString(new TwoSum().twoSum1(nums, target)));
        System.out.println(Arrays.toString(new TwoSum().twoSum2(nums, target)));
    }
}
