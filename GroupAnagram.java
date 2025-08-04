//// LeetCode 49. Group Anagrams
/// / Given an array of strings strs, group the anagrams together. You can return the answer in any order.
// An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
// Example 1:
// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
// Time Complexity: O(m * n) // where m is the number of strings in the input array and n is the maximum length of a string.
// Space Complexity: O(m * n) // for the hashmap storing the grouped anagrams
import java.util.*;
public class GroupAnagram {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> res = new HashMap<>();
            for (String s : strs) {
                int[] count = new int[26];
                for (char c : s.toCharArray()) { // Count frequency of each character
                    count[c - 'a']++; // Convert character to index (0-25)
                }
                String key = Arrays.toString(count); // Convert the count array to a string to use as a key
                res.putIfAbsent(key, new ArrayList<>()); // Initialize the list if the key is not present
                res.get(key).add(s); // Add the string to the corresponding list in the map //Example: "eat" and "tea" and "ate" will have the same key
            }/*{"aet": ["eat", "tea"]}*/
            return new ArrayList<>(res.values());
        }
}