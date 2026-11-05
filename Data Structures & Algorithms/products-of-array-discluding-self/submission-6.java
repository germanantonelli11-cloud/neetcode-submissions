class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int[] leftSide = new int[nums.length];
        int[] rightSide = new int[nums.length];
        int leftTotal = 1, rightTotal = 1;
        
        for(int i = 0; i < nums.length; i++) {
            leftSide[i] = leftTotal;
            leftTotal *= nums[i];
        }

        for(int i = nums.length - 1; i >= 0; i--) {
            rightSide[i] = rightTotal;
            rightTotal *= nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            output[i] = rightSide[i] * leftSide[i];
        }

        return output;
    }
}  
