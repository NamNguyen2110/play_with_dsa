package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 13;
        System.out.println(Arrays.toString(solution(arr, target)));
    }

    public static int[] solution(int[] nums, int target) {
        /* O(n^2)
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if(a[i]+a[j]==target) return new int[]{i,j};
            }
        }
        return a; */
        // O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            } else {
                 map.put(nums[i], i);
            }
        }
        return nums;
    }
}
