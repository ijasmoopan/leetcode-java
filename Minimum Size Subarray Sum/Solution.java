/*
 * 209. Minimum Size Subarray Sum (Medium)
 * Given an array of positive integers nums and a positive integer target,
 * return the minimal length of a
 * subarray, whose sum is greater than or equal to target. If there is no such
 * subarray, return 0 instead.
 * 
 * Example 1:
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem
 * constraint.
 * 
 * Example 2:
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * 
 * Example 3:
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 */


public class Solution {

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        int result = minSubArrayLen(target, nums);
        System.out.print(result);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int l = 0, r = 0, sum = 0;
        while (r < nums.length) {
            sum += nums[r++];
            while (sum >= target) {
                minLen = Math.min(minLen, r - l);
                sum -= nums[l++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
