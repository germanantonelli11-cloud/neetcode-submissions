class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int consecutive = 1;
        //int current = 1;
        int nextInSequence = 0;
        if (nums.length == 0) {
            consecutive = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            nextInSequence = nums[i];
        }
        for (int num : nums) {
 
            if (!map.containsKey(num - 1)) {
                int current = 1;
                nextInSequence = num;
                while (map.containsKey(nextInSequence + 1)){
                    nextInSequence++;
                    current++;
                    if (consecutive < current) {
                        consecutive = current;
                    }
                } 
            }
        }
    return consecutive;
    }
}
