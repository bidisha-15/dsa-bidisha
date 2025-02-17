class Solution {
    public int hIndex(int[] citations) {
        int papers=citations.length;
        int c_bucket []=new int[papers+1];
        for (int i:citations){
            c_bucket[Math.min(i,papers)]++;
        }
        int cumulative=0;
        for(int hIndex=papers;hIndex>=0;hIndex--){
            cumulative+=c_bucket[hIndex];
            if(cumulative>=hIndex){
                return hIndex;
            }
        }
        return 0;
    }
}