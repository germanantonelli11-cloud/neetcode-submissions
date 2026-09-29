class Solution{
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        s = s.toLowerCase();
        t = t.toLowerCase();

        int[] sArray = new int[26];
        int[] tArray = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char currentLetter = s.charAt(i);
            char currentLetterT = t.charAt(i);
            sArray[currentLetter - 'a']++;
            tArray[currentLetterT -'a']++;
        }
        return Arrays.equals(sArray,tArray);
    }
}
/*
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i),0) + 1);
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i),0) + 1);
        }
        return mapS.equals(mapT);
    }
}
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
}*/


