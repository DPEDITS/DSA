//LeetCode Problem: 739. Daily Temperatures
// Link: https://leetcode.com/problems/daily-temperatures/description/
//// Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
/// // Example 1:
///    // Input: temperatures = [73,74,75,71,69,72,76,73]
/// //    // Output: [1,1,4,2,1,1,0,0]
/// time complexity: O(n), where n is the length of the temperatures array
/// // space complexity: O(n), where n is the length of the temperatures array
/// // Approach: Use a stack to keep track of the indices of the temperatures.
/// Technique: Monotonic Stack
import java.util.*;
public class DailyTemp {
        public int[] dailyTemperatures(int[] temperatures) {
            int[] res = new int[temperatures.length];
            Stack<int[]> stack = new Stack<>(); // pair: [temp, index]
    
            for (int i = 0; i < temperatures.length; i++) {
                int t = temperatures[i];
                while (!stack.isEmpty() && t > stack.peek()[0]) {
                    int[] pair = stack.pop();
                    res[pair[1]] = i - pair[1];
                }
                stack.push(new int[]{t, i});
            }
            return res;
        }
    }
