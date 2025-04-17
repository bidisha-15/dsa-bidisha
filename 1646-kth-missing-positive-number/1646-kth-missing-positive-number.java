class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0; int high=arr.length-1;
        int missing=0; int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            missing = arr[mid]-(mid+1); //curr ele - (index + 1) -> is the no. of missing numbers
            if(missing < k)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high + 1 + k; //low+k; //*
    }
}

//* answer was -arr[high]+more
// where more=k-missing
// => arr[high] + k - {arr[high]-(high+1)}
// => arr[high] + k - arr[high] - high + 1 
// => high + k + 1