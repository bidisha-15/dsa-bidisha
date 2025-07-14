class Solution {
    public int countPrimes(int n) {
        boolean sieve[]=new boolean[n+1];
        if(n<2){
            return 0;
        }
        for(int i=2;i*i<=n;i++){
            if(!sieve[i]){
                for(int j=i*i;j<n;j+=i){
                    sieve[j]=true;
                }
            }
        }
        int cnt=0;
        for(int i=2;i<n;i++){
            if(!sieve[i]){
                cnt++;
            }
        }
        return cnt;
    }
}