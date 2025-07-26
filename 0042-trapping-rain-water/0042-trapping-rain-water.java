class Solution {
    public int trap(int[] height) {
        int total=0;
        int n=height.length;
        int[] leftMax=prefixMax(height,n);
        int[] rightMax=suffixMax(height,n);
        for(int i=0;i<n;i++){
            int currentLeftMax = leftMax[i];
            int currentRightMax = rightMax[i];
            total += Math.max(0, Math.min(currentLeftMax, currentRightMax) - height[i]);
        }
         return total;
        }
    int[] prefixMax(int[] height, int n){
        int prefix[]=new int[n];
        prefix[0]=height[0];
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],height[i]);
        }
        return prefix;
    }
    int[] suffixMax(int[] height, int n){
        int suffix[]=new int[n];
        suffix[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],height[i]);
        }
        return suffix;
    }
}