class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, length = 0, maxLength = 0;
        Set<Character> seen = new HashSet<>();
        //int length = 0;
        while(r < s.length()) {
            char curr = s.charAt(r);
            while (seen.contains(curr)) {
                seen.remove(s.charAt(l));
                l++;
            }

            seen.add(curr);

            length = r - l + 1;
            maxLength = Math.max(maxLength, length);
            r++;
        }
        return maxLength;
    }
}