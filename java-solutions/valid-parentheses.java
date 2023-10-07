class Solution {
    public boolean isValid(String s) {
        if (s.length() <= 1) return false;
        Stack<Character> bracketStacket = new Stack<>();
        char[] broken = s.toCharArray();
        for (char bracket : broken) {
            if ( bracket == '[' || bracket == '(' || bracket == '{' ) {
                bracketStacket.push(bracket);
            } else {
                if (bracketStacket.size() < 1) return false;
                char popped = bracketStacket.pop();
                if (popped == '[' && bracket != ']') {
                    return false;
                }
                if (popped == '{' && bracket != '}') {
                    return false;
                }
                if (popped == '(' && bracket != ')') {
                    return false;
                }
            }
        }

        if (bracketStacket.size() != 0) return false;
        return true; 
    }
}