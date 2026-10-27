class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] sArray = new int[26];
        int[] tArray = new int[26];

        for(int i = 0; i < s.length(); i++) {
            char currS = s.charAt(i);
            char currT = t.charAt(i);
            sArray[currS - 'a']++;
            tArray[currT - 'a']++;
        }

        return Arrays.equals(sArray, tArray);
    }
}
