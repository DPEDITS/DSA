//LeetCode Problem: Two Sum II - Input Array Is Sorted
// Title: Two Sum II - Input Array Is Sorted
// This problem is about finding two numbers in a sorted array that add up to a specific target.
// Example 1:
// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]
// Time Complexity: O(n^2) where n is the length of the input array.
// Space Complexity: O(1) since we are not using any additional data structures that grow with input size.
//Technique: Brute Force
// This solution uses a brute force approach to find the two indices of the numbers that sum up to the target.
public class TwoIntSum {
        public int[] twoSum(int[] numbers, int target) {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] + numbers[j] == target) {
                        return new int[] { i + 1, j + 1 };
                    }
                }
            }
            return new int[0];
        }
    }

