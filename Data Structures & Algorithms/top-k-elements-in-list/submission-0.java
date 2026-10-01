class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> res = new HashMap<>();
        int[] array = new int[nums.length];
        for (int num : nums) {
            res.put(num, res.getOrDefault(num, 0) + 1);
        }

        List<Integer> bucket[] = new ArrayList[nums.length + 1];

        for(int key : res.keySet()) {
            int frequency = res.get(key);
            if(bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
    
        int result[] = new int[k];
        int index = 0;
        for(int i = bucket.length - 1; i >= 0; i--) {
            if(bucket[i] != null){
                for(int val : bucket[i]) {
                    result[index++] = val;
                    if (index == k) {
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
 /*
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for( char c: s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}*/