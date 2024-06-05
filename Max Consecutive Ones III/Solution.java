// 1004. Max Consecutive Ones III (Medium)

public class Solution {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        int solution = longestOnes(nums, k);
        System.out.println("Longest ones: " + solution);
    }

    public static int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, maxLen = 0, zeros = 0;
        while (r < nums.length) {
            if (nums[r] == 0)
                zeros++;
            if (zeros > k) {
                if (nums[l] == 0)
                    zeros--;
                l++;
            } else {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        return maxLen;
    }
}

/*
 * 
 * 1004. Max Consecutive Ones III (Medium)
 * Given a binary array nums and an integer k, return the maximum number of
 * consecutive 1's in the array if you can flip at most k 0's.
 * 
 * Example 1:
 * 
 * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
 * Output: 6
 * Explanation: [1,1,1,0,0,1,1,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 * 
 * Example 2:
 * 
 * Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
 * Output: 10
 * Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 * 
 */