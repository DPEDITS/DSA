//LeetCode Problem:125 Valid Palindrome
// Title: Valid Palindrome
// This problem is about determining if a given string is a valid palindrome, considering only alphanumeric characters and ignoring case.
//Example 1:
//Input: s = "Was it a car or a cat I saw?"
//Output: true
//Time Complexity: O(n) where n is the length of the input string.
//Space Complexity: O(n) for storing the filtered characters in a StringBuilder.
public class ValidPalindrome {

        public boolean isPalindrome(String s) {
            StringBuilder newStr = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    newStr.append(Character.toLowerCase(c));
                }
            }
            return newStr.toString().equals(newStr.reverse().toString());
        }
    }

