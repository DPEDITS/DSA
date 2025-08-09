public class ContWithMostWater {
        public int maxArea(int[] heights) {
            int res = 0;
            for (int i = 0; i < heights.length; i++) {
                for (int j = i + 1; j < heights.length; j++) {
                    res = Math.max(res, Math.min(heights[i], heights[j]) * (j - i));
                }
            }
            return res;
        }
    }