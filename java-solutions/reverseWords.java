class Solution {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        String result = "";
        List<String> words = new ArrayList<>();
        for (String w : split) {
            if (!w.equals("")) words.add(w);
        }
        for (int i = words.size() - 1; i > 0; i--) {
            result += words.get(i) + " ";
        }
        result += words.get(0);

        System.out.println(words);

        return result;
    }
}