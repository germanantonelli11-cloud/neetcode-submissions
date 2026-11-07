class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if(seen.contains(curr)) {
                return true;
            }
            seen.add(curr);
        }
        return false;
    }
}