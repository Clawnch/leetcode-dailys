class Solution {
    public double myPow(double x, int n) {
        return myLogPow(x,(long)n);
    }

    public double myLogPow(double x, long n) {
        if (n == 0) return 1;
        if (n < 0) return 1 / myLogPow(x, -1 * n);
        if (n % 2 == 1) return x * myLogPow(x, (n - 1));
        return myLogPow(x * x, n / 2);
    }
}
