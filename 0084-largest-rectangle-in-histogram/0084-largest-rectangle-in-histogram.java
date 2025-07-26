class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st= new Stack<>();
        int maxArea=0;
        int n=heights.length;
        for(int i=0;i<n;i++){
            int currHeight = (i == n) ? 0 : heights[i];
            while(!st.empty() && heights[st.peek()]>currHeight){
                int ele=st.pop();
                int nse=i;
                int pse=st.empty()?-1:st.peek();
                maxArea=Math.max(heights[ele]*(nse-pse-1), maxArea);
            }
            st.push(i);
        }
        while(!st.empty()){
            int nse=heights.length;
            int ele=st.pop();
            int pse=st.empty()?-1:st.peek();
            maxArea=Math.max(heights[ele]*(nse-pse-1), maxArea);
        }
        return maxArea;
    }
}