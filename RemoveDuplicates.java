package leetcode;


import java.util.Arrays;


public class RemoveDuplicates {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        // Test case 1
        int[] nums1 = {1, 1, 2};
        int length1 = solution.removeDuplicates(nums1);
        System.out.println("Length 1: " + length1); // Output: 2

        // Test case 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length2 = solution.removeDuplicates(nums2);
        System.out.println("Length 2: " + length2); // Output: 5

        // Print modified arrays (optional)
        System.out.println("Modified Array 1: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, length1)));
        System.out.println("Modified Array 2: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, length2)));
    }
}
class Solution1 {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int a = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[a] = nums[i];
                a++;
            }
        }
        return a;
    }
}
