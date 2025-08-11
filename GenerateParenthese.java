//LeetCode 22. Generate Parentheses
// https://leetcode.com/problems/generate-parentheses/
// Time Complexity: O(4^n / sqrt(n))
// Space Complexity: O(4^n / sqrt(n))
// Input: n = 3
// Output: ["((()))","(()())","(())()","()(())","()()()"]
//Explanation: There are 5 valid combinations of 3 pairs of parentheses.
// The code uses dynamic programming to generate all combinations of valid parentheses.
import java.util.*;

public class GenerateParenthese {
    public List<String> generateParenthesis(int n) {
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            res.add(new ArrayList<>());
        }
        res.get(0).add("");

        for (int k = 0; k <= n; k++) {
            for (int i = 0; i < k; i++) {
                for (String left : res.get(i)) {
                    for (String right : res.get(k - i - 1)) {
                        res.get(k).add("(" + left + ")" + right);
                    }
                }
            }
        }

        return res.get(n);
    }

}
