package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.print(Arrays.toString(twoSum(nums, target)));

    }
        static int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];

                if (map.containsKey(complement)) {
                    return new int[] { map.get(complement), i };
                }

                map.put(nums[i], i);
            }

            // If no solution found, though the problem guarantees one
            throw new IllegalArgumentException("No two sum solution");
        }
    }

