class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] array = new int[26];

        for(int i = 0; i < s.length(); i++) {
            char letterS = s.charAt(i);
            char letterT = t.charAt(i);
            array[letterS - 'a']++;
            array[letterT - 'a']--;
        }

        for(int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                return false;
            }
            
        }
        return true;
    }
}
