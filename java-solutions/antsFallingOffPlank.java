class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int farLeft = n + 1, farRight = -1;
        for (int i = 0; i < left.length; i++) {
            farRight = Math.max(left[i], farRight);
        }
        for (int i = right.length -1; i >= 0; i--) {
            farLeft = Math.min(right[i], farLeft);
        }

        int rightDist = n - farLeft;

        return Math.max(rightDist, farRight);
    }
}