class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] sArray = new int[26];
        int[] tArray = new int[26];

        for (int i = 0 ; i < s.length(); i++) {
            char sCurr = s.charAt(i);
            char tCurr = t.charAt(i);
            sArray[sCurr - 'a']++;
            tArray[tCurr - 'a']++;
        }

        return Arrays.equals(sArray, tArray);
    }
}
