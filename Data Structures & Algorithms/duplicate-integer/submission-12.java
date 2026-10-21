class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i <nums.length; i++ ) {
            int curr = nums[i];
            if(map.containsKey(curr)) {
                return true;
            }
            map.put(curr, 1);
        }
        return false;
    }
}