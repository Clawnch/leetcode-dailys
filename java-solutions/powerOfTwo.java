class Solution {
    public boolean isPowerOfTwo(int n) {
        //return iter(n);
        //return recursive(n);
        return binaryString(n);
    }

    public boolean iter(int n) {
        if (n == 1) return true;
        if (n == 0) return false;
        while (n % 2 == 0) {
            n = n / 2;
            if (n == 1) return true;
        }
        return false;
    }

    public boolean recursive(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 2 == 0) return recursive(n/2);
        else return false;
    }

    public boolean binaryString(int n) {
        if (n == -2147483648) return false;
        String binary = Integer.toBinaryString(n);
        String part = binary.substring(1);
        return !part.contains("1") && binary.charAt(0) == '1';
    }
   
}
