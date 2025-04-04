class Solution {
    public boolean isSubsequence(String s, String t) {
        int ptr1 = 0;
        for(int i=0; i<t.length() && ptr1<s.length();i++){
            if(t.charAt(i) == s.charAt(ptr1)){
                ptr1++;
            }
        }
        return ptr1 == s.length();
    }
}