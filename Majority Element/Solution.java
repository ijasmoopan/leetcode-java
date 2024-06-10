/*
 * 169. Majority Element (Easy)
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You
 * may assume that the majority element always exists in the array.
 * 
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 * 
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int result = majorityElementUsingHashing(nums);
        System.out.println(result);
        result = majorityElementUsingMooresAlgo(nums);
        System.out.println(result);
    }

    public static int majorityElementUsingHashing(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 1;
            if (map.get(nums[i]) == null) {
                map.put(nums[i], count);
            } else {
                count = map.get(nums[i]) + 1;
                map.put(nums[i], count);
            }
            if (count > nums.length / 2)
                return nums[i];
        }
        return 0;
    }

    // A solution based on Boyer-Moore's Voting Algorithm.
    public static int majorityElementUsingMooresAlgo(int[] nums) {
        int count = 0, element = 0;
        for (int num : nums) {
            if (count == 0) {
                element = num;
                count++;
            } else if (element == num) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int num : nums) {
            if (num == element)
                count++;
        }
        if (count > nums.length / 2) {
            return element;
        }
        return -1;
    }
}
