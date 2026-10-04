class Solution {
    public boolean isPalindrome(String s) {
        String lowercaseS = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        for (int i = 0; i < s.length(); i++) { 
            while (start < end) {
                if (!Character.isLetterOrDigit(lowercaseS.charAt(start))) {
                    start++;
                } else if (!Character.isLetterOrDigit(lowercaseS.charAt(end))) {
                    end--;
                } else if (lowercaseS.charAt(start) == lowercaseS.charAt(end))   {
                    start++;
                    end--;
                    
                } else {
                    if (lowercaseS.charAt(start) != lowercaseS.charAt(end)) {                       return false;
                    } else { 
                        return true;
                    }
                }
            }
        return true;
        }
    return false;
    }
}
