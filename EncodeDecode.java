//// LeetCode Problem: 271. Encode and Decode Strings
/// / Title: Encode and Decode Strings
/// // Design an algorithm to encode a list of strings to a single string. The encoded string is then sent over the network and is decoded back to the original list of strings.
/// // Implement the encode and decode methods.
// // Example 1:
// // Input: ["lint","code","love","you"]
// // Output: "4#lint4#code4#love3#you"
// // Explanation: The encoded string is "4#lint4#code4#love3#you", where each string is prefixed by its length followed by a '#' character.

import java.util.*;
public class EncodeDecode {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            res.add(str.substring(i, j));
            i = j;
        }
        return res;
    }
}