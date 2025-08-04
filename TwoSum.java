//Leetcode Problem #1
// Title: Two Sum
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
// Example 1:
// Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Time Complexity: O(n) where n is the length of the input array nums.
// Space Complexity: O(n) for the hashmap used to store the indices of the numbers.
//Explanation: The algorithm uses a single pass through the array, storing each number and its index in a hashmap. For each number, it checks if the complement (target - number) exists in the hashmap. If it does, it returns the indices of the two numbers.
import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }
}