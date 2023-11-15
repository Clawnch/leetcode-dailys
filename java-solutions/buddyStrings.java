class Solution {
    public boolean buddyStrings(String s, String goal) {
        //Checks for starting edge cases. If s and goal and not same length, false
        //If s is 1, there can't be a swap. return false
        if (s.length() == 1 || (s.length() != goal.length())) return false;

        //If they are equal, there need to be at least 2 of one character to swap without modifying the string
        if (s.equals(goal)) {
            Set<Character> charTracker = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                if (charTracker.contains(s.charAt(i))) return true;
                charTracker.add(s.charAt(i));
            }
            return false;
        }
        
        char misMatch = '1';
        char misMatchG = '1';
        int swaps = 0;

        //Checks to make sure the swaps are valid. Loops through the string finding the misMatches
        //logs them, and checks against what's expected'
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                swaps++;
                if (misMatch == '1') {
                    misMatch = s.charAt(i);
                    misMatchG = goal.charAt(i);

                } else {
                    if (misMatch != goal.charAt(i)) return false;
                    if (misMatchG != s.charAt(i)) return false;
                }
            }
        }

        //Returns true if there is a swap. This is for the edge case of there only being one character different and no swap 
        return swaps == 2;
    }
}
