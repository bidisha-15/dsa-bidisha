int majorityElement(int* nums, int numsSize) {
    int c = 1;
    int n = numsSize;
    int ele=nums[0];
    for (int i=1;i<n;i++){
        if(nums[i]==ele){
            c++;
        }
        else{
            c--;
            if(c==0)
            {
                ele=nums[i+1];
            }
        }
    }
    return ele;
}



