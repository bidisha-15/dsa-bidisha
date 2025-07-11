class Solution {
    public int minBitFlips(int start, int goal) {
        int c=0;
        int xor = start ^ goal; //1's positions have to be changed
        while(xor > 0){
            if((xor&1) ==1)
            c++;
            xor = xor >> 1;
        }
        return c;
    }
}