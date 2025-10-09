class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0, candidates, target, res, new ArrayList<>());
        return res;
    }

    void findCombination(int ind, int[] arr, int tgt, List<List<Integer>> res, List<Integer> ds){
        if(tgt==0){
            res.add(new ArrayList<>(ds));
            return;
        }

        for(int i=ind; i<arr.length; i++){
            if(i>ind && arr[i]==arr[i-1])
                continue;
            if(arr[i]>tgt)
                break;

            ds.add(arr[i]);
            findCombination(i+1, arr,tgt-arr[i], res, ds);
            ds.remove(ds.size()-1);
        }
    }
}