class Solution {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int lMax = 0;
        int rMax = 0;
        int trappedWater = 0;
        while (start < end) {
            if(height[start] < height[end]) {
                lMax = Math.max(lMax, height[start]);
                trappedWater += lMax - height[start];
                start++;
            } else if(height[start] > height[end]) {
                rMax = Math.max(rMax, height[end]);
                trappedWater += rMax - height[end];
                end--;
            } else {
                rMax = Math.max(rMax, height[end]);
                trappedWater += rMax - height[end];
                end--;
            }
        }
        return trappedWater;
    }
}
