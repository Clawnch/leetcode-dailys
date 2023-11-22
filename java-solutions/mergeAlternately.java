class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = word1.length(), w2 = word2.length();
        
        String result = "";
        int w1I = 0, w2I = 0;
        while (w1I < w1 || w2I < w2) {
            if (w1I < w1) result += word1.charAt(w1I++);
            if (w2I < w2) result += word2.charAt(w2I++);
        }

        return result;
    }
}
