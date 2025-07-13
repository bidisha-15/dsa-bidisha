class Solution {
    public char findTheDifference(String s, String t) {
        char [] sarr = s.toCharArray();
        char [] tarr = t.toCharArray();
        char [] c = new char[sarr.length*2+1];
        System.arraycopy(sarr, 0, c, 0, sarr.length);
        System.arraycopy(tarr, 0, c, sarr.length, tarr.length);
        char ans=0;
        for(char n:c){
            ans ^= n;
        }
        return ans;
    }
}