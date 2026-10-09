//import java.util.HashMap;


class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if(map.containsKey(currentNum)) {
                return true;
            }
            map.put(currentNum, 1);

        }
    return false;
    }
}