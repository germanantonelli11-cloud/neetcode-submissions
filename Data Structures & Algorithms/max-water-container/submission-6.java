class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int currMaxWater = 0;
        int maxWater = 0;
        while(left < right) {
            if (heights[left] < heights[right]) {
                currMaxWater = heights[left] * (right - left);
                left++;
            } else if (heights[left] > heights[right]) {
                currMaxWater = heights[right] * (right - left);
                right--;
            } else {
                currMaxWater = heights[right] * (right - left);
                right--;
                left++;
            }
            maxWater = Math.max(maxWater, currMaxWater);
        }
        return maxWater;
    }
}
