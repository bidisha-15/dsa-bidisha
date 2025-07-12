class Solution {
    public double myPow(double x, long n) {
        double res=1;
        boolean sign=false;
        if(n<0){
            n=-n;
            sign=true;
        }
        while(n>0){
            if((n&1)==1){
                res = res*x;
            }
            x*=x;
            n= n >> 1;
        }
        if(sign){
            return (1/res);
        }
        return res;
    }
}