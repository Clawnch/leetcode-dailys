class Solution {
    public String sortVowels(String s) {
        //quick check for if a char is going to be a vowel
        String vowelString = "aeiouAEIOU";
        Set<Character> vowelSet = new HashSet<>();
    
        for (Character c : vowelString.toCharArray()) {
            vowelSet.add(c);
        }

        //keeping track of both the vowels and the locations instead of looping through s again
        int size = s.length();
        List<Integer> vowelLocations = new ArrayList<>();
        List<Character> vowels = new ArrayList<>();

        char[] result = new char[size];

        for (int i = 0; i < size; i++) {
            char current = s.charAt(i);
            result[i] = current;
            if (vowelSet.contains(current)) {
                vowelLocations.add(i);
                vowels.add(current);
            }
        }

        //Characters are automatically sorted by ASCII/Unicode value
        Collections.sort(vowels);

        //only go through the vowel locations and update those
        int index = 0;
        for (Integer i : vowelLocations) {
            result[i] = vowels.get(index);
            index++;
        }

        return new String(result);
    }
}
