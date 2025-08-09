//Leetcode Problem:11. Container With Most Water
// Title: Container With Most Water
// This problem is about finding two lines that together with the x-axis form a container that can hold the most water.
// Example 1:
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Time Complexity: O(n^2) where n is the length of the input array.
// Space Complexity: O(1) since we are using a constant amount of space for variables.
//// Technique: Brute Force
public class ContWithMostWater {
        public int maxArea(int[] heights) {
            int res = 0;
            for (int i = 0; i < heights.length; i++) {
                for (int j = i + 1; j < heights.length; j++) {
                    res = Math.max(res, Math.min(heights[i], heights[j]) * (j - i));
                }
            }
            return res;
        }
    }