class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt=1; int x=-1;
        List <Integer> ele=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        if(nums.length==1){
            ele.add(nums[0]);
            return ele;
        }
        if(nums.length==2)
        {
            ele.add(nums[0]);
            if(nums[0]!=nums[1]){
            ele.add(nums[1]);
            }
            return ele;
        }        

        for(int i=0;i<nums.length-(n/3);){
            if(nums[i]==nums[i+(n/3)]){
                if(ele.isEmpty() || ele.get(x)!=nums[i]){
                    ele.add(nums[i]);
                    x++;
                    }
                i=i+(n/3)+1;
            }
            else{
                i++;
            }
        }
        return ele;
    }
}