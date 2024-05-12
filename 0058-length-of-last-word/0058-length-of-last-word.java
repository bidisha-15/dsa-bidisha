class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
        
        int count=0;
        if(s.lastIndexOf(' ')==-1){
            count=s.trim().length();
        }
        else{
            count=s.trim().length()-s.trim().lastIndexOf(' ')-1;
        }     
         
    return count;
    }
}