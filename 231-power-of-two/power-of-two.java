class Solution {
    public boolean isPowerOfTwo(int n) {
         if (n <= 0) {
            return false; // Powers of 2 are positive
        }
        while (n % 2 == 0) { // Keep dividing n by 2 as long as it is divisible
            n /= 2;
        }
        return n == 1; // If we reach 1, it's a power of two
    }
}