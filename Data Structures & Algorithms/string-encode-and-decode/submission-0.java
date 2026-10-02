class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for (String s : strs) {
            //int slength = s.length();
            encoded += s.length() + "#" + s;
        }


        return encoded;
    }

    public List<String> decode(String str) {
        List<String> key = new ArrayList<>();
        int i = 0;
            while (i < str.length()) {
                int j = i;
                while(str.charAt(j) != '#') {
                    j++;
                    /*
                    int start = j + 1;
                    int end = start + str.length();
                    String word = encoded.substring(start, end);
                    key.add(word);
                    i = end;*/
                }
                int length = Integer.parseInt(str.substring(i,j));
                i = j + 1;
                String word = str.substring(i, i + length);
                key.add(word);
                i += length;
            }

        return key;
    }
}
