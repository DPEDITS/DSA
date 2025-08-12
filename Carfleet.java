// LeetCode Problem: 853. Car Fleet
// // Link: https://leetcode.com/problems/car-fleet/description/
// Given n cars and a target destination, each car has a position and speed.
// The goal is to determine how many car fleets will arrive at the target destination.
// Example 1:
// Input: target = 12, position = [10,8,0,5,3], speed = [2,4,1,1,3]
// Output: 3
// Explanation: The cars at positions 10 and 8 will form a fleet, the car at position 0 will be alone, and the cars at positions 5 and 3 will form another fleet.
// Time complexity: O(n log n), where n is the number of cars (due to sorting).
// Space complexity: O(n), where n is the number of cars (for storing pairs of positions and speeds).
//// Approach: Sort the cars by their positions in descending order, then calculate the time it takes for each car to reach the target.
// Technique: Use a stack to keep track of the time it takes for each car to reach the target.
import java.util.*;
public class Carfleet {

    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pair = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();
        for (int[] p : pair) {
            stack.push((double) (target - p[0]) / p[1]);
            if (stack.size() >= 2 &&
                stack.peek() <= stack.get(stack.size() - 2))
            {
                stack.pop();
            }
        }
        return stack.size();
    }
}
