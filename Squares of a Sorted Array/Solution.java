// 977. Squares of a Sorted Array (Easy)

public class Solution {

    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        int[] result = sortedSquares(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int l = 0, r = nums.length - 1, ls = 0, rs = 0;
        while (l <= r) {
            ls = nums[l] * nums[l];
            rs = nums[r] * nums[r];
            if (ls < rs) {
                res[r - l] = rs;
                r--;
            } else {
                res[r - l++] = ls;
            }
        }
        return res;
    }
}

/*
 * 977. Squares of a Sorted Array (Easy)
 * Given an integer array nums sorted in non-decreasing order, return an array
 * of the squares of each number sorted in non-decreasing order.
 * 
 * Example 1:
 * 
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * 
 * Example 2:
 * 
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */