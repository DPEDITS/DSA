//Leetcode #242
// Title: Valid Anagram
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true
//Time Complexity: O(n+m) where n is the length of string s and m is the length of string t.
// Space Complexity: O(1) since the count array size is fixed at 26 for lowercase letters
//Technique used: Counting characters using an array.
//Hash Table using Array
public class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}