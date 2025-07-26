class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nge=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.empty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.empty()){
                nge.put(nums2[i],-1);
            }
            else{
                nge.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        for(int i=nums1.length-1;i>=0;i--){
            nums1[i]=nge.get(nums1[i]);
        }
        return nums1;
    }
}