// 485. Max Consecutive Ones (Easy)

public class Solution {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        int solution = findMaxConsecutiveOnes(nums);
        System.out.println("Max consecutives ones: " + solution);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int tempCount = 0;
        int finalCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                tempCount++;
                if (tempCount > finalCount) {
                    finalCount = tempCount;
                }
            } else {
                tempCount = 0;
            }
        }
        return finalCount;
    }
}

/*
 * 
 * 485. Max Consecutive Ones (Easy)
 * Given a binary array nums, return the maximum number of consecutive 1's in
 * the array.
 * 
 * Example 1:
 * 
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive
 * 1s. The maximum number of consecutive 1s is 3.
 * 
 * Example 2:
 * 
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 * 
 */