//Leetcode Problem #347
// Title: Top K Frequent Elements
//// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
// Example 1:
// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]
// Time Complexity: O(n) where n is the length of the input array nums.
// Space Complexity: O(n) for the hashmap used to store the frequency of each number.
// Explanation: The algorithm counts the frequency of each number using a hashmap, then uses an array of lists to group numbers by their frequency. Finally, it collects the top k frequent elements from the lists.
// Technique Used: Bucket Sort using an array of lists to group numbers by their frequency.
import java.util.*;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        @SuppressWarnings("unchecked")
        List<Integer>[] freq = (List<Integer>[]) new ArrayList[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;

        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }

        return res;
    }
}
