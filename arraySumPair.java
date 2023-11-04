package leetcode;


import java.util.Arrays;

class arraySumPair {
    public int arrayPairSum(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i = i + 2){
            max = max + Math.min(nums[i], nums[i + 1]);
        }
        return max;
    }

    public static void main(String[] args) {
    	arraySumPair solution = new arraySumPair();

        int[] nums = {6, 2, 6, 5, 1, 2};
        int result = solution.arrayPairSum(nums);

        System.out.println("Maximum sum of pairs: " + result); // Output: 9
    }
}
