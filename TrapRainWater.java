// LeetCode 42: Trapping Rain Water
// Title: Trapping Rain Water
// This problem is about calculating how much water can be trapped after raining given an array of heights.
// Example 1:
// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Time Complexity: O(n) where n is the length of the input array.
// Space Complexity: O(1) since we are using a constant amount of space for variables.
//// Technique: Two Pointers    
public class TrapRainWater {
        public int trap(int[] height) {
            if (height == null || height.length == 0) {
                return 0;
            }
    
            int l = 0, r = height.length - 1;
            int leftMax = height[l], rightMax = height[r];
            int res = 0;
            while (l < r) {
                if (leftMax < rightMax) {
                    l++;
                    leftMax = Math.max(leftMax, height[l]);
                    res += leftMax - height[l];
                } else {
                    r--;
                    rightMax = Math.max(rightMax, height[r]);
                    res += rightMax - height[r];
                }
            }
            return res;
        }
    }
