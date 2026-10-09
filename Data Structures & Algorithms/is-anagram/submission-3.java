class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] sArray = new int[26];
        int[] tArray = new int[26];

        for(int i = 0; i < s.length(); i++) {
            char currLettS = s.charAt(i);
            char currLettT = t.charAt(i);
            sArray[currLettS - 'a']++;
            tArray[currLettT - 'a']++;
        }

        return Arrays.equals(sArray, tArray);
    }
}
