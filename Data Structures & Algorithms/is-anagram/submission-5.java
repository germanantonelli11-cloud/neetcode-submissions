class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] sArray = new int[26];
        int[] tArray = new int[26];

        for(int i = 0; i < s.length(); i++) {
            char sLetter = s.charAt(i);
            char tLetter = t.charAt(i);
            sArray[sLetter - 'a']++;
            tArray[tLetter - 'a']++;
        }

        return Arrays.equals(sArray,tArray);
    }
}
