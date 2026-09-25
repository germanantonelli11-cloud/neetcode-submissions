/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] twoSum;
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int complement = target - currentNum;
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(currentNum, i);
        }
        return new int[0];
    }
}*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] A = new int [nums.length] [2];
        for (int i = 0; i < nums.length; i++){
            A[i][0] = nums[i];
            A[i][1] = i;
        }
        
        Arrays.sort(A, Comparator.comparingInt(a -> a[0]));

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int currentNum = A[left][0] + A[right][0];
            int difference = target - currentNum;
            if (difference == 0) {
                return new int[] {Math.min(A[left][1], A[right][1]), Math.max(A[left][1], A[right][1])};
            } else if (difference > 0) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}