class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0, j=0;j<n;i++){
            if(nums1[i]==0){
                nums1[i]=nums2[j++];
            }
            else if(nums1[i]>nums2[j]){
                int temp=nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=temp;
            }
        }
        Arrays.sort(nums1);
    }
}