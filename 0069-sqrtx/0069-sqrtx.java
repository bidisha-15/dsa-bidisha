class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        double assumed=x;
        double root=0.0;
        while(true){
          root=0.5*(assumed+(x/assumed));
          if(Math.abs(root-assumed)<1){
            break;
          }
          assumed=root;
        }
        return (int) root;
    }
}