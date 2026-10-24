class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> group = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String label = String.valueOf(charArray);
            if(!map.containsKey(label)) {
                map.put(label, new ArrayList<>());
            }
            map.get(label).add(str);
        }
        group.addAll(map.values());
        return group;
    }
    
}
