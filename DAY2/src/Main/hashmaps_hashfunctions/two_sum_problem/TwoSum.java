package Main.hashmaps_hashfunctions.two_sum_problem;

// TwoSum.java
import java.util.*;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];


            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }


            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}

