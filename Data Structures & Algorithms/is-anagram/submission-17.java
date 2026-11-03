class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] array = new int[26];

        for(int i = 0; i < s.length(); i++) {
            char sLetter = s.charAt(i);
            char tLetter = t.charAt(i);
            array[sLetter - 'a']++;
            array[tLetter - 'a']--;
        }

        for(int i = 0; i < array.length; i++) {
            if(array[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
