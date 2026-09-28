class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<String, String> count = new HashMap<>();
        s = s.toLowerCase();
        t = t.toLowerCase();
        int[] sArray = new int[26];
        int[] tArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char currentLetter = s.charAt(i);
            sArray[currentLetter - 'a']++;
        }

        for (int j = 0; j < t.length(); j++) {
            char currentLetter1 = t.charAt(j);
            tArray[currentLetter1 - 'a']++;
        }   
        if (Arrays.equals(tArray,sArray)) {
            return true;
        }
        return false;
    }
}
