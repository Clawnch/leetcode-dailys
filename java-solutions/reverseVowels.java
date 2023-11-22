class Solution {
    public String reverseVowels(String s) {
        Stack<Character> sVowel = new Stack<>();
        Set<Character> vowels = new HashSet<>();
        List<Integer> indexes = new ArrayList<>();
        String vowelList = "aeiouAEIOU";
        for (Character c : vowelList.toCharArray()) {
            vowels.add(c);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.contains(c)) {
                indexes.add(i);
                sVowel.push(c);
            }
        }
        char[] results = s.toCharArray();
        for (Integer i : indexes) {
            results[i] = sVowel.pop();
        }

        return new String(results);
    }
}
