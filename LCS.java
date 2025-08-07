//Leetcode Problem:128 Longest Consecutive Sequence
// Title: Longest Consecutive Sequence
// // This problem is about finding the length of the longest consecutive elements sequence in an unsorted array.
 // Example 1:
 // Input: nums = [100,4,200,1,3,2]
 // Output: 4
 // Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 // Time Complexity: O(n2) where n is the number of elements in the input array.
 // Space Complexity: O(n) for storing the elements in a HashSet.
import java.util.*;

public class LCS {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> store = new HashSet<>();
        for (int num : nums) {
            store.add(num);
        }

        for (int num : nums) {
            int streak = 0, curr = num;
            while (store.contains(curr)) {
                streak++;
                curr++;
            }
            res = Math.max(res, streak);
        }
        return res;
    }
}
