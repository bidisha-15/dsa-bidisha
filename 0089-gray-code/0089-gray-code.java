class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<(1<<n);i++){
            res.add(i^(i/2));
        }
        return res;
    }
}