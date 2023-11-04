package leetcode;

import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int half = nums.length / 2;
        int cand = 0, count = 0;
        if (half == 0) {
            return nums[0];
        }
        for (int i : nums) {
            if (i != cand) {
                count = 0;
            }
            if (count == 0) {
                cand = i;
                count++;
            } else {
                if (cand == i) {
                    count++;
                    if (count > half) {
                        return i;
                    }
                }
            }
        }
        return 0;
    }
}

public class MajorityElement {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] nums1 = {3, 2, 3};
        int result1 = solution.majorityElement(nums1);
        System.out.println("Result 1: " + result1); // Output: 3

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        int result2 = solution.majorityElement(nums2);
        System.out.println("Result 2: " + result2); // Output: 2
    }
}
