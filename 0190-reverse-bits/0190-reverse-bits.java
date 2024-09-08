public class Solution {
    // Treat n as an unsigned value
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32; i++) { // There are 32 bits in an integer
            rev <<= 1; // Shift rev to the left
            rev |= (n & 1); // Add the last bit of n to rev
            n >>= 1; // Shift n to the right
        }
        return rev;
    }
}