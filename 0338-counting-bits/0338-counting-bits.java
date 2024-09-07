class Solution {
        int count_ones(int n) {
        String bin=Integer.toBinaryString(n);
        int c=0;
        for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i)=='1')
                c++;
        }
        return c;
    }
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            ans[i]=count_ones(i);
        }
        return ans;
    }
}