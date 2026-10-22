class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxWater = 0;
        int currMaxWater = 0;
        while (left < right) {
            if (heights[left] < heights[right]) {
                maxWater = heights[left] * (right - left);
                left++;
            } else if (heights[left] > heights[right]) {
                maxWater = heights[right] * (right - left);
                right--;
            } else {
                maxWater = heights[right] * (right - left);
                left++;
            }

            currMaxWater = Math.max(currMaxWater, maxWater);
            

        }
    return currMaxWater;
    }
}
