class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)
        {
            return 1;
        }
        int occBits=(int)(Math.log(n)/Math.log(2))+1;
        int x=(int)Math.pow(2,occBits)-1;
        int ans=x-n;
        return ans;
    }
}