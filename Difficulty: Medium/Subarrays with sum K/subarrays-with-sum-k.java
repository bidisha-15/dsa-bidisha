class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        Map <Integer, Integer> m=new HashMap<>();
        int preSum=0; int cnt=0;
        m.put(0,1);
        for(int i=0;i<arr.length;i++){
            preSum+=arr[i];
            if(m.containsKey(preSum-k)){
                cnt += m.get(preSum - k);
            }
            m.put(preSum, m.getOrDefault(preSum, 0) + 1);
        }
    return cnt;
    }
}
