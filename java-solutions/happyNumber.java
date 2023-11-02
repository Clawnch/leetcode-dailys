class Solution {
    public boolean isHappy(int n) {
        String number = n + "";
        int sum = n;
        Set<Integer> intSet = new HashSet<>();
        while (sum != 1) {
            int tempSum = 0;
            for (char c : number.toCharArray()) {
                int tempint = Character.getNumericValue(c);
                tempSum += Math.pow(tempint, 2);
            }
            if (intSet.contains(tempSum)) return false;
            intSet.add(tempSum);
            sum = tempSum;
            number = sum + "";
        }
        return sum == 1;
    }
}