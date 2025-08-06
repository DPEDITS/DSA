//LeetCode 238. Product of Array Except Self
// Title: Product of Array Except Self
// This problem is about calculating the product of all elements in an array except for the element at the current index, without using division and in O(n) time complexity.
//Example 1:
// Input: [1,2,3,4]
// Output: [24,12,8,6]
//Time Complexity: O(n)
//Space Complexity: O(n)
public class ProdOfArr {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] res = new int[n];
    
            res[0] = 1;
            for (int i = 1; i < n; i++) {
                res[i] = res[i - 1] * nums[i - 1];
            }
    
            int postfix = 1;
            for (int i = n - 1; i >= 0; i--) {
                res[i] *= postfix;
                postfix *= nums[i];
            }
            return res;
        }
    }
