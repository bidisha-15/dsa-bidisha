class Solution {
    public int hammingDistance(int x, int y) {
        
        int c=0;
        int xor = x ^ y; //1's positions have to be changed
        while(xor > 0){
            if((xor&1) ==1)
            c++;
            xor = xor >> 1;
        }
        return c;
    }
}
