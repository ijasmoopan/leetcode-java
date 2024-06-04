// Longest Continuous Sequence (Max Consecutive Ones II)

public class Solution {

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1 };
        // int[] nums = { 1, 1, 1, 0, 1 };
        int solution = longestContinuousSequence(nums);
        System.out.println("Index of zero: " + solution);
    }

    public static int longestContinuousSequence(int[] nums) {
        int l = 0, r = 0, zeros = 0, zIdx = 0, maxLen = 0;
        while (r < nums.length) {
            if (nums[r] == 0) {
                zeros++;
            }
            if (zeros > 1) {
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;
            } else {
                if (maxLen < (r-l+1)) {
                    maxLen = r-l+1;
                    zIdx = l;
                    while (l < nums.length) {
                        if (nums[zIdx] == 0) break;
                        zIdx++;
                    }
                }
            }
            r++;
        }
        return zIdx;
    }
}

/*
 * Longest Continuous Sequence (Max Consecutive Ones II) 
 * Given an array of 0s and 1s, write a function to return the position of 0 followed by the longest continuous sequence of 1s.
 * 
 * Example 1:
 * Array = { 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1 }
 * Longest continuous sequence of 1s: 1, 1, 1, the position count starts from 0.
 * The position of 0 preceeding the longest continuous sequence of 1s is 5.
 * The functon return this 5.
 * 
 * Example 1:
 * Array = { 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1 }
 * Output: 5
 * 
 * Example 2:
 * Array = { 1, 1, 1, 0, 1 }
 * Output: 3
 */